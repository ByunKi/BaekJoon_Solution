/*
 * 제출 번호: 38850242
 * ID: adviate
 * 문제: 21964
 * 결과: 맞았습니다!!
 * 메모리: 15388 KB
 * 시간: 140 ms
 * 언어: Java 11
 * 코드 길이: 140 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.parseInt(reader.readLine());
		String input = reader.readLine();
		System.out.println(input.substring(length - 5, length));
	}
}
