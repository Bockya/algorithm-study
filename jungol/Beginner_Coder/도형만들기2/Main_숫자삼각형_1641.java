package jungol.Beginner_Coder.도형만들기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_숫자삼각형_1641 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		if (n % 2 == 0 || n > 100 || n < 0) {
			System.out.println("INPUT ERROR!");
			return;
		}
		StringBuilder sb = new StringBuilder();
		int num = 1;
		switch (m) {
		case 1:
			// input
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j <= i; j++) {
						arr[i][j] = num++;
					}
				} else {
					for (int j = i; j >= 0; j--) {
						arr[i][j] = num++;
					}
				}
			}
			// output
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					sb.append(arr[i][j] == 0 ? " " : arr[i][j]).append(" ");
				}
				sb.append("\n");
			}
			break;
		case 2:
			// input
			int begin = 0, end = 2 * n - 1;
			int[][] arr2 = new int[n][end];
			for (int i = 0; i < n; i++) {
				for (int j = begin; j < end; j++) {
					arr2[i][j] = i;
				}
				begin++;
				end--;
			}
			// output
			for (int i = 0; i < 2 * n - 1; i++) {
				sb.append(arr2[0][i] + " ");
			}
			sb.append("\n");
			for (int i = 1; i < n; i++) {
				for (int j = 0; j < 2 * n - 1; j++) {
					sb.append(arr2[i][j] == 0 ? " " : arr2[i][j]).append(" ");
				}
				sb.append("\n");
			}
			break;
		case 3:
			// input
			int begin3 = 0, end3 = n;
			int[][] arr3 = new int[n][n / 2 + 1];
			for (int j = 0; j <= n / 2; j++) {
				for (int i = begin3; i < end3; i++) {
					arr3[i][j] = j + 1;
				}
				begin3++;
				end3--;
			}
			// output
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= n / 2; j++) {
					sb.append(arr3[i][j] == 0 ? " " : arr3[i][j]).append(" ");
				}
				sb.append("\n");
			}
			break;
		default:
			sb.append("INPUT ERROR!");
		}
		System.out.println(sb);
	}

}
