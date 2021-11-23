package com.pb.serdjuk.HomeWork8;
import com.pb.serdjuk.HomeWork8.WrongPasswordException;

import  java.util.regex.Matcher;

public class passwordvalidation {
        /*private static String login;
        public String login;*/
        public String regex;
        private static String a;
        //private static String confirmpassword;

        public static void main(String[] args) {
                /*String login = "AAA4kjnk";
                boolean result = login.matches("(^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{5,20}$)");
                if (result) {
                        System.out.println("login yes");
                }
                else {
                        System.out.println("No");
                }*/
                String a = "ffffFFF_";
                boolean result = a.matches("(^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[_])(?=\\S+$).{5,}$)");
                if (result) {
                          System.out.println("password yes");
                }
                else {
                        System.out.println("password false");
                }


        }
}
