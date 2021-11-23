package com.pb.serdjuk.HomeWork8;
import  java.util.regex.Matcher;
import java.util.Scanner;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

public class Auth {
    private String login;
    private String password;
    private String confirmpassword;
    Scanner scan = new Scanner(System.in);

    public Auth(String login, String password, String confirmpassword) {
        this.login = login;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }
    public void signUp(String login, String password, String confirmpassword) throws WrongLoginException, WrongPasswordException {
        /*do {*/
            System.out.println("Введите логин (Login должен содержать только " +
                    "латинские буквы (прописные и заглавные) и цифры от 5 до 20 символов): ");
            login = scan.nextLine();
            boolean result = login.matches("(^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{5,20}$)");
            if (result) {
                login = getLogin(); //new login();
                System.out.println("login true");
            } else {
                System.out.println("login false");
                throw new WrongLoginException(result);
            }
        /*}*/
        /*do {*/
            System.out.println("Введите пароль (Пароль должен содержать только " +
                    "латинские буквы(прописные и заглавные) и цифры и знак подчеркивания, более 5 символов): ");
            password = scan.nextLine();
            System.out.println("Повторите пароль (Пароль должен содержать только " +
                    "латинские буквы(прописные и заглавные) и цифры и знак подчеркивания, более 5 символов): ");
            confirmpassword = scan.nextLine();
            boolean result1 = password.matches("(^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[_])(?=\\S+$).{5,}$)");
            if (result1 && password.equals(confirmpassword)) {
                password = getPassword(); //new password();
                System.out.println("password true");
            } else {
                System.out.println("password false");
                throw new WrongPasswordException(result1);
            }
       /* }*/
    }
        public void signin(String login, String password) throws WrongLoginException{
            if (login.equals(getLogin()) && password.equals(getPassword())) {
                System.out.println("Добро пожаловать");
            } else {
                System.out.println("Неверный логин или пароль");
        }
        }


}



