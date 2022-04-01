/*
 * 제출 번호: 41307235
 * ID: adviate
 * 문제: 3049
 * 결과: 맞았습니다!!
 * 메모리: 14188 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 287 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine());
		System.out.println(N * (N-1) * (N-2) * (N-3) / 24);
	}
}
