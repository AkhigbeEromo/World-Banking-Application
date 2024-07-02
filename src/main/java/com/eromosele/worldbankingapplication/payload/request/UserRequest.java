package com.eromosele.worldbankingapplication.payload.request;

import com.eromosele.worldbankingapplication.domain.enums.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {
    @NotBlank(message = "First Name must not be blank")
    @Size(min = 2, max = 125, message = "First Name must be at least two characters long")
    private String firstName;
    private String lastName;
    private String otherName;
    private String email;
    private String password;
    private String gender;
    private String address;
    private String stateOfOrigin;
    private String phoneNumber;
    private String BVN;
    private String pin;
    private String accountNumber;

}
