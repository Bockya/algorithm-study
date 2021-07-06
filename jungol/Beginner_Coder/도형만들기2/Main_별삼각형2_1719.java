package jungol.Beginner_Coder.도형만들기2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_별삼각형2_1719 {

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
		int mid = n / 2;
		switch (m) {
		case 1:
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					sb.append(i + j < n ? "*" : " ");
				}
				sb.append("\n");
			}
			break;
		case 2:
			for (int i = 0; i < n; i++) {
				if (i < mid) {
					for (int j = 0; j < mid - i; j++) {
						sb.append(" ");
					}
					for (int j = 0; j <= i; j++) {
						sb.append("*");
					}
					sb.append("\n");
				} else {
					for (int j = 0; j < i - mid; j++) {
						sb.append(" ");
					}
					for (int j = n - i; j > 0; j--) {
						sb.append("*");
					}
					sb.append("\n");
				}
			}
			break;
		case 3:
			char[][] arr = new char[n][n];
			int begin = 0;
			int end = n;
			for (int i = 0; i < n; i++) {
				for (int j = begin; j < end; j++) {
					arr[i][j] = '*';
				}
				if (i < mid) {
					begin++;
					end--;
				} else {
					begin--;
					end++;
				}
			}
			// Output
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					sb.append(arr[i][j]);
				}
				sb.append("\n");
			}
			break;
		case 4:
			for (int i = 0; i < mid; i++) {
				for (int j = 0; j < i; j++) {
					sb.append(" ");
				}
				for (int j = 0; j <= mid - i; j++) {
					sb.append("*");
				}
				sb.append("\n");
			}
			for (int i = 0; i < mid + 1; i++) {
				for (int j = 0; j < mid; j++) {
					sb.append(" ");
				}
				for (int j = 0; j <= i; j++) {
					sb.append("*");
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
