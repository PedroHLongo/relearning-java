package com.spring_boot_03.spring_boot_03.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    boolean authenticate(final String username, final String password) {
        final String validUsername = "Pedro";
        final String validPassword = "veryStrongPassword";

        final boolean isValidUsername = validUsername.equals(username);
        final boolean isValidPassword = validPassword.equals(password);

        return isValidUsername && isValidPassword;

    }
}
