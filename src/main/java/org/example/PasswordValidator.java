package org.example;

public class PasswordValidator {
    public static boolean validatePassword(String password) {
        boolean response = false;

        if (password != null && password.trim().length() > 0) {
            int passwordLength = password.length();
            if (passwordLength >= 8 && passwordLength <= 12) {
                response = true;
            }
        }

        return response;
    }
}
