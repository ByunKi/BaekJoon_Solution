/*
 * 제출 번호: 43223612
 * ID: adviate
 * 문제: 14916
 * 결과: 맞았습니다!!
 * 메모리: 14228 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 447 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine());
		if(N == 1 || N == 3) { System.out.println(-1); }
		else if((N % 5) % 2 == 0) { System.out.println((N / 5) + ((N % 5) / 2) ); }
		else if((N % 5) % 2 != 0) { System.out.println((N / 5 - 1) + ((N % 5 + 5) / 2)); }
	}
}
