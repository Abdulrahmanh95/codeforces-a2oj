package archive.Div2A;//package com.company.Div2A.active;

import java.util.Scanner;

public class CakeMinator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        char[][] cake = new char[r][c];
        boolean[][] eaten = new boolean[r][c];
        String row;
        boolean rowHasEvil;

        for (int i = 0; i < r; i++) {
            rowHasEvil = false;
            row = sc.next();
            for (int j = 0; j < c; j++) {
                rowHasEvil = row.charAt(j) == 'S' || rowHasEvil;
                cake[i][j] = row.charAt(j);
            }
            if (!rowHasEvil) {
                markRowAsEaten(i, eaten, c);
            }
        }

        boolean columnHasEvil;
        for (int j = 0; j < c; j++) {
            columnHasEvil = false;
            for (int i = 0; i < r; i++) {
                if (cake[i][j] == 'S') {
                    columnHasEvil = true;
                    break;
                }
            }
            if (!columnHasEvil) {
                markColumnAsEaten(j, eaten, r);
            }
        }

        int max = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                max += eaten[i][j] ? 1 : 0;
            }
        }
        System.out.println(max);
    }

    private static void markColumnAsEaten(int column, boolean[][] eaten, int r) {
        for (int i = 0; i < r; i++) {
            eaten[i][column] = true;
        }
    }

    private static void markRowAsEaten(int row, boolean[][] eaten, int c) {
        for (int i = 0; i < c; i++) {
            eaten[row][i] = true;
        }
    }
}
