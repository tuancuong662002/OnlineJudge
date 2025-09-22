package org.example.backend.service;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import lombok.Value;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import org.springframework.core.env.Environment;
@Component
public class JwtUtil {
    private   String SECRET_KEY  ;
    private  Key key ;
    public JwtUtil(Environment env){
         this.SECRET_KEY = env.getProperty("jwt.secret");
         this.key  = Keys.hmacShaKeyFor(this.SECRET_KEY.getBytes());
    }
    private static final long EXPIRATION_TIME = 1000 * 60 * 60; // 1 giờ

    public  String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(key , SignatureAlgorithm.HS256)
                .compact();
    }

    public String extractUsername(String token) {
        return Jwts.parserBuilder().setSigningKey(key).build()
                .parseClaimsJws(token).getBody().getSubject();
    }

    public  boolean validateToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
            return true;
        } catch (JwtException e) {
            return false;
        }
    }
}
