/*
 * 제출 번호: 40847793
 * ID: adviate
 * 문제: 16485
 * 결과: 15점
 * 메모리: 14252 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 337 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		double A = Double.valueOf(input[0]), B = Double.valueOf(input[1]);
		
		System.out.println(A / B);
	}
}
