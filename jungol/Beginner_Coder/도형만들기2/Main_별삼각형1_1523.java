package jungol.Beginner_Coder.도형만들기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_별삼각형1_1523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if (n > 100 || m > 3 || n < 1 || m < 1) {
            System.out.println("INPUT ERROR!");
            return;
        }
        StringBuilder sb = new StringBuilder();
        switch (m) {
            case 1:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <= i; j++) {
                        sb.append("*");
                    }
                    sb.append("\n");
                }
                break;
            case 2:
                for (int i = n - 1; i >= 0; i--) {
                    for (int j = 0; j <= i; j++) {
                        sb.append("*");
                    }
                    sb.append("\n");
                }
                break;
            case 3:
                for (int i = 0; i < n; i++) {
                    // 공백 출력
                    for (int j = 0; j < n - 1 - i; j++) {
                        sb.append(" ");
                    }
                    // '*' 출력
                    for (int j = 0; j < 2 * i + 1; j++) {
                        sb.append("*");
                    }
                    sb.append("\n");
                }
                break;
        }
        System.out.println(sb);
    }
}
