package archive.Div2A;

import java.util.Scanner;

public class Reconnaissance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soldiersCount = sc.nextInt();
        int[] heights = new int[soldiersCount];

        for (int i = 0; i < soldiersCount; i++) {
            heights[i] = sc.nextInt();
        }

        int i = 0;
        int soldier1, soldier2;
        int min = 1001, diff = 0;
        int[] soldiers = new int[2];
        while (i < soldiersCount) {
            soldier1 = heights[i];
            soldier2 = heights[i == soldiersCount - 1 ? 0 : i + 1];
            diff = Math.abs(soldier1 - soldier2);
            if (diff < min) {
                min = diff;
                soldiers[0] = i + 1;
                soldiers[1] = (i == soldiersCount - 1 ? 0 : i + 1) + 1;
            }
            i++;
        }
        System.out.println(soldiers[0] + " " + soldiers[1]);
    }
}
