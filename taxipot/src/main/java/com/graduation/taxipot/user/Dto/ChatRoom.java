package com.graduation.taxipot.user.Dto;

import lombok.Data;
import java.util.HashMap;
import java.util.UUID;

@Data
public class ChatRoom {
    private String roomId; // 채팅방 아이디
    private String roomName; // 채팅방 이름
    private int userCount; // 채팅방 인원수
    private int maxUserCount; // 채팅방 최대 인원 수

    private String roomPwd; // 채팅방 삭제시 필요한 암호
    private boolean secretChk; //  채팅방 입장 잠금 여부 확인

    private HashMap<String, String> userlist = new HashMap<String, String>();

    public ChatRoom create(String roomName){
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.roomId = UUID.randomUUID().toString();
        chatRoom.roomName = roomName;

        return chatRoom;
    }
}
