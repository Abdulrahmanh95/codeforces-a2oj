package archive.Div2A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircularServing {
    public static void main(String[] args) {
        // Reading
        Scanner sc = new Scanner(System.in);
        int homeCount = sc.nextInt();
        int missionCount = sc.nextInt();
        List<Integer> missions = new ArrayList<>();
        for (int i = 0; i < missionCount; i++) {
            missions.add(sc.nextInt());
        }
        // Processing
        int currentMission, seconds = missions.get(0) - 1;
        Integer nextMission;
        for (int i = 0; i < missionCount; i++) {
            currentMission = missions.get(i);
            if (i + 1 < missionCount) {
                nextMission = missions.get(i + 1);
            } else {
                break;
            }
            seconds += nextMission - currentMission;
            if (nextMission < currentMission) {
                seconds += homeCount;
            }
        }
        System.out.println(seconds);
    }
}
