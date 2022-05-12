/*
 * 제출 번호: 43223372
 * ID: adviate
 * 문제: 14916
 * 결과: 맞았습니다!!
 * 메모리: 14204 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 422 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine());
		if(N != 3 && N != 1) {
			int F = N / 5, T = N % 5;
			
			while(T % 2 != 0) {
				F--;
				T += 5;
			}
			
			System.out.println(F + (T / 2));
		} else {
			System.out.println(-1);
		}
	}
}
