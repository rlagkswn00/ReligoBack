package com.umcreligo.umcback.domain.church.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SignUpChurchTrialParam {
    private Long userId;
    private Long churchId;
    private String name;
    private String phoneNum;
    private String message;
    private LocalDateTime scheduledDateTime;
}
