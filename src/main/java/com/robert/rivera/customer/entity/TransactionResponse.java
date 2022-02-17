package com.robert.rivera.customer.entity;

import lombok.*;


@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TransactionResponse  {
    private Integer customerNumber;
    private String transactionStatusCode;
    private String transactionStatusDescription;
}
