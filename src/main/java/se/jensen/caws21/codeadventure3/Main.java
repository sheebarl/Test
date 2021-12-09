package se.jensen.caws21.codeadventure3;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

                int a = 50;
                int b = 18;
                System.out.print("Name:");
                String name1 = name("Sheeba");
                System.out.println(name1);
                System.out.print("Addition of two numbers : ");
                int add = myAdd(a, b);
                System.out.println(add);
                System.out.print("Division of numbers : ");
                double d = division((double)a);
                System.out.println(d);
                System.out.print("Subtraction of two numbers : ");
                int s = subtract(a, b);
                System.out.println(s);
                System.out.print("Comparision of two numbers : ");
                boolean bol = isSame(a, b);
                System.out.println(bol);
            }

            public static String name(String fname) {
                return fname;
            }

            public static int myAdd(int a, int b) {
                return a + b;
            }

            public static double division(double x) {
                return x / 25.0D;
            }

            public static int subtract(int a, int b) {
        int c=a-b;
                System.out.println(c);

                 return c;
            }

            public static boolean isSame(int x, int y) {
                if (x == y) {
                    System.out.println("It is equal");
                    return true;
                } else {
                    System.out.println("It is not equal");
                    return false;
                }
            }
        }



