package com.project1.lovable_clone.mapper;

import com.project1.lovable_clone.dto.chat.ChatResponse;
import com.project1.lovable_clone.entity.ChatMessage;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChatMapper {

    List<ChatResponse> fromListOfChatMessage(List<ChatMessage> chatMessageList);
}
