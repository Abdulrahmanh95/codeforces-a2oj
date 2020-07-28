package archive.Div2A;//package com.company.Div2A.f;

import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vecCount = 0;
        int sumX = 0, sumY = 0, sumZ = 0;
        vecCount = sc.nextInt();
        int[][] vectors = new int[vecCount][3];
        for (int i = 0; i < vecCount; i++) {
            vectors[i][0] = sc.nextInt();
            vectors[i][1] = sc.nextInt();
            vectors[i][2] = sc.nextInt();
        }
        for (int i = 0; i < vecCount; i++) {
            sumX += vectors[i][0];
            sumY += vectors[i][1];
            sumZ += vectors[i][2];
        }
        if (sumX == 0 && sumY == 0 && sumZ == 0) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

}
