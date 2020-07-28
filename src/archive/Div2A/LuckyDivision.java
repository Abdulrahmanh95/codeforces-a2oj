package archive.Div2A;

import java.util.Scanner;

public class LuckyDivision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (LuckyDivision.isLucky(number)) {
            System.out.println("YES");
            return;
        }

        for (int i = 4; i <= number / 2; i++) {
            if (LuckyDivision.isLucky(i)) {
                if (number % i == 0) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }

    private static boolean isLucky(int number) {
        int divider = 1;
        int place, remainder;
        while (divider <= number) {
            divider *= 10;
            remainder = number % divider;
            place = remainder / (divider / 10);
            if (place != 4 && place != 7) {
                return false;
            }
            number -= remainder;
            if (number == 0) {
                return true;
            }
        }
        place = number / (divider / 10);
        return place == 4 || place == 7;
    }
}
