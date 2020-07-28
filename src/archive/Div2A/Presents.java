package archive.Div2A;

import java.util.Scanner;

public class Presents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int friendsCount = sc.nextInt();
        int[] indices = new int[friendsCount];
        int[] out = new int[friendsCount];

        for (int i = 0; i < friendsCount; i++) {
            indices[i] = sc.nextInt();
        }

        for (int i = 0; i < friendsCount; i++) {
            out[indices[i] - 1] = i + 1;
        }

        for (int i = 0; i < friendsCount; i++) {
            System.out.print(out[i]);
            if (i != friendsCount - 1) {
                System.out.print(" ");
            }
        }
    }

}
