package archive.Div2A;//package com.company.Div2A.g;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = 0, shopPuzzles = 0, min = 1001, difference = 0;
        students = sc.nextInt();
        shopPuzzles = sc.nextInt();
        int[] puzzlePieces = new int[shopPuzzles];
        for (int i = 0; i < shopPuzzles; i++) {
            puzzlePieces[i] = sc.nextInt();
        }
        Arrays.sort(puzzlePieces);
        for (int i = 0; i <= shopPuzzles - students; i++) {
           difference = puzzlePieces[i+students-1] - puzzlePieces[i];
            if (difference < min) {
                min = difference;
            }
        }
        System.out.println(min);
    }

}
