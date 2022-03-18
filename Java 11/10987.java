/*
 * 제출 번호: 40617304
 * ID: adviate
 * 문제: 10987
 * 결과: 맞았습니다!!
 * 메모리: 14260 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 485 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String input = reader.readLine();
		int cnt = 0;
		for(int i = 0; i < input.length(); i++) {
			switch(input.charAt(i)) {
				case 'a': cnt++; break;
				case 'e': cnt++; break;
				case 'i': cnt++; break;
				case 'o': cnt++; break;
				case 'u': cnt++; break;
			}
		}
		System.out.println(cnt);
	}
}
