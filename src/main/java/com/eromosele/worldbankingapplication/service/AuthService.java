package com.eromosele.worldbankingapplication.service;

import com.eromosele.worldbankingapplication.payload.request.UserRequest;
import com.eromosele.worldbankingapplication.payload.response.BankResponse;

public interface AuthService {
    BankResponse registerUser(UserRequest userRequest);
}
