/*
 * 제출 번호: 41896012
 * ID: adviate
 * 문제: 14918
 * 결과: 맞았습니다!!
 * 메모리: 14024 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 336 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int A = Integer.valueOf(input[0]), B = Integer.valueOf(input[1]);
		
		System.out.println(A + B);
	}
}
