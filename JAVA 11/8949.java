/*
 * 제출 번호: 38745948
 * ID: adviate
 * 문제: 8949
 * 결과: 맞았습니다!!
 * 메모리: 16200 KB
 * 시간: 152 ms
 * 언어: Java 11
 * 코드 길이: 548 B
 */

import java.io.*;

public class Main {
	public static String func(int a, int b) {
		String ans = new String();
		while(a != 0) {
			ans = ((a % 10) + (b % 10)) + ans;
			a /= 10;
			b /= 10;
		}
		return ans.toString();
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] input = reader.readLine().split(" ");
		int A = Integer.parseInt(input[0]), B = Integer.parseInt(input[1]);
		
		System.out.println(A > B ? func(A, B) : func(B, A));
	}
}
