package archive.Div2A;

import java.util.Scanner;

public class DreamoonAndStairs {
    public static void main(String[] args) {
//        firstWay();
//        secondWay();
        thirdWay();
    }

    private static void thirdWay() {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble(), m = sc.nextInt();
        if (m > n) {
            System.out.println(-1);
            return;
        }
        double lowerBound = (n + 1) / 2;
        double answer = lowerBound + m - 1 / m * m;
        System.out.println(answer);
    }

    private static void secondWay() {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble(), m = sc.nextInt();
        if (m > n) {
            System.out.println(-1);
            return;
        }
        double half = Math.ceil(n / 2);
        double mini = Math.ceil(half / m);
        System.out.println(m * mini);
    }

    private static void firstWay() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int moves;
        if (n < m) {
            System.out.println(-1);
            return;
        }
        moves = n / 2 + n % 2;
        if ((n % 2 == 0 && m >= n / 2) || (n % 2 != 0 && m >= n / 2 + 1)) {
            System.out.println(m);
            return;
        }
        while (moves % m != 0) {
            moves++;
        }
        System.out.println(moves);
    }
}
