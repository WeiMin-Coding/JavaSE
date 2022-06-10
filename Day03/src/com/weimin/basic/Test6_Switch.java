package com.weimin.basic;

/**
 * 本类用于测试switch结构
 */
public class Test6_Switch {
    public static void main(String[] args) {
        int a = 3;

        switch (a) {
            case 1: System.out.println(1);
            case 2: System.out.println(2); break;
            case 3: System.out.println(3);
            case 4: System.out.println(4);
            default: System.out.println(0);
        }

        String s = "Monday";
        switch (s) {
            case "Monday" : System.out.println("Monday"); break;
            case "Tuesday" : System.out.println("Tuesday"); break;
            case "Wedsday" : System.out.println("Wedsday"); break;
            case "Thursday" : System.out.println("Thursday"); break;
            case "Friday" : System.out.println("Friday"); break;
            case "Saturday" : System.out.println("Saturday"); break;
            case "Sunday" : System.out.println("Sunday"); break;
            default : System.out.println("Null");
        }
    }
}
