package app;

public class Main {
    String password = "...";

    public static String checkPassword(String password) {
        String res = "WEAK";
        if (password.length() > 8 && password.length() <= 16 && password.matches(".*\\d.*") && password.matches(".*[A-Z].*") && password.matches(".*[!@#$%^].*")) {
            res = "STRONG";
        }
        return "Password "  + password + ": " + res;
    }

    public static void main(String[] args) {
        System.out.println(checkPassword("asfDpadf@Ad1s"));
    }
}

/*Додоткова домашка:

Перевірка пароля

Вхідні дані: String password = "..."; // asfDpadf@Ad1s

Завдання:

Написати метод: static String checkPassword(String password)

Умови валідності

Пароль STRONG, якщо:

Довжина 8..16
Є хоча б 1 цифра
Є хоча б 1 велика літера (A-Z)
Є хоча б 1 спецсимвол із набору !@#$%
Не починається з цифри

Якщо будь-що не виконано → WEAK

Вимоги
перевірку робити циклом по символах
використовувати char
фінальний результат повернути через тернарний оператор: "STRONG" або "WEAK"

Вивід
Password strength: STRONG*/
