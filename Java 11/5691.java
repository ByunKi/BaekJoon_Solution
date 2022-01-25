/*
 * 제출 번호: 38098377
 * ID: adviate
 * 문제: 5691
 * 결과: 맞았습니다!!
 * 메모리: 13972 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 407 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] input = reader.readLine().split(" ");
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);
			
			if(A == 0 && B == 0) { break; }
			System.out.println(2*A - B);
		}
 	}
}
