/*
 * 제출 번호: 43077428
 * ID: adviate
 * 문제: 15904
 * 결과: 맞았습니다!!
 * 메모리: 14268 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 536 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		char[] UCPC = {'U', 'C', 'P', 'C'};
		boolean flag = false;
		int idx = 0;
		
		String input = reader.readLine();
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == UCPC[idx]) { idx++; }                                           
			if(idx > 3) { flag = true; break; }
		}
		System.out.println(flag ? "I love UCPC" : "I hate UCPC");
	}
}
