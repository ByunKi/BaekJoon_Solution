/*
 * 제출 번호: 38337564
 * ID: adviate
 * 문제: 5789
 * 결과: 맞았습니다!!
 * 메모리: 15160 KB
 * 시간: 172 ms
 * 언어: Java 11
 * 코드 길이: 435 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			char[] input = reader.readLine().toCharArray();
			int idx = input.length / 2;
			
			System.out.println(input[idx - 1] == input[idx] ? "Do-it" : "Do-it-Not");
		}
 	}
}
