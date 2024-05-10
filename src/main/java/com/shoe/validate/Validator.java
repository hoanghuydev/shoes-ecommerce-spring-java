package com.shoe.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static boolean isValidEmail(String email) {
        if (isEmpty(email))
            return false;
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (isEmpty(phoneNumber))
            return false;
        String phoneRegex = "^0?[1-9]\\d{8,9}$";

        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static boolean isValidMinLength(String input, int minLength) {
        if (isEmpty(input))
            return false;
        return input.length() >= minLength;
    }

    public static boolean between(double value, double minValue, double maxValue) {
        return value >= minValue && value <= maxValue;
    }

    public static boolean containsWhitespace(String input) {
        if (isEmpty(input))
            return false;
        return input.contains(" ");
    }

    public static boolean isEmpty(String input) {
        if (input == null)
            return true;
        return input.trim().isEmpty();
    }

}
