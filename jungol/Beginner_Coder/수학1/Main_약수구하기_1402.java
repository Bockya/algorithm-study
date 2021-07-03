package jungol.Beginner_Coder.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_약수구하기_1402 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        // 약수 구하기
        if (k == 1) {
            System.out.println(1);
            return;
        }
        int cnt = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) cnt++;
            if (cnt == k) {
                System.out.println(i);
                return;
            }
        }
        if (k > cnt) System.out.println(0);
    }
}
