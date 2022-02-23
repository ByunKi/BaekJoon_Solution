/*
 * 제출 번호: 39488141
 * ID: adviate
 * 문제: 1259
 * 결과: 맞았습니다!!
 * 메모리: 13988 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 411 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String input = reader.readLine();
			if(input.equals("0")) { break; }
			
			String reverse = new StringBuffer(input).reverse().toString();
			System.out.println(input.equals(reverse) ? "yes" : "no");
		}
	}
}
