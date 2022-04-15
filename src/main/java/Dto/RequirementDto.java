package Dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class RequirementDto {
    private Long requireNum;
    private Long memNum;
    private Long cafeNum;
    private LocalDateTime requireTime;
    private String requireReason;
}
