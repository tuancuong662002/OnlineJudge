package org.example.backend.dto;

public class LoginRequest {
    private String username;
    private String password;  // đặt đúng tên field JSON bạn gửi

    // getters/setters
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}