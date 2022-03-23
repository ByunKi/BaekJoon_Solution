/*
 * 제출 번호: 40899577
 * ID: adviate
 * 문제: 16483
 * 결과: 맞았습니다!!
 * 메모리: 14200 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 280 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.valueOf(reader.readLine());
		System.out.println(Math.round((T * T) / 4));
	}
}
