/*
 * 제출 번호: 39533060
 * ID: adviate
 * 문제: 5524
 * 결과: 100점
 * 메모리: 14624 KB
 * 시간: 168 ms
 * 언어: Java 11
 * 코드 길이: 449 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int nums = Integer.parseInt(reader.readLine());
		for(int i = 0; i < nums; i++) {
			char[] input = reader.readLine().toCharArray();
			
			for(int j = 0; j < input.length; j++) { System.out.print(Character.toLowerCase(input[j])); }
			System.out.println();
		}
	}
}
