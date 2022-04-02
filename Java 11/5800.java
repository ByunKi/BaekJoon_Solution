/*
 * 제출 번호: 41365248
 * ID: adviate
 * 문제: 5800
 * 결과: 맞았습니다!!
 * 메모리: 16520 KB
 * 시간: 176 ms
 * 언어: Java 11
 * 코드 길이: 762 B
 */

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			int N = Integer.valueOf(input[0]), idx = 0;
			
			int[] arr = new int[N];
			for(int j = 1; j <= N; j++) { arr[idx++] = Integer.valueOf(input[j]); }
			Arrays.sort(arr);
			
			int gap = 0;
			for(int j = 0; j < N - 1; j++) {
				if(arr[j + 1] - arr[j] > gap) { gap = arr[j + 1] - arr[j]; }
			}
			System.out.println("Class " + (i + 1) + "\n" + "Max " + arr[N - 1] + ", Min " + arr[0] + ", Largest gap " + gap);
		}
	}
}
