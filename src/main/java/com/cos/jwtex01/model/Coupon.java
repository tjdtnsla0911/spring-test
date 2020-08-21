package com.cos.jwtex01.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Coupon {
private int id;
private int userId;
private String code;
private Date validityStart;
private Date validityEnd;
private boolean availability;
}
