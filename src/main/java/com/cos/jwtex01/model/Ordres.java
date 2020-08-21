package com.cos.jwtex01.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ordres {
private int id;
private int userId;
private Timestamp orderDate;
private int totalPrice;
private String howToPay;
}
