package archive.Div2A;

import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt(),
                b = sc.nextInt();
        boolean isOfferBetter = m * a > b;
        int minPrice = isOfferBetter ? (n / m) * b + Math.min(n % m * a, b) : n * a;
        System.out.println(minPrice);
    }
}
