/*
 * 제출 번호: 38948313
 * ID: adviate
 * 문제: 4447
 * 결과: 맞았습니다!!
 * 메모리: 14044 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 700 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int G = 0, B = 0;
			
			String input = reader.readLine();
			for(int j = 0; j < input.length(); j++) {
				if(input.charAt(j) == 'g' || input.charAt(j) == 'G') { G++; }
				else if(input.charAt(j) == 'b' || input.charAt(j) == 'B') { B++; }
			}
			
			if(G > B) { System.out.println(input + " is GOOD"); }
			else if(G == B) { System.out.println(input + " is NEUTRAL"); }
			else { System.out.println(input + " is A BADDY"); }
		}
	}
}
