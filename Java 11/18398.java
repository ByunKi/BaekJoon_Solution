/*
 * 제출 번호: 40380299
 * ID: adviate
 * 문제: 18398
 * 결과: 맞았습니다!!
 * 메모리: 16332 KB
 * 시간: 188 ms
 * 언어: Java 11
 * 코드 길이: 524 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {

			int P = Integer.valueOf(reader.readLine());
			for(int j = 0; j < P; j++) {
				String[] input = reader.readLine().split(" ");
				int A = Integer.valueOf(input[0]), B = Integer.valueOf(input[1]);

				System.out.println((A + B) + " " + (A * B));
			}
		}
	}
}
