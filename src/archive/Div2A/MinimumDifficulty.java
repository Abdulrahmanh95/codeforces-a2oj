package archive.Div2A;

import java.util.Scanner;

public class MinimumDifficulty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int[] heights = new int[n];
        int maxDifficulty = -1;

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int current;
        int next;
        int diff;
        int elementToRemove;
        int newDifficulty = 1000;
        for (int i = 1; i < n - 1; i++) {
            elementToRemove = heights[i];
            maxDifficulty = -1;
            for (int j = 0; j < n - 1; j++) {
                if (heights[j] == elementToRemove) {
                    current = heights[j - 1];
                } else {
                    current = heights[j];
                }
                if (heights[j + 1] == elementToRemove) {
                    next = heights[j + 2];
                } else  {
                    next = heights[j + 1];
                }
                diff = next - current;
                if (diff > maxDifficulty) {
                    maxDifficulty = diff;
                }
                if (j == n - 2) {
                    if (maxDifficulty < newDifficulty) {
                        newDifficulty = maxDifficulty;
                    }
                }
            }
        }

        System.out.println(newDifficulty);
    }
}
