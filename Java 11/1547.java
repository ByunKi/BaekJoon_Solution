/*
 * 제출 번호: 42409384
 * ID: adviate
 * 문제: 1547
 * 결과: 맞았습니다!!
 * 메모리: 14152 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 476 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String ball = "1";
		
		int N = Integer.valueOf(reader.readLine());
		for(int i = 0; i < N; i++) {
			String[] input = reader.readLine().split(" ");
			
			if(input[0].equals(ball)) { ball = input[1]; }
			else if(input[1].equals(ball)) { ball = input[0]; }
		}
		System.out.println(ball);
	}
}
