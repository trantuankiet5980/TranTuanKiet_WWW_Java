package com.jsp.week01_lab_trantuankiet_21011961.dtos;

import lombok.*;

import java.io.Serializable;
import java.time.Instant;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LogDto implements Serializable {
    Long id;
    String accountId;
    Instant loginTime;
    Instant logoutTime;
    String notes;
}