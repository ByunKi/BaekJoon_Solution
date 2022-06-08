/*
 * 제출 번호: 44325277
 * ID: adviate
 * 문제: 14490
 * 결과: 맞았습니다!!
 * 메모리: 16024 KB
 * 시간: 152 ms
 * 언어: Java 11
 * 코드 길이: 463 B
 */

import java.io.*;

public class Main {
	public static int GCD (int A, int B) {
		if(B == 0) { return A; }
		return GCD(B, A % B);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(":");
		int a = Integer.valueOf(input[0]), b = Integer.valueOf(input[1]), gcd = GCD(a, b);
		System.out.println(a / gcd + ":" + b / gcd);
	}
}
