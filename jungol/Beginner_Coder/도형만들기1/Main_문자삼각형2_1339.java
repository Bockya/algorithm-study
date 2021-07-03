package jungol.Beginner_Coder.도형만들기1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_문자삼각형2_1339 {
    public static void main(String[] args) throws IOException {
        // Input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n % 2 == 0 || n < 1 || n > 100) {
            System.out.println("INPUT ERROR");
            return;
        }
        // Fill
        char c = 'A';
        char[][] arr = new char[n][n];
        for (int i = n / 2; i >= 0; i--) {
            for (int j = i; j < n - i; j++) {
                arr[j][i] = c++;
                if (c > 'Z') c = 'A';
            }
        }
        // Output
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j] == '\0' ? " " : arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
