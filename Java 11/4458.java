/*
 * 제출 번호: 37852384
 * ID: adviate
 * 문제: 4458
 * 결과: 맞았습니다!!
 * 메모리: 14096 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 387 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		
		for(int i = 0; i < N; i++) {
			String input = reader.readLine();
			System.out.println(input.substring(0, 1).toUpperCase() + input.substring(1));
		}
	}
}
