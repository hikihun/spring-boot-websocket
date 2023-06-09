package com.example.simplechat.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessageDto {
    public enum MessageType {
        ENTER, TALK
    }

    private MessageType type;
    //채팅방 ID
    private Long roomId;
    //보내는 사람
    private String sender;
    //내용
    private String message;
}
