/*
 * 제출 번호: 38778548
 * ID: adviate
 * 문제: 9046
 * 결과: 맞았습니다!!
 * 메모리: 16004 KB
 * 시간: 156 ms
 * 언어: Java 11
 * 코드 길이: 795 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int[] alphabets = new int[26];
			
			String input = reader.readLine().replaceAll(" ", "");
			for(int j = 0; j < input.length(); j++) { alphabets[input.charAt(j) - 'a']++; }
			
			int idx = 0;
			for(int j = 0; j < alphabets.length; j++) {
				if(alphabets[j] > alphabets[idx]) { idx = j; }
			}
			
			int cnt = 0;
			for(int j = 0; j < alphabets.length; j++) {
				if(alphabets[idx] == alphabets[j]) { cnt++; }
			}
			
			if(cnt >= 2) { System.out.println("?"); } 
			else { System.out.println((char)(idx + 'a')); }
		}
	}
}
