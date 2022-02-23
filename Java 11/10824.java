/*
 * 제출 번호: 39532960
 * ID: adviate
 * 문제: 10824
 * 결과: 맞았습니다!!
 * 메모리: 14244 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 357 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] input = reader.readLine().split(" ");
		input[0] += input[1];
		input[2] += input[3];
		System.out.println(Long.parseLong(input[0]) + Long.parseLong(input[2]));
	}
}
