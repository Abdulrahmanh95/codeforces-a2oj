package archive.Div2A;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder equation = new StringBuilder(sc.next());
        int[] numberArray = new int[(equation.length()/2) + 1];
        for (int i = 0, j = 0; i < equation.length(); i+=2, j++) {
            numberArray[j] = equation.charAt(i) - '0';
        }
        // Sort array
        Arrays.sort(numberArray);

        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i]);
            if (i != numberArray.length - 1) {
                System.out.print('+');
            }
        }
    }
}
