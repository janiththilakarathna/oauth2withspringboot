package com.janith.oauth2example.payload;

import lombok.Data;

/**
 * Created by Janith Thilakarathna on 12/14/18
 */

@Data
public class AuthResponse {

    private String accessToken;
    private String tokenType = "Bearer";

    public AuthResponse(String accessToken) {
        this.accessToken = accessToken;
    }

}
