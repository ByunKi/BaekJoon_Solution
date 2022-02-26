/*
 * 제출 번호: 39630154
 * ID: adviate
 * 문제: 3778
 * 결과: 맞았습니다!!
 * 메모리: 55924 KB
 * 시간: 940 ms
 * 언어: Java 11
 * 코드 길이: 746 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String A = reader.readLine();
			String B = reader.readLine();
			
			int[][] check = new int[2][26];
			for(int j = 0; j < A.length(); j++) { check[0][A.charAt(j) - 'a']++; }
			for(int j = 0; j < B.length(); j++) { check[1][B.charAt(j) - 'a']++; }
			
			int distance = 0;
			for(int j = 0; j < check[0].length; j++) {
				if(check[0][j] != check[1][j]) { distance += Math.abs(check[0][j] - check[1][j]); }
			}
			System.out.println("Case #" + (i+1) + ": " + distance);
		}
	}
}
