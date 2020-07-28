package archive.Div2A;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Laptops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int laptopsCount = sc.nextInt();
        int[][] laptops = new int[laptopsCount][];
        int maxQuality = 0;

        for (int i = 0; i < laptopsCount; i++) {
            laptops[i] = new int[2];
            // Price
            laptops[i][0] = sc.nextInt();
            // Quality
            laptops[i][1] = sc.nextInt();
        }
        Arrays.sort(laptops, Comparator.comparingInt(i -> i[0]));

        for (int i = 0; i < laptopsCount; i++) {
            if (laptops[i][1] > maxQuality) {
                maxQuality = laptops[i][1];
            }
            if (maxQuality > laptops[i][1]) {
                System.out.println("Happy Alex");
                return;
            }
        }
        System.out.println("Poor Alex");
    }
}
