package archive.Div2A;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GregsWorkout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "chest");
        map.put(1, "biceps");
        map.put(2, "back");

        int n = sc.nextInt();
        int[] exerciseCount = new int[n];
        int[] totals = new int[3];
        for (int i = 0; i < n; i++) {
            exerciseCount[i] = sc.nextInt();
            if (i % 3 == 0) {
              totals[0] += exerciseCount[i];
            } else if (i % 3 == 1) {
                totals[1] += exerciseCount[i];
            } else {
                totals[2] += exerciseCount[i];
            }
        }

        int max = -1;
        int maxIdx = -1;
        for (int i = 0; i < 3; i++) {
            if (totals[i] > max) {
                max = totals[i];
                maxIdx = i;
            }
        }

        System.out.println(map.get(maxIdx));
    }
}
