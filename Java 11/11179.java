/*
 * 제출 번호: 38916490
 * ID: adviate
 * 문제: 11179
 * 결과: 맞았습니다!!
 * 메모리: 14092 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 339 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		long num = Long.parseLong(reader.readLine());
		System.out.println(Long.parseLong(new StringBuffer(Long.toBinaryString(num)).reverse().toString(), 2));
	}
}
