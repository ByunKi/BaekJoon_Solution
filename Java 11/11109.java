/*
 * 제출 번호: 40047103
 * ID: adviate
 * 문제: 11109
 * 결과: 맞았습니다!!
 * 메모리: 16024 KB
 * 시간: 188 ms
 * 언어: Java 11
 * 코드 길이: 687 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			
			int[] arr = new int[input.length];
			for(int j = 0; j < arr.length; j++) { arr[j] = Integer.valueOf(input[j]); }
			
			if(arr[1] * arr[3] + arr[0] > arr[1] * arr[2]) { System.out.println("do not parallelize"); }
			else if(arr[1] * arr[3] + arr[0] == arr[1] * arr[2]) { System.out.println("does not matter"); }
			else { System.out.println("parallelize"); }
		}

	}
}
