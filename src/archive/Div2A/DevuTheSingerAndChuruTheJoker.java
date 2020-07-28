package archive.Div2A;//package com.company.Div2A.active;

import java.util.Scanner;

public class DevuTheSingerAndChuruTheJoker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt();
        int[] songs = new int[n];
        int totalDuration = 0, songsDuration = 0;
        for (int i = 0; i < n; i++) {
            songs[i] = sc.nextInt();
            totalDuration += songs[i] + (i < n - 1 ? 10 : 0);
            songsDuration += songs[i];
        }
        if (totalDuration > d) {
            System.out.println(-1);
            return;
        }
        int jokesCount = (d - songsDuration) / 5;
        System.out.println(jokesCount);

    }
}
