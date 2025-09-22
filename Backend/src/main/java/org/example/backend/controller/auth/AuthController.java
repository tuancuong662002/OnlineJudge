package org.example.backend.controller.auth;

import org.example.backend.dto.LoginRequest;
import org.example.backend.service.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final JwtUtil jwtUtil ;
    public  AuthController(JwtUtil jwtUtil) {
         this.jwtUtil = jwtUtil;
    }
    @PostMapping("/login")
    public String login (@RequestBody LoginRequest request) {
        System.out.println(">>>>>request : " + request.getUsername());
        if(request.getUsername().equals("admin") && request.getPassword().equals("123")) {
            return jwtUtil.generateToken(request.getUsername());
        }
        throw new RuntimeException("Invalid credentials");
    }
}
