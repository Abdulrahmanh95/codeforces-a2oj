package archive.Div2A;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oneX = 0, oneY = 0, minMoves;
        int[][] matrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 1) {
                    oneX = i;
                    oneY = j;
                }
            }
        }
        minMoves = (Math.abs(oneX - 2) + Math.abs(oneY - 2));
        System.out.println(minMoves);
    }

}
