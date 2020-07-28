package archive.Div2A;

import javafx.util.Pair;

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hostGuestTimes = 0;
        Pair<Integer, Integer>[] teamsUniforms = new Pair[n];
        Pair<Integer, Integer> host, guest;
        for (int i = 0; i < n; i++) {
            teamsUniforms[i] = new Pair<>(sc.nextInt(), sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            host = teamsUniforms[i];
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    guest = teamsUniforms[j];
                    if (host.getKey().intValue() == guest.getValue().intValue()) {
                        hostGuestTimes++;
                    }
                }
            }
        }
        System.out.println(hostGuestTimes);
    }

}
