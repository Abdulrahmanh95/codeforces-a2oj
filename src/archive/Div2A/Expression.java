package archive.Div2A;//package com.company.Div2A.h;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, max = 0, result;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        result = (a + b) * c;
        if (result > max) {
            max = result;
        }
        result = a + b * c;
        if (result > max) {
            max = result;
        }
        result = a * (b + c);
        if (result > max) {
            max = result;
        }
        result = a * b + c;
        if (result > max) {
            max = result;
        }
        result = a + b + c;
        if (result > max) {
            max = result;
        }
        result = a * b * c;
        if (result > max) {
            max = result;
        }
        System.out.println(max);
    }
}
