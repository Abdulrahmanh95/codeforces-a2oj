package archive.Div2A;

import java.util.Scanner;

public class IlyaAndBankAccount {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        firstWay(n);
        secondWay(n);
    }

    private static void secondWay(int n) {
        int max = n;
        if (n < 0) {
            int tens = (-n % 100) / 10;
            int ones = -n % 10;
            max = (n / 10) + ((ones < tens) ? (tens - ones) : 0);
        }
        System.out.println(max);
    }

    private static void firstWay(int n) {
        if (n < 0) {
            int ones = Math.abs(n % 10);
            int tens = Math.abs((n / 10) % 10);
            if (ones > tens) {
                System.out.println(n / 10);
            } else {
                System.out.println((n / 100) * 10 - ones);
            }
            return;
        }
        System.out.println(n);
    }
}
