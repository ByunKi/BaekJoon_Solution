/*
 * 제출 번호: 38339469
 * ID: adviate
 * 문제: 7600
 * 결과: 맞았습니다!!
 * 메모리: 14376 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 695 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String input = reader.readLine();
			input = input.replaceAll(" ", "");
			if(input.equals("#")) { break; }
			
			int[] check = new int[26];
			for(int i = 0; i < input.length(); i++) {
				if(Character.toLowerCase(input.charAt(i)) >= 'a' && Character.toLowerCase(input.charAt(i)) <= 'z') { check[Character.toLowerCase(input.charAt(i)) - 'a'] = 1; } 
				else { continue; }
			}
			
			int sum = 0;
			for(int i = 0; i < 26; i++) { sum += check[i]; }
			
			System.out.println(sum);
		}
 	}
}
