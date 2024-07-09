package com.eromosele.worldbankingapplication.infrastructure.controller;

import com.eromosele.worldbankingapplication.payload.request.LoginRequest;
import com.eromosele.worldbankingapplication.payload.request.UserRequest;
import com.eromosele.worldbankingapplication.payload.response.ApiResponse;
import com.eromosele.worldbankingapplication.payload.response.BankResponse;
import com.eromosele.worldbankingapplication.payload.response.JwtAuthResponse;
import com.eromosele.worldbankingapplication.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor

public class AuthController {
    private final AuthService authService;

    @PostMapping("/register-user")
    public BankResponse createUserAccount(@Valid @RequestBody UserRequest userRequest){
        return authService.registerUser(userRequest);
    }

    @PostMapping("/login-user")
    public ResponseEntity<ApiResponse<JwtAuthResponse>> loginUser(@Valid @RequestBody LoginRequest loginRequest){
        return authService.loginUser(loginRequest);
    }

}
