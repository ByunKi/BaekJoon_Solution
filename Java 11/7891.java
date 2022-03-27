/*
 * 제출 번호: 41087017
 * ID: adviate
 * 문제: 7891
 * 결과: 맞았습니다!!
 * 메모리: 14068 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 418 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			long A = Long.valueOf(input[0]), B = Long.valueOf(input[1]);
			
			System.out.println(A + B);
		}
	}
}
