package com.eromosele.worldbankingapplication.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtAuthResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String profilePicture;
    private String gender;
    private String accessToken;
    private String tokenType = "Bearer";
}
