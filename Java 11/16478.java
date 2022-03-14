/*
 * 제출 번호: 40437145
 * ID: adviate
 * 문제: 16478
 * 결과: 20점
 * 메모리: 14188 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 375 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		double ab = Double.valueOf(input[0]), bc = Double.valueOf(input[1]), cd = Double.valueOf(input[2]);

		System.out.println(ab * cd / bc);
	}
}
