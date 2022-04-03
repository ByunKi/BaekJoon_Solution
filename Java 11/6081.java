/*
 * 제출 번호: 41418350
 * ID: adviate
 * 문제: 6081
 * 결과: 맞았습니다!!
 * 메모리: 14868 KB
 * 시간: 176 ms
 * 언어: Java 11
 * 코드 길이: 671 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.valueOf(input[0]), Q = Integer.valueOf(input[1]);
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) { arr[i] = Integer.valueOf(reader.readLine()); }
		
		for(int i = 0; i < Q; i++) { 
			input = reader.readLine().split(" ");
			int begin = Integer.valueOf(input[0]) - 1, end = Integer.valueOf(input[1]) - 1, sum = 0;
			
			for(int j = begin; j <= end; j++) { sum += arr[j]; }
			System.out.println(sum);
		}
	}
}
