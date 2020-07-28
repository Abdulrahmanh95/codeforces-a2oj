package archive.Div2A;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int playerStrength = sc.nextInt();
        int levels = sc.nextInt();
        Dragon[] dragons = new Dragon[levels];
        for (int i = 0; i < levels; i++) {
            dragons[i] = new Dragon(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(dragons, Comparator.comparingInt(Dragon::getStrength));
        for (int i = 0; i < levels; i++) {
            if (playerStrength <= dragons[i].getStrength()) {
                System.out.println("NO");
                return;
            }
            playerStrength += dragons[i].getBonus();
        }
        System.out.println("YES");
    }

    public static class Dragon {
        private int strength;
        private int bonus;

        public Dragon() {
        }

        public Dragon(int strength, int bonus) {
            this.strength = strength;
            this.bonus = bonus;
        }

        public int getBonus() {
            return bonus;
        }

        public void setBonus(int bonus) {
            this.bonus = bonus;
        }

        public int getStrength() {
            return strength;
        }

        public void setStrength(int strength) {
            this.strength = strength;
        }

        @Override
        public String toString() {
            return "Dragon{" +
                    "strength=" + strength +
                    ", bonus=" + bonus +
                    '}';
        }
    }
}
