/*
 * 제출 번호: 38593240
 * ID: adviate
 * 문제: 15813
 * 결과: 맞았습니다!!
 * 메모리: 14152 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 393 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(reader.readLine()), score = 0;
		
		String input = reader.readLine();
		for(int i = 0; i < length; i++) { score += (input.charAt(i) - ('A'- 1)); }
		System.out.println(score);
 	}
}
