/*
 * 제출 번호: 42863630
 * ID: adviate
 * 문제: 16435
 * 결과: 맞았습니다!!
 * 메모리: 14428 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 578 B
 */

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.valueOf(input[0]), L = Integer.valueOf(input[1]);
		
		int[] arr = new int[N];
		input = reader.readLine().split(" ");
		for(int i = 0; i < N; i++) { arr[i] = Integer.valueOf(input[i]); }
		Arrays.sort(arr);
		
		for(int i = 0; i < N; i++) {
			if(L >= arr[i]) { L++; }
		}
		System.out.println(L);
	}
}
