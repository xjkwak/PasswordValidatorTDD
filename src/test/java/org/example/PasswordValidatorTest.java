package org.example;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class PasswordValidatorTest
{
    @Test
    public void testPasswordNotNullOrEmpty() {
        String password = null;
        boolean actual = PasswordValidator.validatePassword(password);
        assertFalse(actual);

        password = "12345678";
        actual = PasswordValidator.validatePassword(password);
        assertTrue(actual);

        password = "";
        actual = PasswordValidator.validatePassword(password);
        assertFalse(actual);

        password = "  ";
        actual = PasswordValidator.validatePassword(password);
        assertFalse(actual);
    }

    @Test
    public void testPasswordLengthHasMinimum8AndMaximum12Characters() {
        String password = "pepito";
        boolean actual = PasswordValidator.validatePassword(password);
        assertFalse(actual);

        password = "123456789";
        actual = PasswordValidator.validatePassword(password);
        assertTrue(actual);
    }
}
