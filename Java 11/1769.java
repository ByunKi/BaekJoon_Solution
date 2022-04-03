/*
 * 제출 번호: 41418319
 * ID: adviate
 * 문제: 1769
 * 결과: 맞았습니다!!
 * 메모리: 20128 KB
 * 시간: 260 ms
 * 언어: Java 11
 * 코드 길이: 512 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		
		String input = reader.readLine();
		while(input.length() > 1) {
			int sum = 0;
			for(int i = 0; i < input.length(); i++) { sum += (input.charAt(i) - '0'); }
			count++;
			input = String.valueOf(sum);
		}
		System.out.println(count);
		System.out.println(Integer.valueOf(input) % 3 == 0 ? "YES" : "NO");
	}
}
