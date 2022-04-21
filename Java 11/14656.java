/*
 * 제출 번호: 42288785
 * ID: adviate
 * 문제: 14656
 * 결과: 맞았습니다!!
 * 메모리: 17548 KB
 * 시간: 192 ms
 * 언어: Java 11
 * 코드 길이: 413 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.valueOf(reader.readLine()), cnt = 0;
		String[] input = reader.readLine().split(" ");
		
		for(int i = 0; i < N; i++) { 
			if((i + 1) != Integer.valueOf(input[i])) { cnt++; }
		}
		
		System.out.println(cnt);
	}
}
