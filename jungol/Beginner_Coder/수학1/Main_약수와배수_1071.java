package jungol.Beginner_Coder.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_약수와배수_1071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = stoi(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = stoi(st.nextToken());
        }
        int m = stoi(br.readLine());
        // 약수 구하기
        int divSum = 0, mulSum = 0;
        for (int i = 0; i < n; i++) {
            if (m % arr[i] == 0) divSum += arr[i];
            if (arr[i] % m == 0) mulSum += arr[i];
        }
        System.out.println(divSum);
        System.out.println(mulSum);
    }

    private static int stoi(String s) {
        return Integer.parseInt(s);
    }
}
