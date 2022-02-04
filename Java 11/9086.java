/*
 * 제출 번호: 38540163
 * ID: adviate
 * 문제: 9086
 * 결과: 맞았습니다!!
 * 메모리: 15916 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 386 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String input = reader.readLine();
			System.out.println(input.charAt(0) + "" + input.charAt(input.length()-1));
		}
	}
}
