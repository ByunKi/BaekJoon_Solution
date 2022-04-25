/*
 * 제출 번호: 42450933
 * ID: adviate
 * 문제: 10214
 * 결과: 맞았습니다!!
 * 메모리: 15096 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 598 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int Y = 0, K = 0;
			
			for(int j = 0; j < 9; j++) {
				String[] input = reader.readLine().split(" ");
				Y += Integer.valueOf(input[0]);
				K += Integer.valueOf(input[1]);
			}
			
			if(Y > K) { System.out.println("Yonsei"); }
			else if(Y == K) { System.out.println("Korea"); }
			else { System.out.println("Draw"); }
		}
	}
}
