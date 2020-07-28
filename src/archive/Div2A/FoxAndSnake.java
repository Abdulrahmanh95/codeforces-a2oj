package archive.Div2A;//package com.company.Div2A.active;

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        boolean leftToRight = false;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                leftToRight = !leftToRight;
            }
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    System.out.print("#");
                } else {
                    if (leftToRight) {
                        if (j == m - 1) {
                            System.out.print("#");
                            break;
                        }
                    } else {
                        if (j == 0) {
                            System.out.print("#");
                            continue;
                        }
                    }
                    System.out.print(".");

                }
            }
            System.out.println();
        }
    }
}
