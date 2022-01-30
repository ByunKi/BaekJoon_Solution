/*
 * 제출 번호: 38338424
 * ID: adviate
 * 문제: 5704
 * 결과: 맞았습니다!!
 * 메모리: 19552 KB
 * 시간: 304 ms
 * 언어: Java 11
 * 코드 길이: 593 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String input = reader.readLine();
			input = input.replaceAll(" ", "");
			if(input.equals("*")) { break; }
			
			int[] check = new int[26];
			for(int i = 0; i < input.length(); i++) { check[input.charAt(i) - 97] = 1; }
			
			int sum = 0;
			for(int i = 0; i < 26; i++) { sum += check[i]; }
			
			if(sum == 26) { System.out.println("Y"); } 
			else { System.out.println("N"); }
		}
 	}
}
