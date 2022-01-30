/*
 * 제출 번호: 38338933
 * ID: adviate
 * 문제: 6321
 * 결과: 맞았습니다!!
 * 메모리: 15808 KB
 * 시간: 152 ms
 * 언어: Java 11
 * 코드 길이: 554 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String input = reader.readLine();
			
			System.out.println("String #" + (i + 1));
			for(int j = 0; j < input.length(); j++) { 
				if(input.charAt(j) == 90) { System.out.print('A'); } 
				else { System.out.print((char)(input.charAt(j)+1)); }
			}
			System.out.println("\n");
		}
 	}
}
