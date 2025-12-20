package com.project1.lovable_clone.security;

import com.project1.lovable_clone.entity.User;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

@Component
public class AuthUtil {

    @Value("${jwt-secret-key}")
    private String jwtSecreteKey;


    private SecretKey getSecretKey() {
        return Keys.hmacShaKeyFor(jwtSecreteKey.getBytes(StandardCharsets.UTF_8));
    };


    public String getAccessToken(User user) {
        return Jwts.builder().subject(user.getUsername())
                .claim("userId", user.getId().toString())
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() ))


    }


}
