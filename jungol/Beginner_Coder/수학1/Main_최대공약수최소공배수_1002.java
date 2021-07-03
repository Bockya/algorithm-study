package jungol.Beginner_Coder.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_최대공약수최소공배수_1002 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = stoi(st.nextToken());
        }
        int gcd = arr[0];
        int lcm = arr[0];
        for (int i = 1; i < n; i++) {
            gcd = getGCD(gcd, arr[i]);
            lcm = lcm * arr[i] / getGCD(lcm, arr[i]);
        }
        System.out.println(gcd + " " + lcm);
    }

    private static int getGCD(int x, int y) {
        if (y == 0) return x;
        return getGCD(y, x % y);
    }

    private static int stoi(String s) {
        return Integer.parseInt(s);
    }
}
