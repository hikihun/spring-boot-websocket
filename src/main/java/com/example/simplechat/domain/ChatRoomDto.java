package com.example.simplechat.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.socket.WebSocketSession;


@Getter
@Setter
public class ChatRoomDto {

    private String roomId;
    private String name;

    public static ChatRoomDto create(String name) {
        ChatRoomDto room = new ChatRoomDto();
        room.roomId = UUID.randomUUID().toString();
        room.name = name;
        return room;
    }

}
