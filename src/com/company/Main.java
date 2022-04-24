package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("¬ведите выражение: ");
        Scanner sc = new Scanner(System.in);
        String userIn = sc.nextLine();
        Calc calc = new Calc();
        System.out.println(calc.calculator(userIn));
    }
}
