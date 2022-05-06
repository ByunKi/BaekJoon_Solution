/*
 * 제출 번호: 42907355
 * ID: adviate
 * 문제: 1312
 * 결과: 맞았습니다!!
 * 메모리: 14168 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 450 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int A = Integer.valueOf(input[0]), B = Integer.valueOf(input[1]), N = Integer.valueOf(input[2]) - 1;
		
		A %= B;
		for(int i = 0; i < N; i++) {
			A *= 10;
			A %= B;
		}
		A *= 10;
		System.out.println(A / B);
	}
}
