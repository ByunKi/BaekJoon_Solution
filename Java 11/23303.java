/*
 * 제출 번호: 38593492
 * ID: adviate
 * 문제: 23303
 * 결과: 맞았습니다!!
 * 메모리: 14280 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 347 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		if(input.contains("D2") || input.contains("d2")) { System.out.println("D2"); }
		else { System.out.println("unrated"); }
 	}
}
