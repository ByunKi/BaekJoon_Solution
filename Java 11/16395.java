/*
 * 제출 번호: 45449385
 * ID: adviate
 * 문제: 16395
 * 결과: 맞았습니다!!
 * 메모리: 14248 KB
 * 시간: 296 ms
 * 언어: Java 11
 * 코드 길이: 538 B
 */

import java.io.*;

public class Main {
	static int[][] ans = new int[30][30];

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] input = reader.readLine().split(" ");
		int n = Integer.valueOf(input[0]) - 1, k = Integer.valueOf(input[1]) - 1;
		
		System.out.println(func(n, k));
	}

	public static int func(int n, int k) {
		if(n == k || k == 0) { return ans[n][k] = 1; }
		return ans[n][k] = func(n - 1, k - 1) + func(n - 1, k);
	}
}
