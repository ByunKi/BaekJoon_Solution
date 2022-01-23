/*
 * 제출 번호: 37989452
 * ID: adviate
 * 문제: 2399
 * 결과: 맞았습니다!!
 * 메모리: 16244 KB
 * 시간: 292 ms
 * 언어: Java 11
 * 코드 길이: 604 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		int length = Integer.parseInt(input);
		
		long[] arr = new long[length];
		input = reader.readLine(); String[] tmp = input.split(" ");
		for(int i = 0; i < length; i++) {
			arr[i] = Long.parseLong(tmp[i]);
		}
		
		long sum = 0;
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				sum += Math.abs(arr[i] - arr[j]);
			}
		}
		
		System.out.println(sum);
 	}
}
