package archive.Div2A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrivalOfTheGeneral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soldiersCount = sc.nextInt();
        List<Integer> heights = new ArrayList<>();
        int maxIdx = 0,max = 0, minIdx = 101, min = 101, seconds = 0;
        for (int i = 0; i < soldiersCount; i++) {
            heights.add(sc.nextInt());
        }
        for (int i = soldiersCount - 1; i >= 0; i--) {
            if (heights.get(i) >= max) {
                maxIdx = i;
                max = heights.get(i);
            }
        }
        seconds += maxIdx;
        for (int i = 0; i < soldiersCount; i++) {
            if (heights.get(i) <= min) {
                minIdx = i;
                min = heights.get(i);
            }
        }
        seconds += heights.size() - 1 - minIdx;
        if (maxIdx > minIdx) {
            seconds -= 1;
        }
        System.out.println(seconds);
    }

}
