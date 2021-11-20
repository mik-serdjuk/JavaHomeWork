package com.pb.serdjuk.HomeWork8;

public class OnlineShop {
    public static void main(String[] args) {
        Auth auth = new Auth("", "", "");

        try {
            auth.signUp("", "", "");
            auth.signin("", "");
        } catch (WrongLoginException result) {
            System.out.println("login true");
            result.printStackTrace();
        } catch (WrongPasswordException result1) {
            System.out.println("password false");
            result1.printStackTrace();
        }
    }
}
