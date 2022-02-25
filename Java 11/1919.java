/*
 * 제출 번호: 39584196
 * ID: adviate
 * 문제: 1919
 * 결과: 맞았습니다!!
 * 메모리: 14204 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 613 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String A = reader.readLine();
		String B = reader.readLine();
		
		int[][] check = new int[2][26];
		for(int i = 0; i < A.length(); i++) { check[0][A.charAt(i) - 'a']++; }
		for(int i = 0; i < B.length(); i++) { check[1][B.charAt(i) - 'a']++; }
		
		int cnt = 0;
		for(int i = 0; i < check[0].length; i++) {
			if(check[0][i] != check[1][i]) { cnt += Math.abs(check[0][i] - check[1][i]); }
		}
		
		System.out.println(cnt);
	}
}
