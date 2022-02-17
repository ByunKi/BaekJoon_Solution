/*
 * 제출 번호: 39203731
 * ID: adviate
 * 문제: 10822
 * 결과: 맞았습니다!!
 * 메모리: 14260 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 360 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		long sum = 0;
		String[] input = reader.readLine().split(","); 
		for(int i = 0; i < input.length; i++) {	sum += Long.parseLong(input[i]); }
		
		System.out.println(sum);
	}
}
