/*
 * 제출 번호: 40149885
 * ID: adviate
 * 문제: 1934
 * 결과: 맞았습니다!!
 * 메모리: 15400 KB
 * 시간: 196 ms
 * 언어: Java 11
 * 코드 길이: 533 B
 */

import java.io.*;

public class Main {
	public static int GCD(int a, int b) {
		if(a % b == 0) { return b; }
		return GCD(b, a % b);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			int a = Integer.valueOf(input[0]), b = Integer.valueOf(input[1]);
			
			System.out.println(a * b / GCD(a, b));
		}
	}
}
