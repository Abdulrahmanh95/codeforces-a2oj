package archive.Div2A;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Twins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coinsNo = sc.nextInt();
        int totalSum = 0;
        int subTotal = 0;
        int coinsCount = 0;
        Integer[] coins = new Integer[coinsNo];
        for (int i = 0; i < coinsNo; i++) {
            coins[i] = sc.nextInt();
            totalSum += coins[i];
        }
        Arrays.sort(coins, Collections.reverseOrder());

        for (int i = 0; i < coinsNo; i++) {
            subTotal += coins[i];
            coinsCount = i + 1;
            if (subTotal > (totalSum - subTotal))
                break;
        }

        System.out.println(coinsCount);
    }
}
