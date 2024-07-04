package com.eromosele.worldbankingapplication.service;

import com.eromosele.worldbankingapplication.payload.request.LoginRequest;
import com.eromosele.worldbankingapplication.payload.request.UserRequest;
import com.eromosele.worldbankingapplication.payload.response.ApiResponse;
import com.eromosele.worldbankingapplication.payload.response.BankResponse;
import com.eromosele.worldbankingapplication.payload.response.JwtAuthResponse;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    BankResponse registerUser(UserRequest userRequest);
    ResponseEntity<ApiResponse<JwtAuthResponse>> loginUser(LoginRequest loginRequest);
}
