package com.project1.lovable_clone.service;

import com.project1.lovable_clone.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
