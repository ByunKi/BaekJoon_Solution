/*
 * 제출 번호: 44315413
 * ID: adviate
 * 문제: 25238
 * 결과: 맞았습니다!!
 * 메모리: 14176 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 364 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int a = Integer.valueOf(input[0]), b = Integer.valueOf(input[1]);
		
		System.out.println(a * (100 - b) >= 10000 ? "0" : "1");
	}
}
