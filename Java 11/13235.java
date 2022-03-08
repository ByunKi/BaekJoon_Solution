/*
 * 제출 번호: 40104219
 * ID: adviate
 * 문제: 13235
 * 결과: 맞았습니다!!
 * 메모리: 14176 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 351 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		String reverse = new StringBuffer(input).reverse().toString();
		
		System.out.println(input.equals(reverse) ? "true" : "false");
	}
}
