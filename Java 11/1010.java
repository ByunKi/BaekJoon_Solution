/*
 * 제출 번호: 43170197
 * ID: adviate
 * 문제: 1010
 * 결과: 맞았습니다!!
 * 메모리: 14724 KB
 * 시간: 152 ms
 * 언어: Java 11
 * 코드 길이: 656 B
 */

import java.io.*;

public class Main {
	static int[][] ans = new int[30][30];

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			int N = Integer.valueOf(input[0]), M = Integer.valueOf(input[1]);

			System.out.println(func(M, N));
		}
	}

	public static int func(int M, int N) {
		if(ans[M][N] > 0) { return ans[M][N]; }
		if(M == N || N == 0) { return ans[M][N] = 1; }
		return ans[M][N] = func(M - 1, N - 1) + func(M - 1, N);
	}
}
