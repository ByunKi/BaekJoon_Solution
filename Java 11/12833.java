/*
 * 제출 번호: 44177837
 * ID: adviate
 * 문제: 12833
 * 결과: 맞았습니다!!
 * 메모리: 14092 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 383 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int A = Integer.valueOf(input[0]), B = Integer.valueOf(input[1]), C = Integer.valueOf(input[2]);
		
		System.out.println(C % 2 == 0 ? A : A ^ B);
	}
}
