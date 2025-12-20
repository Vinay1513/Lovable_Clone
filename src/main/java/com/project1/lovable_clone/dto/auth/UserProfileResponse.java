package com.project1.lovable_clone.dto.auth;

public record UserProfileResponse(
        Long id,
        String username,
        String name
) {
}
