/*
 * 제출 번호: 39090660
 * ID: adviate
 * 문제: 10102
 * 결과: 맞았습니다!!
 * 메모리: 14188 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 519 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(reader.readLine()), A = 0, B = 0;
		String input = reader.readLine();
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'A') { A++; }
			else { B++; }
		}
		
		if(A > B) { System.out.println("A"); }
		else if(A == B) { System.out.println("Tie"); }
		else { System.out.println("B"); }
	}
}
