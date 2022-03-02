/*
 * 제출 번호: 39809265
 * ID: adviate
 * 문제: 16495
 * 결과: 맞았습니다!!
 * 메모리: 14352 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 382 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		long ans = 0;
		String input = reader.readLine();
		for(int i = 0; i < input.length(); i++) { ans += (input.charAt(i) - 64) * Math.pow(26, input.length() - 1 - i); }

		System.out.println(ans);
	}
}
