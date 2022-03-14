/*
 * 제출 번호: 40435339
 * ID: adviate
 * 문제: 2875
 * 결과: 맞았습니다!!
 * 메모리: 14160 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 465 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.valueOf(input[0]), M = Integer.valueOf(input[1]), K = Integer.valueOf(input[2]);
		
		int max = (N / 2) < M ? (N / 2) : M;
		K -= N + M - max * 3;
		
		while(K > 0) { K -= 3; max--; }
		System.out.println(max);
	}
}
