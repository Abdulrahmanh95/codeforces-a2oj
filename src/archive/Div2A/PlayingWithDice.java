package archive.Div2A;

import java.util.Scanner;

public class PlayingWithDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int[] diceSides = {1, 2, 3, 4, 5, 6};
        int diceSide, aWin = 0, bWin = 0, draw = 0, aDiff, bDiff;

        for (int i = 0; i < 6; i++) {
            diceSide = diceSides[i];
            aDiff = Math.abs(diceSide - a);
            bDiff = Math.abs(diceSide - b);

            if (aDiff < bDiff) {
                aWin++;
            } else if (aDiff > bDiff) {
                bWin++;
            } else {
                draw++;
            }
        }

        System.out.println(aWin + " " + draw + " " + bWin);
    }
}
