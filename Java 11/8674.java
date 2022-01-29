/*
 * 제출 번호: 38295440
 * ID: adviate
 * 문제: 8674
 * 결과: 맞았습니다!!
 * 메모리: 14224 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 413 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		long a = Long.parseLong(input[0]), b = Long.parseLong(input[1]);
		
		if(a % 2 == 0 || b % 2 == 0) { System.out.println(0); } 
		else { System.out.println(Math.min(a, b)); }
 	}
}
