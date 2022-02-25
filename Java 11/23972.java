/*
 * 제출 번호: 39583550
 * ID: adviate
 * 문제: 23972
 * 결과: 맞았습니다!!
 * 메모리: 14096 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 456 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		long K = Long.valueOf(input[0]), N = Long.valueOf(input[1]);
		
		if(N == 1) { System.out.println(-1); }
		else {
			long tmp = K * N / (N - 1);
			if((K * N) % (N - 1) != 0) { tmp++; }
			System.out.println(tmp);
		}
	}
}
