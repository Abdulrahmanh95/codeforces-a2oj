package archive.Div2A;

import java.util.Scanner;

public class PashmakAndGarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        int l;
        int l1 = Math.abs(x1 - x2);
        int l2 = Math.abs(y1 - y2);
        l = Math.max(l1, l2);
        if (l1 != l2 && (x1 != x2) && (y1 != y2)) {
            System.out.println(-1);
            return;
        }
        if (x1 == x2) {
            print(x1 + l, y1, x2 + l, y2);
        } else if (y1 == y2) {
            print(x1, y1 + l, x2, y2 + l);
        } else {
            print(x1, y2, x2, y1);
        }
    }

    private static void print(int x3, int y3, int x4, int y4) {
        System.out.print(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
