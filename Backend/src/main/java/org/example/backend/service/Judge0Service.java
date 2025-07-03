package org.example.backend.service;

import org.example.backend.dto.Judge0Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@Service
public class Judge0Service {

    private static final String JUDGE0_URL = "https://judge0-ce.p.rapidapi.com/submissions?base64_encoded=true&wait=true&fields=*";
    private static final String API_KEY = "dee59d81cbmsha720821aa9a7b2fp13ada8jsnc206d69a28eb"; // 🔐 Bạn cần thay thế key thật vào đây
    private static final String API_HOST = "judge0-ce.p.rapidapi.com";
    private final RestTemplate restTemplate;

    @Autowired // Annotation để Spring tự động tiêm bean vào
    public Judge0Service(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public String submitCode(String code, String input) {
        RestTemplate restTemplate = new RestTemplate();

        // ✅ Thêm JSON converter vào RestTemplate
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

        String encodedCode = Base64.getEncoder().encodeToString(code.getBytes(StandardCharsets.UTF_8));
        String encodedStdin = Base64.getEncoder().encodeToString(input.getBytes(StandardCharsets.UTF_8));

        Map<String, Object> body = new HashMap<>();
        body.put("source_code", encodedCode);
        body.put("language_id", 63); // JavaScript
        body.put("stdin", encodedStdin);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("X-RapidAPI-Key", API_KEY);
        headers.set("X-RapidAPI-Host", API_HOST);

        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(body, headers);

        try {
            System.out.println(">>> source  entity : " + entity); // log kiểm tra
            ResponseEntity<String> response = restTemplate.postForEntity(JUDGE0_URL, entity, String.class);
            return response.getBody(); // token JSON
        } catch (Exception e) {
            return "Error calling Judge0: " + e.getMessage();
        }
    }
}
