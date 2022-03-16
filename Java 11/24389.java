/*
 * 제출 번호: 40504027
 * ID: adviate
 * 문제: 24389
 * 결과: 맞았습니다!!
 * 메모리: 14276 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 390 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine()), R = ~N + 1, X = N ^ R, count = 0;
		for(char ch :Integer.toBinaryString(X).toCharArray()) {
			if(ch == '1') { count++; }
		}
		
		System.out.println(count);
	}
}
