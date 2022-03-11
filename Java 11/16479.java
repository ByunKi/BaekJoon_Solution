/*
 * 제출 번호: 40281582
 * ID: adviate
 * 문제: 16479
 * 결과: 40점
 * 메모리: 14384 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 419 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int K = Integer.valueOf(reader.readLine());
		String[] input = reader.readLine().split(" ");
		int D1 = Integer.valueOf(input[0]), D2 = Integer.valueOf(input[1]);

		System.out.println(Math.pow(K, 2) - Math.pow((D1 - D2) / 2.0, 2));
	}
}
