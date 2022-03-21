/*
 * 제출 번호: 40791540
 * ID: adviate
 * 문제: 24723
 * 결과: 맞았습니다!!
 * 메모리: 14188 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 263 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine());
		System.out.println(1 << N);
	}
}
