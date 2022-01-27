/*
 * 제출 번호: 38200380
 * ID: adviate
 * 문제: 1871
 * 결과: 맞았습니다!!
 * 메모리: 14116 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 623 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split("-");
			int L = 0, D = Integer.parseInt(input[1]), idx = 0;
			
			char[] Ls = input[0].toCharArray();
			for(int j = Ls.length - 1; j >= 0; j--, idx++) { L += ((Ls[j] - 65) * Math.pow(26, idx)); }
			
			if(Math.abs(L-D) <= 100) { System.out.println("nice"); }
			else { System.out.println("not nice"); }
		}
 	}
}
