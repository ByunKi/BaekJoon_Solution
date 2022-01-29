/*
 * 제출 번호: 38300057
 * ID: adviate
 * 문제: 16673
 * 결과: 맞았습니다!!
 * 메모리: 14184 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 432 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int C = Integer.parseInt(input[0]), K = Integer.parseInt(input[1]), P = Integer.parseInt(input[2]), sum = 0;
		for(int i = 1; i <= C; i++) { sum += (K*i + P*i*i);  }
		System.out.println(sum);
 	}
}
