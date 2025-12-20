package com.project1.lovable_clone.entity;

import com.project1.lovable_clone.entity.Project;

import java.time.Instant;

public class UsageLog {

    Long id;
    User user;
    Project project;

    String action;

    Integer tokensUsed;
    Integer durationMs;

    String metaData; // JSON of {model_used, prompt_used},

    Instant createdAt;
}
