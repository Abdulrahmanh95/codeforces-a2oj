package archive.Div2A;

import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Friends
        int n = sc.nextInt(),
                // Bottles
                k = sc.nextInt(),
                // Milliliters
                l = sc.nextInt(),
                // Limes
                c = sc.nextInt(),
                // Slices
                d = sc.nextInt(),
                // Salt grams
                p = sc.nextInt(),
                // Milliliters individual requirement
                nl = sc.nextInt(),
                // Grams individual requirement
                np = sc.nextInt();
        int drink = k * l / nl;
        int limes = c * d;
        int grams = p / np;

        System.out.println(Math.min(Math.min(drink, limes), grams) / n);
    }
}
