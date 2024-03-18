package org.example;
// 1 уровень сложности: Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
//
//
//         Login:
//         1) Длина login должна быть меньше 20 символов и начинаться с латинской буквы.
//         2*) Login должен содержать только латинские буквы, цифры и знак подчеркивания.
//         Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//
//         Password:
//         1) Длина password должна быть меньше 20 символов.
//         2*) Должен содержать только латинские буквы, цифры.
//         Также password и confirmPassword должны быть равны.
//         Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//
//
//         WrongPasswordException и WrongLoginException - пользовательские классы исключения с  конструкторами:


import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        String login = "Daniil1";
        String pasword = "paswordExample1";
        String confirmPassword = "paswordExample1";
        boolean result = false;

        try {
            checkData(login, pasword, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            //System.out.println(result);
            System.out.println(e.getMessage());
            exit(1);
        }
        System.out.println("все ок");
    }

    public static void checkData(String login, String pasword, String confirmPasword) {
        if (login.length() >= 20 || !login.matches("[a-zA-Z][a-zA-Z0-9_]*")) {
            throw new WrongLoginException("Неверный логин");
        }
        if (pasword.length() >= 20 || !pasword.matches("[a-zA-Z0-9]+")) {
            throw new WrongPasswordException("Неверный пароль");
        }
        if (!pasword.equals(confirmPasword)) {
            throw new WrongPasswordException("пароли не совпадают");
        }
    }
}

