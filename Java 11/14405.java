/*
 * 제출 번호: 43937620
 * ID: adviate
 * 문제: 14405
 * 결과: 맞았습니다!!
 * 메모리: 14404 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 324 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		input = input.replaceAll("pi|ka|chu", "");
		
		System.out.println(input.isEmpty() ? "YES" : "NO");
	}
}
