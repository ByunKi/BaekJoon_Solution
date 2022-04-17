/*
 * 제출 번호: 42084336
 * ID: adviate
 * 문제: 24365
 * 결과: 맞았습니다!!
 * 메모리: 14332 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 529 B
 */

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int[] arr = new int[input.length];
		
		int avg = 0;
		for(int i = 0; i < input.length; i++) { 
			int num = Integer.valueOf(input[i]);
			avg += num;
			arr[i] = num;
		}
		Arrays.sort(arr);
		avg /= 3;
		
		System.out.println(2 * (avg - arr[0]) + (avg - arr[1]));
	}
}
