package com.eromosele.worldbankingapplication.payload.response;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountInfo {
    private String accountName;
    private BigDecimal accountBalance;
    private String accountNumber;
    private String bankName;
}
