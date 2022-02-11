/*
 * 제출 번호: 38915854
 * ID: adviate
 * 문제: 10798
 * 결과: 맞았습니다!!
 * 메모리: 14304 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 545 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		char[][] input = new char[5][15];
		for(int i = 0; i < input.length; i++) {
			String s = reader.readLine();
			for(int j = 0; j < s.length(); j++) { input[i][j] = s.charAt(j); }
		}
		
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if(input[j][i] == ' ' || input[j][i] == '\0') { continue; }
				System.out.print(input[j][i]);
			}
		}
	}
}
