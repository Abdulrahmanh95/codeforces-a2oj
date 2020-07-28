package archive.Div2A;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String translation = sc.next();
        if (word.length() != translation.length()) {
            System.out.println("NO");
            return;
        }

        for (int i = 0, j = translation.length() - 1; i < word.length() && j >= 0; i++, j--) {
            if (word.charAt(i) != translation.charAt(j)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
