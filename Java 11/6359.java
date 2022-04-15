/*
 * 제출 번호: 42035167
 * ID: adviate
 * 문제: 6359
 * 결과: 맞았습니다!!
 * 메모리: 14208 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 426 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int N = Integer.valueOf(reader.readLine()), cnt = 0;
			for(int j = 1; j <= N; j++) {
				if(j * j <= N) { cnt++; }
			}
			
			System.out.println(cnt);
		}
	}
}
