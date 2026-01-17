package com.project1.lovable_clone.controller;

import com.project1.lovable_clone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ChatContoller {
    private final UserService userService;

}
