package jungol.Beginner_Coder.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_곱셈_1692 {
    public static void main(String[] args) throws IOException {
        // Input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        // Output
        StringBuilder sb = new StringBuilder();
        sb.append(n * (m % 10)).append("\n");
        sb.append(n * (m / 10 % 10)).append("\n");
        sb.append(n * (m / 100)).append("\n");
        sb.append(n * m);
        System.out.println(sb);
    }
}
