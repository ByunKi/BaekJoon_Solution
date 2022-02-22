/*
 * 제출 번호: 39454549
 * ID: adviate
 * 문제: 9076
 * 결과: 맞았습니다!!
 * 메모리: 14228 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 685 B
 */

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			
			int[] arr = new int[input.length];
			for(int j = 0; j < arr.length; j++) { arr[j] = Integer.parseInt(input[j]); }
			Arrays.sort(arr);
			
			int sum = 0;
			for(int j = 1; j < arr.length - 1; j++) { sum += arr[j]; }
			
			if(arr[arr.length - 2] - arr[1] >= 4) { System.out.println("KIN"); }
			else { System.out.println(sum); }
		}

	}
}
