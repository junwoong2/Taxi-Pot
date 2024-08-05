package com.graduation.taxipot.user.Dto;

import lombok.*;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Chat {
    public enum MessageType{
        ENTER, TALK, LEAVE;  // ENTER = 입장, LEAVE = 퇴장, TALK = 해당 채팅방 구독하는 모든 사람들에게 전달
    }

    private MessageType type; // 메세지 타입
    private String message; // 메세지
    private String time; // 채팅 시간
    private String roomId; // 방 번호
    private String sender; // 채팅 보낸 사람
}
