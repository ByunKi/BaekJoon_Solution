/*
 * 제출 번호: 41453482
 * ID: adviate
 * 문제: 6975
 * 결과: 맞았습니다!!
 * 메모리: 14328 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 621 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int N = Integer.valueOf(reader.readLine()), sum = 1;
			
			for(int j = N - 1; j > 1; j--) {
				if(N % j == 0) { sum += j; }
			}
			
			if(sum < N) { System.out.println(N + " is a deficient number.\n"); }
			else if(sum == N) { System.out.println(N + " is a perfect number.\n"); }
			else { System.out.println(N + " is an abundant number.\n"); }
		}
	}
}
