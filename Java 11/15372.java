/*
 * 제출 번호: 40294104
 * ID: adviate
 * 문제: 15372
 * 결과: 맞았습니다!!
 * 메모리: 51400 KB
 * 시간: 1564 ms
 * 언어: Java 11
 * 코드 길이: 340 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		long T = Long.valueOf(reader.readLine());
		for(int i = 0; i < T; i++) { System.out.println((long)(Math.pow(Long.valueOf(reader.readLine()), 2))); }		
	}
}
