/*
 * 제출 번호: 39730935
 * ID: adviate
 * 문제: 10988
 * 결과: 맞았습니다!!
 * 메모리: 14208 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 343 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		String reverse = new StringBuffer(input).reverse().toString();
		
		System.out.println(input.equals(reverse) ? 1 : 0);
	}
}
