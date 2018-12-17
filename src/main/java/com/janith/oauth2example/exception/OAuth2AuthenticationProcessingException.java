package com.janith.oauth2example.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * Created by Janith Thilakarathna on 12/14/18
 */
public class OAuth2AuthenticationProcessingException extends AuthenticationException {

    public OAuth2AuthenticationProcessingException(String msg, Throwable t) {
        super(msg, t);
    }

    public OAuth2AuthenticationProcessingException(String msg) {
        super(msg);
    }

}
