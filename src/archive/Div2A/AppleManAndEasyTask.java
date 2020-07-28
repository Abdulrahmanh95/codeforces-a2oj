package archive.Div2A;

import java.util.Scanner;

public class AppleManAndEasyTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        char[][] board = new char[n][n];
        int[][] adjacentCount = new int[n][n];
        String line;

        for (int i = 0; i < n; i++) {
            line = sc.next();
            for (int j = 0; j < n; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n > 1) {
                    if (i == 0) {
                        if (board[i + 1][j] == 'o') {
                            adjacentCount[i][j]++;
                        }
                    }
                    if (j == 0) {
                        if (board[i][j + 1] == 'o') {
                            adjacentCount[i][j]++;
                        }
                    }
                    if (i == n - 1) {
                        if (board[i - 1][j] == 'o') {
                            adjacentCount[i][j]++;
                        }
                    }
                    if (j == n - 1) {
                        if (board[i][j - 1] == 'o') {
                            adjacentCount[i][j]++;
                        }
                    }
                }

                if (i > 0 && i < n - 1) {
                    if (board[i + 1][j] == 'o') {
                        adjacentCount[i][j]++;
                    }
                    if (board[i - 1][j] == 'o') {
                        adjacentCount[i][j]++;
                    }
                }
                if (j > 0 && j < n - 1) {
                    if (board[i][j + 1] == 'o') {
                        adjacentCount[i][j]++;
                    }
                    if (board[i][j - 1] == 'o') {
                        adjacentCount[i][j]++;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (adjacentCount[i][j] % 2 != 0) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}
