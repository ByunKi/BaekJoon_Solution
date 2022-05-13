/*
 * 제출 번호: 43267591
 * ID: adviate
 * 문제: 14582
 * 결과: 맞았습니다!!
 * 메모리: 14032 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 545 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] W = reader.readLine().split(" "), S = reader.readLine().split(" ");
		
		int w = 0, s = 0, sS = 0, sW = 0;
		boolean flag = false;
		for(int i = 0; i < 18; i++) {
			if(i % 2 == 0) { sW += Integer.valueOf(W[w++]); }
			else { sS += Integer.valueOf(S[s++]); }
			
			if(sW > sS) { flag = true; }
		}
				
		System.out.println(flag ? "Yes" : "No");
	}
}
