/*
 * 제출 번호: 45968545
 * ID: adviate
 * 문제: 16212
 * 결과: 25점
 * 메모리: 114160 KB
 * 시간: 1452 ms
 * 언어: Java 11
 * 코드 길이: 542 B
 */

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int N = Integer.valueOf(reader.readLine());
		String[] input = reader.readLine().split(" ");
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) { arr[i] = Integer.valueOf(input[i]); }
		Arrays.sort(arr);
		
		for(int i : arr) { ans.append(i + " "); }
		System.out.println(ans);
	}
}
