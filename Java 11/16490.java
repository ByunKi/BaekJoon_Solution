/*
 * 제출 번호: 45647319
 * ID: adviate
 * 문제: 16490
 * 결과: 맞았습니다!!
 * 메모리: 14216 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 339 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int a = Integer.valueOf(input[0]), b = Integer.valueOf(input[1]);
		
		System.out.println(a*a - b*b);
	}
}
