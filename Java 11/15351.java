/*
 * 제출 번호: 39808730
 * ID: adviate
 * 문제: 15351
 * 결과: 맞았습니다!!
 * 메모리: 14232 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 494 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int score = 0;
			
			String input = reader.readLine().replaceAll(" ", "");
			for(int j = 0; j < input.length(); j++) { score += (input.charAt(j) - 64); }
			
			System.out.println(score == 100 ? "PERFECT LIFE" : score);
		}
	}
}
