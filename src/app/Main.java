package app;

public class Main {
    String password = "";

    /*public static String checkPassword(String password) {
        String res = "WEAK";
        if (password.length() > 8 && password.length() <= 16 && password.matches(".*\\d.*") && password.matches(".*[A-Z].*") && password.matches(".*[!@#$%^].*") && !Character.isDigit(password.charAt(0))) {
            res = "STRONG";
        }
        return "Password "  + password + ": " + res;
    }*/

    public static String checkPassword(String password) {
        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;
        String specialChars = "!@#$%";

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) hasDigit = true;
            else if (Character.isUpperCase(ch)) hasUpper = true;
            else if (specialChars.indexOf(ch) != -1) hasSpecial = true;
        }

        return hasDigit && hasUpper && hasSpecial && password.length() > 8 && password.length() <= 16 && !Character.isDigit(password.charAt(0)) ? ("Password "  + password + ": " + "STRONG") : ("Password "  + password + ": " + "WEAK");
        }

    public static void main(String[] args) {
        System.out.println(checkPassword("asfDpadf@Ad1s"));
    }
}