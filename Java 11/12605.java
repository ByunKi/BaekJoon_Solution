/*
 * 제출 번호: 38919707
 * ID: adviate
 * 문제: 12605
 * 결과: 맞았습니다!!
 * 메모리: 14372 KB
 * 시간: 140 ms
 * 언어: Java 11
 * 코드 길이: 480 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			
			System.out.print("Case #" + (i + 1) + ": ");
			for(int j = input.length - 1; j >= 0; j--) { System.out.print(input[j] + " "); }
			System.out.println();
		}
	}
}
