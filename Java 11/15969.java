/*
 * 제출 번호: 41989183
 * ID: adviate
 * 문제: 15969
 * 결과: 100점
 * 메모리: 14448 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 480 B
 */

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine());
		String[] input = reader.readLine().split(" ");
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) { arr[i] = Integer.valueOf(input[i]); }
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length - 1] - arr[0]);
	}
}
