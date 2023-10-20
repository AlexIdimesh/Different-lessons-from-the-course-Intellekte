package com.intellekta.annotation;
public class Reports {

    @ToRelease(customerName = "Sasha1", version = 1)
    public static void Report1() {
        System.out.println("Report1");

    }
    @ToRelease(customerName = "Div_2", version = 0)
    public static void Report2() {
        System.out.println("Report2");

    }
    @ToRelease(customerName = "Sasha3", version = 3)
    public static void Report3() {
        System.out.println("Report3");

    }
    @ToRelease(customerName = "Div_2", version = 0)
    public static void Report4() {
        System.out.println("Report4");

    }
    @ToRelease(customerName = "Div_5", version = 5)
    public static void Report5() {
        System.out.println("Report5");

    }
    @ToRelease(customerName = "Div_2", version = 0)
    public static void Report6() {
        System.out.println("Report6");

    }
    @ToRelease(customerName = "Sasha7", version = 7)
    public static void Report7() {
        System.out.println("Report7");

    }
    @ToRelease(customerName = "Div_2", version = 0)
    public static void Report8() {
        System.out.println("Report8");

    }
    @ToRelease(customerName = "Sasha9", version = 9)
    public static void Report9() {
        System.out.println("Report9");

    }
    @ToRelease(customerName = "Div_2", version = 0)
    @ToRelease(customerName = "Div_5", version = 5)
    public static void Report10() {
        System.out.println("Report10");

    }

}
