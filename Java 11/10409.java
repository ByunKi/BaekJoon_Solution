/*
 * 제출 번호: 38199848
 * ID: adviate
 * 문제: 10409
 * 결과: 맞았습니다!!
 * 메모리: 14192 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 504 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int n = Integer.parseInt(input[0]), T = Integer.parseInt(input[1]), i = 0;
		
		input = reader.readLine().split(" ");
		for(i = 0; i < input.length; i++) {
			int num = Integer.parseInt(input[i]);
			if(num > T) { break; }
			T -= num;
		}
		System.out.println(i);
 	}
}
