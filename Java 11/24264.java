/*
 * 제출 번호: 40701561
 * ID: adviate
 * 문제: 24264
 * 결과: 맞았습니다!!
 * 메모리: 15772 KB
 * 시간: 140 ms
 * 언어: Java 11
 * 코드 길이: 289 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine());
		System.out.println((long) Math.pow(N, 2) + "\n" + 2);
	}
}
