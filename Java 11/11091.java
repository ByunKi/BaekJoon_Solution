/*
 * 제출 번호: 39393593
 * ID: adviate
 * 문제: 11091
 * 결과: 맞았습니다!!
 * 메모리: 14324 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 835 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String input = reader.readLine().replaceAll(" ", "");
			StringBuilder missing = new StringBuilder();
			
			int[] check = new int[26];
			for(int j = 0; j < input.length(); j++) {
				char ch = Character.toLowerCase(input.charAt(j));
				if(Character.isLetter(ch)) { check[ch - 'a']++; }
			}
			
			int sum = 0;
			for(int j = 0; j < check.length; j++) {
				if(check[j] >= 1) { sum++; }
				else { missing.append((char)('a' + j)); }
			}
			
			if(sum >= 26) { System.out.println("pangram"); }
			else { System.out.println("missing " + missing.toString()); }
		}
	}
}
