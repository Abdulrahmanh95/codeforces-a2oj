package archive.Div2A;

import java.util.Arrays;
import java.util.Scanner;

public class Sleuth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String question = sc.nextLine().toLowerCase().replace('?', ' ').trim();;
        Character[] vowels = {'a', 'e', 'y', 'o', 'u', 'i'};

        if (Arrays.stream(vowels).anyMatch(v -> question.endsWith(v.toString()))) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
