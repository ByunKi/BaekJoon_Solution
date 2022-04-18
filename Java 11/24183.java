/*
 * 제출 번호: 42115440
 * ID: adviate
 * 문제: 24183
 * 결과: 맞았습니다!!
 * 메모리: 14112 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 517 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		double A = 0.074196, B = 0.12474, C = 0.06237;
		
		double[] arr = new double[input.length];
		for(int i = 0; i < input.length; i++) { arr[i] = Double.valueOf(input[i]); }
		
		arr[0] *= A;
		arr[1] *= B;
		arr[2] *= C;
		
		System.out.println(2 * arr[0] + 2 * arr[1] + arr[2]);
	}
}
