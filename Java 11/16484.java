/*
 * 제출 번호: 40847879
 * ID: adviate
 * 문제: 16484
 * 결과: 50점
 * 메모리: 14280 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 368 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		double n = Double.valueOf(input[0]), d = Double.valueOf(input[1]);
		
		System.out.println(Math.round((n/2 - d) * 100) / 100.0);
	}
}
