package archive.Div2A;//package com.company.Div2A.active;

import java.util.Scanner;

public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int counter = 0, num;
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            if (5 - num >= k) {
                counter++;
            }
        }
        System.out.println(counter / 3);
    }
}
