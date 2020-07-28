package archive.Div2A;//package com.company.Div2A.active;

import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        Long firstEvenIdx = n / 2;
        if (n == 1) {
            firstEvenIdx = null;
        }
        if (firstEvenIdx != null) {
            // if number is odd
            if (n % 2 != 0) {
                firstEvenIdx += 1;
            }
            if (k > firstEvenIdx) {
                System.out.println((k - firstEvenIdx) * 2);
                return;
            }
        }
        System.out.println(1 + 2 * (k - 1));
    }
}
