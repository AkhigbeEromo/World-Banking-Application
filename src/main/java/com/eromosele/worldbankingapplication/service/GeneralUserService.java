package com.eromosele.worldbankingapplication.service;

import com.eromosele.worldbankingapplication.payload.response.BankResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface GeneralUserService {
    ResponseEntity<BankResponse<String>>uploadProfilePics(Long id, MultipartFile multipartFile);
}
