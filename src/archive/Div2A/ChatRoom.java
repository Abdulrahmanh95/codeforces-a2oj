package archive.Div2A;

import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hello = "hello";
        String input = sc.next();
        char helloChar = 0, c = 0;
        int i = 0, j = 0;
        while (i < hello.length()) {
            helloChar = hello.charAt(i);
            while (j < input.length()) {
                c = input.charAt(j);
                j++;
                if (c == helloChar) {
                    break;
                } else {
                    if (j == input.length()) {
                        System.out.println("NO");
                        return;
                    }
                }
            }
            i++;
        }
        if (helloChar == 'o' && c == 'o') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
