package com.project1.lovable_clone.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public interface AiGenerationService {

     Flux<String> streamResponse();
}
