package archive.Div2A;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ValeraAndAntiqueItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sellersCount = sc.nextInt();
        int moneyUnits = sc.nextInt();
        int itemsCount;
        int[][] items = new int[sellersCount][];
        Set<Integer> possibleSellers = new TreeSet<>();

        for (int i = 0; i < sellersCount; i++) {
            itemsCount = sc.nextInt();
            items[i] = new int[itemsCount];

            for (int j = 0; j < itemsCount; j++) {
                items[i][j] = sc.nextInt();
                if (items[i][j] < moneyUnits) {
                    possibleSellers.add(i + 1);
                }
            }
        }

        final int possibleSellersCount = possibleSellers.size();
        System.out.println(possibleSellersCount);

        if (possibleSellersCount > 0) {
            System.out.println(possibleSellers
                    .toString()
                    .replace('[', ' ')
                    .replace(']', ' ')
                    .replaceAll(",", "")
                    .trim());
        }
    }
}
