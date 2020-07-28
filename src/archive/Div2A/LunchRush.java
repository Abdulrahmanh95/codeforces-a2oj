package archive.Div2A;

import java.util.Scanner;

public class LunchRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int restaurantCount = sc.nextInt();
        int time = sc.nextInt();
        int fi, ti, joy;
        int maxJoy = Integer.MIN_VALUE;
        for (int i = 0; i < restaurantCount; i++) {
            // fi
            fi = sc.nextInt();
            // ti
            ti = sc.nextInt();
            joy = ti > time ? fi - (ti - time) : fi;
            if (joy > maxJoy) {
                maxJoy = joy;
            }
        }

        System.out.println(maxJoy);
    }
}
