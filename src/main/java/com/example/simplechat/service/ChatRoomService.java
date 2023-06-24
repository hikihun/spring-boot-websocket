package com.example.simplechat.service;

import com.example.simplechat.domain.ChatRoom;
import com.example.simplechat.repository.ChatRoomRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ChatRoomService {

    private final ChatRoomRepository chatRoomRepository;

    public List<ChatRoom> findAllRoom() {
        return chatRoomRepository.findAll();
    }

    public ChatRoom findById(Long roomId) {
        return chatRoomRepository.findById(roomId).get();
    }

    public ChatRoom createChatRoom(String name) {
        return chatRoomRepository.save(ChatRoom.create(name));
    }
}
