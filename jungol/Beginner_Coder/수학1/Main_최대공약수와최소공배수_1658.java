package jungol.Beginner_Coder.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_최대공약수와최소공배수_1658 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int GCD = getGCD(n, m);
        System.out.println(GCD); // 최대공약수
        System.out.println(getLCM(n, m, GCD)); // 최소공배수
    }

    private static int getLCM(int x, int y, int GCD) {
        return x * y / GCD;
    }

    // 유클리스 호제법 + 재귀
    private static int getGCD(int x, int y) {
        if (y == 0) return x; // y가 0이면 x가 최대공약수
        return getGCD(y, x % y);
    }
}
