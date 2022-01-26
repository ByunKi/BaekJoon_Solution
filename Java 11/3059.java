/*
 * 제출 번호: 38162783
 * ID: adviate
 * 문제: 3059
 * 결과: 맞았습니다!!
 * 메모리: 14128 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 566 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(reader.readLine());
		for(int i = 0; i < num; i++) { 
			boolean[] check = new boolean[26];
			
			String input = reader.readLine();
			for(int j = 0; j < input.length(); j++) { check[input.charAt(j) - 65] = true; }
			
			int sum = 0;
			for(int j = 0; j < 26; j++) {
				if(!check[j]) { sum += (j + 65); }
			}
			
			System.out.println(sum);
		}
 	}
}
