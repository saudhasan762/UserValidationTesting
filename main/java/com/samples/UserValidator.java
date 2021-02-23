package com.samples;


import java.util.regex.Pattern;

public class UserValidator {

    private static final String name = "^[A-Z]{1}[a-z]{2,}";
    private static final String e_mail = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*+@[a-zA-Z0-9]+[.]([a-zA-z]{2,4})+(([.][a-z]{2,4})?)$";
    private static final String mobNumber = "^([9]{1}[1]{1})\\s{1}[0-9]{10}$";
    private static final String password = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[a-z])(?=.*[#?!@$%^&*-]).{8,}$";

    public boolean validateFirstName(String fName){
        Pattern pattern = Pattern.compile(name);
        return pattern.matcher(fName).matches();
    }

    public boolean validateLastName(String lName){
        Pattern pattern = Pattern.compile(name);
        return pattern.matcher(lName).matches();
    }

    public boolean validateEmail(String email){
        Pattern pattern = Pattern.compile(e_mail);
        return pattern.matcher(email).matches();
    }

    public boolean validateMobileNumber(String mNumber){
        Pattern pattern = Pattern.compile(mobNumber);
        return pattern.matcher(mNumber).matches();
    }

    public boolean validatePassword(String pass){
        Pattern pattern = Pattern.compile(password);
        return  pattern.matcher(pass).matches();
    }
}
