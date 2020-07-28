package archive.Div2A;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int[] numbers = new int[n];
        int searchFor = sc.nextInt();

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int low = 0;
        int high = numbers.length;
        int middle = (high + low + 1) / 2;
        while (low <= high) {
            if (numbers[middle] == searchFor) {
                System.out.println(middle);
                return;
            }
            if (searchFor > numbers[middle]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
            middle = (high + low + 1) / 2;
        }
    }
}
