package com.eromosele.worldbankingapplication.service;

import com.eromosele.worldbankingapplication.payload.request.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
