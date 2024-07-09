package com.eromosele.worldbankingapplication.service;

import com.eromosele.worldbankingapplication.payload.request.LoginRequest;
import com.eromosele.worldbankingapplication.payload.request.UserRequest;
import com.eromosele.worldbankingapplication.payload.response.ApiResponse;
import com.eromosele.worldbankingapplication.payload.response.BankResponse;
import com.eromosele.worldbankingapplication.payload.response.JwtAuthResponse;
import org.springframework.http.ResponseEntity;
//When building a app, any features that has to do about authentication should be done in the authentication class
public interface AuthService {
    BankResponse registerUser(UserRequest userRequest);
    ResponseEntity<ApiResponse<JwtAuthResponse>> loginUser(LoginRequest loginRequest);
}
