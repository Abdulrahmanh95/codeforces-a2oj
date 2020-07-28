package archive.Div2A;//package com.company.Div2A.active;

import java.util.Scanner;

public class IQTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evens = 0, odds = 0;
        Integer lastEven =null, lastOdd = null;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] % 2 == 0) {
                evens++;
                lastEven = i;
            } else {
                odds ++;
                lastOdd = i;
            }
            if (evens >= 2 && lastOdd != null) {
                System.out.println(lastOdd+1);
                return;
            } else if (odds >=2 && lastEven != null) {
                System.out.println(lastEven+1);
                return;
            }
        }
    }
}
