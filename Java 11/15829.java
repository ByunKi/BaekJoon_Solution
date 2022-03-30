/*
 * 제출 번호: 41247020
 * ID: adviate
 * 문제: 15829
 * 결과: 100점
 * 메모리: 14288 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 475 B
 */

import java.io.*;

public class Main {
	static final int M = 1234567891;
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long sum = 0, pow = 1;
		
		int L =	 Integer.valueOf(reader.readLine());
		char[] input = reader.readLine().toCharArray();
		for(int i = 0; i < L; i++) {
			sum += (input[i] - 'a' + 1) * pow % M;
			pow = pow * 31 % M;
		}
		System.out.println(sum % M);
	}
}
