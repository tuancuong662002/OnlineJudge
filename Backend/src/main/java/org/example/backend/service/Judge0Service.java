package org.example.backend.service;


import org.example.backend.dto.Judge0Response;
import org.example.backend.dto.Judge0Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.HttpHeaders;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;



@Service
public class Judge0Service {

    private static final String JUDGE0_URL = "https://ce.judge0.com/submissions?base64_encoded=true&wait=true";

    private final RestTemplate restTemplate;

    @Autowired
    public Judge0Service(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String submitCode(int language_id , String code, String input) {
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

        String encodedCode = Base64.getEncoder().encodeToString(code.getBytes(StandardCharsets.UTF_8));
        String encodedStdin = Base64.getEncoder().encodeToString(input.getBytes(StandardCharsets.UTF_8));

        Map<String, Object> body = new HashMap<>();
        body.put("source_code", encodedCode);
        body.put("language_id", language_id);
        body.put("stdin", encodedStdin);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON); // ✅ KHÔNG thêm X-RapidAPI-Host

        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(body, headers);

        try {
            ResponseEntity<Judge0Response> response = restTemplate.postForEntity(JUDGE0_URL, entity, Judge0Response.class);
            return response.getBody().getToken();
        } catch (Exception e) {
            return "Error calling Judge0: " + e.getMessage();
        }
    }

    public String getSubmissResult(String token) {
        String url = "https://ce.judge0.com/submissions/" + token + "?base64_encoded=false&fields=stdout,stderr,status_id,language_id";

        HttpHeaders headers = new HttpHeaders(); // ✅ Không cần headers nếu dùng bản public

        HttpEntity<Void> entity = new HttpEntity<>(headers);

        try {
            ResponseEntity<Judge0Result> results = restTemplate.exchange(url, HttpMethod.GET, entity, Judge0Result.class);
            return results.getBody().getStdout();
        } catch (Exception e) {
            return "Error calling Judge0: " + e.getMessage();
        }
    }
}
