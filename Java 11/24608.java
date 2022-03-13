/*
 * 제출 번호: 40380195
 * ID: adviate
 * 문제: 24608
 * 결과: 맞았습니다!!
 * 메모리: 14128 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 363 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		
		String input = reader.readLine();
		for(int i = 0; i < input.length(); i++) { sum += input.charAt(i); }
		
		System.out.println((char)(sum / input.length()));
	}
}
