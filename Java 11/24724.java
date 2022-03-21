/*
 * 제출 번호: 40791613
 * ID: adviate
 * 문제: 24724
 * 결과: 맞았습니다!!
 * 메모리: 49612 KB
 * 시간: 492 ms
 * 언어: Java 11
 * 코드 길이: 551 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int N = Integer.valueOf(reader.readLine());
			String[] input = reader.readLine().split(" ");
			for(int j = 0; j < N; j++) { input = reader.readLine().split(" "); }
			
			System.out.println("Material Management " + (i + 1));
			System.out.println("Classification ---- End!");
		}
	}
}
