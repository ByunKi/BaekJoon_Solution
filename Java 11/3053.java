/*
 * 제출 번호: 41418339
 * ID: adviate
 * 문제: 3053
 * 결과: 맞았습니다!!
 * 메모리: 14436 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 353 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		double R = Double.valueOf(reader.readLine());
		System.out.println(String.format("%.6f", Math.PI * R * R));
		System.out.println(String.format("%.6f", 2 * R * R));
	}
}
