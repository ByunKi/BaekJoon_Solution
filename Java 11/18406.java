/*
 * 제출 번호: 38698627
 * ID: adviate
 * 문제: 18406
 * 결과: 맞았습니다!!
 * 메모리: 14128 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 549 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine(), A = input.substring(0, input.length()/2), B = input.substring(input.length()/2, input.length());
		int sumA = 0, sumB = 0;
		for(int i = 0; i < A.length(); i++) {
			sumA += (A.charAt(i) - '0');
			sumB += (B.charAt(i) - '0');
		}
		
		if(sumA == sumB) { System.out.println("LUCKY"); }
		else { System.out.println("READY"); }
	}
}
