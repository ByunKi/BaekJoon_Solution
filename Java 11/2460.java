/*
 * 제출 번호: 38199390
 * ID: adviate
 * 문제: 2460
 * 결과: 맞았습니다!!
 * 메모리: 14076 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 461 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0, curr = 0;
		for(int i = 0; i < 10; i++) {
			String[] input = reader.readLine().split(" ");
			int out = Integer.parseInt(input[0]), in = Integer.parseInt(input[1]);
			curr += (in - out);
			
			if(curr > max) { max = curr; }
		}
		System.out.println(max);
 	}
}
