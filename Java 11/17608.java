/*
 * 제출 번호: 42363272
 * ID: adviate
 * 문제: 17608
 * 결과: 맞았습니다!!
 * 메모리: 24128 KB
 * 시간: 260 ms
 * 언어: Java 11
 * 코드 길이: 503 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(reader.readLine()), cnt = 1;
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) { arr[i] = Integer.valueOf(reader.readLine()); }
		
		int radix = arr[N - 1];
		for(int i = N - 1; i >= 0; i--) { 
			if(radix < arr[i]) {
				radix = arr[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
