package com.eromosele.worldbankingapplication.infrastructure.controller;

import com.eromosele.worldbankingapplication.payload.request.UserRequest;
import com.eromosele.worldbankingapplication.payload.response.BankResponse;
import com.eromosele.worldbankingapplication.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
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

}
