package archive.Div2A;//package active;

import java.util.Scanner;

public class BearAndRaspberry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daysNo = sc.nextInt();
        int barrelCost = sc.nextInt();
        int[] exchangeRates = new int[daysNo];
        int max = 0;
        int diff;

        for (int i = 0; i < daysNo; i++) {
            exchangeRates[i] = sc.nextInt();
        }

        for (int i = 0; i < daysNo - 1; i++) {
            diff = exchangeRates[i] - exchangeRates[i + 1] - barrelCost;
            if (diff > max) {
                max = diff;
            }
        }

        System.out.println(max);
    }
}
