/*
 * 제출 번호: 40568722
 * ID: adviate
 * 문제: 24416
 * 결과: 맞았습니다!!
 * 메모리: 16080 KB
 * 시간: 156 ms
 * 언어: Java 11
 * 코드 길이: 392 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] F = new int[40];
		F[0] = 1; F[1] = 1; F[2] = 2;
		
		for(int i = 3; i < 40; i++) { F[i] = F[i-1] + F[i-2]; }
		int N = Integer.valueOf(reader.readLine());

		System.out.println(F[N-1] + " " + (N-2));
	}
}
