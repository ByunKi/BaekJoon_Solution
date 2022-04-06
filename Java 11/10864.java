/*
 * 제출 번호: 41617042
 * ID: adviate
 * 문제: 10864
 * 결과: 맞았습니다!!
 * 메모리: 15420 KB
 * 시간: 188 ms
 * 언어: Java 11
 * 코드 길이: 554 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.valueOf(input[0]), M = Integer.valueOf(input[1]);
		int[] arr = new int[N];
		
		for(int i = 0; i < M; i++) {
			input = reader.readLine().split(" ");
			arr[Integer.valueOf(input[0]) - 1]++;
			arr[Integer.valueOf(input[1]) - 1]++;
		}
		
		for(int i = 0; i < N; i++) { System.out.println(arr[i]); }
	}
}
