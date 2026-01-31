package com.project1.lovable_clone.repository;

import com.project1.lovable_clone.entity.ChatSession;
import com.project1.lovable_clone.entity.ChatSessionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatSessionRepository extends JpaRepository<ChatSession, ChatSessionId> {
}
