package archive.Div2A;

import java.util.*;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        Set<Integer> levelSet = new HashSet<>();
        for (int i = 0; i < p; i++) {
            levelSet.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            levelSet.add(sc.nextInt());
        }
        if (n == levelSet.size()) {
            System.out.println("I become the guy.");
            return;
        }
        System.out.println("Oh, my keyboard!");

    }
}
