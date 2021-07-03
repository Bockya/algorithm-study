package jungol.Beginner_Coder.도형만들기1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_숫자사각형4_2046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        switch (st.nextToken()) {
            case "1":
                for (int i = 1; i <= n; i++) {
                    for (int j = 0; j < n; j++) {
                        sb.append(i + " ");
                    }
                    sb.append("\n");
                }
                break;
            case "2":
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        for (int j = 1; j <= n; j++) {
                            sb.append(j + " ");
                        }
                    } else {
                        for (int j = n; j > 0; j--) {
                            sb.append(j + " ");
                        }
                    }
                    sb.append("\n");
                }
                break;
            case "3":
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        sb.append(i * j + " ");
                    }
                    sb.append("\n");
                }
                break;
        }
        System.out.println(sb);
    }
}
