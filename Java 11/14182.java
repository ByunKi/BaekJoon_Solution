/*
 * 제출 번호: 41759607
 * ID: adviate
 * 문제: 14182
 * 결과: 맞았습니다!!
 * 메모리: 13940 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 458 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			int N = Integer.valueOf(reader.readLine());
			if(N == 0) { break; }

			if(N < 1_000_000) { System.out.println(N); }
			else if(N > 1_000_000 && N < 5_000_000) { System.out.println((int) (N * 0.9)); }
			else { System.out.println((int) (N * 0.8)); }
		}
	}
}
