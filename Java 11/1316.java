/*
 * 제출 번호: 44057668
 * ID: adviate
 * 문제: 1316
 * 결과: 맞았습니다!!
 * 메모리: 14216 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 613 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine()), cnt = 0;
		for(int i = 0; i < TC; i++) {
			char prev = '0';
			boolean[] checks = new boolean[26];
			
			String input = reader.readLine();
			for(int j = 0; j < input.length(); j++) {
				if(checks[input.charAt(j) - 'a'] && prev != input.charAt(j)) { cnt++; break; }
				checks[input.charAt(j) - 'a'] = true;
				prev = input.charAt(j);
			}
		}
		System.out.println(TC - cnt);
	}
}
