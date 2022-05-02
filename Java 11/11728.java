/*
 * 제출 번호: 42769704
 * ID: adviate
 * 문제: 11728
 * 결과: 맞았습니다!!
 * 메모리: 326488 KB
 * 시간: 1708 ms
 * 언어: Java 11
 * 코드 길이: 835 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.valueOf(input[0]), M = Integer.valueOf(input[1]), a = 0, b = 0;
		int A[] = new int[N], B[] = new int[M];
		
		input = reader.readLine().split(" ");
		for(int i = 0; i < N; i++) { A[i] = Integer.valueOf(input[i]); }
		
		input = reader.readLine().split(" ");
		for(int i = 0; i < M; i++) { B[i] = Integer.valueOf(input[i]); }
		
		while(a < N && b < M) { ans.append(A[a] >= B[b] ? (B[b++] + " ") : (A[a++] + " ")); }	
		while(a < N) { ans.append(A[a++] + " "); }
		while(b < M) { ans.append(B[b++] + " "); }
		
		System.out.println(ans);
	}
}
