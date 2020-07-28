package archive.Div2A;

import java.util.*;

public class TeamOlympiad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, List<Integer>> children = new HashMap<>();
        int ones = 0, twos = 0, threes = 0, teamsCount;
        int input;
        for (int i = 0; i < n; i++) {
            input = sc.nextInt();
            if (children.containsKey(input)){
                children.get(input).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                children.put(input, list);
            }
            switch (input) {
                case 1:
                    ones++;
                    break;
                case 2:
                    twos++;
                    break;
                case 3:
                    threes++;
                    break;
            }
        }
        teamsCount = Math.min(ones, Math.min(twos, threes));
        System.out.println(teamsCount);
        if (teamsCount == 0) {
            return;
        }
        for (int i = 0; i < teamsCount; i++) {
            System.out.println((children.get(1).get(i) + 1) + " " + (children.get(2).get(i) + 1) + " " + (children.get(3).get(i) + 1));
        }

    }

}
