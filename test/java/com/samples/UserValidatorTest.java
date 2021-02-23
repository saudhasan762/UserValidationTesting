package com.samples;


import org.junit.Assert;
import org.junit.Test;

//Testing
public class UserValidatorTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Saud");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("saud");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("sa");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Hasan");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("hasan");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("ha");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("abc@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("abc@gmail.co.inin");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenNotContainsAtTheRateSymbol_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("abc");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenTldStartWithDot_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("abc@.com.my");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenFirstCharacterStartWithDot_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail(".abc@gmail.co.in");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenDoubleDots_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("abc..202@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenDoubleAtTheRate_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("abc@abc@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenTldHaveDigits_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("abc@gmail.co.1i");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenHaveMultipleTld_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("abc@gmail.co.in.in");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMobileNumber("91 8754692154");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenNotValid_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMobileNumber("91 87546921545");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenCountryCodeNotValid_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMobileNumber("95 8754692154");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenNotSpaceAfterCountryCode_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMobileNumber("918754692154");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Saud@123");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNoUpperCase_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("saud@123");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenNoNumericValue_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("saud@hasan");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenNotMinimumDigits_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("hello12");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenNoSpecialCharacter_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("hello12345");
        Assert.assertFalse(result);
    }

}
