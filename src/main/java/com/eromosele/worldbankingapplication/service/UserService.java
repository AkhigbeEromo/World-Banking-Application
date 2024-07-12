package com.eromosele.worldbankingapplication.service;

import com.eromosele.worldbankingapplication.payload.request.CreditAndDebitRequest;
import com.eromosele.worldbankingapplication.payload.request.EnquiryRequest;
import com.eromosele.worldbankingapplication.payload.request.TransferRequest;
import com.eromosele.worldbankingapplication.payload.response.BankResponse;

public interface UserService {
    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);
    String nameEnquiry(EnquiryRequest enquiryRequest);
    BankResponse creditAccount(CreditAndDebitRequest creditAndDebitRequest);
    BankResponse debitAccount(CreditAndDebitRequest creditAndDebitRequest);
    BankResponse transfer(TransferRequest request);
}
