/*
 * 제출 번호: 41244382
 * ID: adviate
 * 문제: 13163
 * 결과: 맞았습니다!!
 * 메모리: 14264 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 503 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			input[0] = "god";
			
			for(int j = 0; j < input.length; j++) { ans.append(input[j]); }
			ans.append("\n");
		}
		System.out.println(ans);
	}
}
