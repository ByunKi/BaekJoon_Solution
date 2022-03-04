/*
 * 제출 번호: 39923270
 * ID: adviate
 * 문제: 6996
 * 결과: 맞았습니다!!
 * 메모리: 16140 KB
 * 시간: 148 ms
 * 언어: Java 11
 * 코드 길이: 848 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) { 
			String[] input = reader.readLine().split(" ");
			int[][] alphas = new int[2][26];
			
			for(int j = 0; j < input[0].length(); j++) { alphas[0][input[0].charAt(j) - 'a']++; }
			for(int j = 0; j < input[1].length(); j++) { alphas[1][input[1].charAt(j) - 'a']++; }
			
			boolean check = true;
			for(int j = 0; j < alphas[0].length; j++) {
				if(alphas[0][j] != alphas[1][j]) { check = false; }
			}
			
			if(check) { System.out.println(input[0] + " & " + input[1] + " are anagrams."); }
			else { System.out.println(input[0] + " & " + input[1] + " are NOT anagrams."); }
		}
	}
}
