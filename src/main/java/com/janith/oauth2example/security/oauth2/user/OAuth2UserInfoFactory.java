package com.janith.oauth2example.security.oauth2.user;

import com.janith.oauth2example.exception.OAuth2AuthenticationProcessingException;
import com.janith.oauth2example.model.AuthProvider;

import java.util.Map;

/**
 * Created by Janith Thilakarathna on 12/14/18
 */
public class OAuth2UserInfoFactory {

    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if (registrationId.equalsIgnoreCase(AuthProvider.github.toString())) {
            return new GithubOAuth2UserInfo(attributes);
        } else {
            throw new OAuth2AuthenticationProcessingException("Sorry! Login with " + registrationId + " is not supported yet.");
        }
    }

}
