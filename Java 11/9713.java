/*
 * 제출 번호: 42569306
 * ID: adviate
 * 문제: 9713
 * 결과: 맞았습니다!!
 * 메모리: 14000 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 432 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int N = Integer.valueOf(reader.readLine()), sum = 0;
			
			for(int j = 1; j <= N; j++) { 
				if(j % 2 != 0) { sum += j; }
			}
			System.out.println(sum);
		}
	}
}
