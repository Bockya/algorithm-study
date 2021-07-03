package jungol.Beginner_Coder.도형만들기1;

import java.util.Scanner;

public class Main_구구단_1291 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;
        int e;
        while (true) {
            s = sc.nextInt();
            e = sc.nextInt();
            if (2 > s || s > 9 || 2 > e || e > 9) {
                System.out.println("INPUT ERROR!");
                continue;
            } else {
                if (s <= e) {
                    for (int i = 1; i <= 9; i++) {
                        for (int j = s; j <= e; j++) {
                            System.out.printf("%d * %d = %2d   ", j, i, i * j);
                        }
                        System.out.println();
                    }
                } else {
                    for (int i = 1; i <= 9; i++) {
                        for (int j = s; j >= e; j--) {
                            System.out.printf("%d * %d = %2d   ", j, i, i * j);
                        }
                        System.out.println();
                    }
                }
                return;
            }
        }
    }
}
