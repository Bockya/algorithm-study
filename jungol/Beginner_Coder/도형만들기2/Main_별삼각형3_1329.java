package jungol.Beginner_Coder.도형만들기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_별삼각형3_1329 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if (n % 2 == 0 || n > 100 || n < 0) {
			System.out.println("INPUT ERROR!");
			return;
		}
		int mid = n / 2;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < mid; i++) {
			// 빈칸
			for (int j = 0; j < i; j++) {
				sb.append(" ");
			}
			// *
			for (int j = 0; j < 2 * i + 1; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		for (int i = mid; i >= 0; i--) {
			// 빈칸
			for (int j = 0; j < i; j++) {
				sb.append(" ");
			}
			// *
			for (int j = 0; j < 2 * i + 1; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
