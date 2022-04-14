package Dto;

import lombok.Getter;

import javax.persistence.Column;

@Getter
public class PersonalDto {
    private Long memNum;
    private String id;
    private String pwd;
    private String nickName;
    private Integer grade;
    private String address;
    private Integer phoneNum;
    private Byte[] profileImage;
    private String favorite1;
    private String favorite2;
}

