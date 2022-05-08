/*
 * 제출 번호: 43016904
 * ID: adviate
 * 문제: 9655
 * 결과: 맞았습니다!!
 * 메모리: 14372 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 280 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine());
		System.out.println(N % 2 != 0 ? "SK" : "CY");
	}
}
