/*
 * 제출 번호: 40952083
 * ID: adviate
 * 문제: 16481
 * 결과: 70점
 * 메모리: 14352 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 402 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
		String[] input = reader.readLine().split(" ");
		double r1 = Double.valueOf(input[0]), r2 = Double.valueOf(input[1]), r3 = Double.valueOf(input[2]);
		
		System.out.println((r1*r2*r3) / (r1*r2 + r2*r3 + r3*r1));
	}
}
