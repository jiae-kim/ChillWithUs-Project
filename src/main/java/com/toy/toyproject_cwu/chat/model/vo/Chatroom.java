package com.toy.toyproject_cwu.chat.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Chatroom {
    private int chatRoomNo;//채팅방 번호
    private int chatRoomSt;//채팅방 상태
    private int chatMemberSt;//회원상태
    private int memberNo;


}
