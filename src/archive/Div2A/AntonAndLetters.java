package archive.Div2A;//package com.company.Div2A.i;

import java.util.*;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if (line.equals("{}")) {
            System.out.println("0");
            return;
        }
        String[] array = line.substring(1, line.length()-1).split(", ");
        Set<String> set = new HashSet<>(Arrays.asList(array));
        System.out.println(set.size());
    }
}
