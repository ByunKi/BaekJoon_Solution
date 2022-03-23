/*
 * 제출 번호: 40899399
 * ID: adviate
 * 문제: 2693
 * 결과: 맞았습니다!!
 * 메모리: 16536 KB
 * 시간: 224 ms
 * 언어: Java 11
 * 코드 길이: 534 B
 */

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			int[] arr = new int[input.length];
			for(int j = 0; j < input.length; j++) { arr[j] = Integer.valueOf(input[j]); }
			Arrays.sort(arr);
			
			System.out.println(arr[arr.length - 3]);
		}
	}
}
