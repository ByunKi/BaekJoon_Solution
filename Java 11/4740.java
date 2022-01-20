/*
 * 제출 번호: 37852577
 * ID: adviate
 * 문제: 4740
 * 결과: 맞았습니다!!
 * 메모리: 14064 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 340 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String input = reader.readLine();
			if(input.equals("***")) { break; }
			System.out.println(new StringBuffer(input).reverse());
		}
	}
}
