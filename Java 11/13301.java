/*
 * 제출 번호: 42953253
 * ID: adviate
 * 문제: 13301
 * 결과: 100점
 * 메모리: 14200 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 582 B
 */

import java.io.*;

public class Main {
	public static long[] arr = new long[81];
	
	public static long func(int N) {
		if(arr[N] < 1 && N > 0) { return arr[N] = func(N - 1) + func(N - 2); }
		else { return arr[N]; }
	}
	
	public static long calc(int N) {
		if(N == 1) { return 4; }
		else { return calc(N - 1) + 2 * func(N); }
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		arr[1] = 1; arr[2] = 1;
		
		int N = Integer.valueOf(reader.readLine());
		System.out.println(calc(N));
	}
}
