package com.project1.lovable_clone.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {

}
