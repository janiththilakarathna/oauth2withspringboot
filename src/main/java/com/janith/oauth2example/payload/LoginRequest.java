package com.janith.oauth2example.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * Created by Janith Thilakarathna on 12/14/18
 */

@Data
public class LoginRequest {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;

}
