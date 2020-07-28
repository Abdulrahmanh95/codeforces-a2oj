package archive.Div2A;//package com.company.Div2A.b;

import java.util.Scanner;

public class GameWithSticks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, m = 0;
        final String akshat = "Akshat";
        final String malvika = "Malvika";
        String currentPlayer = "";
        n = sc.nextInt();
        m = sc.nextInt();
        while (n != 0 && m != 0) {
            currentPlayer = currentPlayer.equals(akshat) ? malvika : akshat;
            n--;
            m--;
        }
        System.out.println(currentPlayer);
    }

}
