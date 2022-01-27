/*
 * 제출 번호: 38202515
 * ID: adviate
 * 문제: 3208
 * 결과: 맞았습니다!!
 * 메모리: 14088 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 371 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int R = Integer.parseInt(input[0]), C = Integer.parseInt(input[1]);
		
		System.out.println(R > C ? 2 * (C - 1) + 1 : 2 * (R - 1));
 	}
}
