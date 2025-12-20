package com.project1.lovable_clone.mapper;

import com.project1.lovable_clone.dto.auth.SignupRequest;
import com.project1.lovable_clone.dto.auth.UserProfileResponse;
import com.project1.lovable_clone.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequest signupRequest);

    UserProfileResponse toUserProfileResponse(User user);

}
