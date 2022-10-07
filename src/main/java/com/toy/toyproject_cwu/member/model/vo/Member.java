package com.toy.toyproject_cwu.member.model.vo;

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
public class Member {

    private int memberNo;
    private int status;
    private String id;
    private String pwd;
    private String phone;
    private String profile;
    private String cardId;
    private String email;

}
