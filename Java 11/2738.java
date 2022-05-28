/*
 * 제출 번호: 43903498
 * ID: adviate
 * 문제: 2738
 * 결과: 맞았습니다!!
 * 메모리: 17776 KB
 * 시간: 236 ms
 * 언어: Java 11
 * 코드 길이: 868 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.valueOf(input[0]),  M = Integer.valueOf(input[1]);
		int[][] A = new int[N][M], B = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			input = reader.readLine().split(" ");
			for(int j = 0; j < M; j++) { A[i][j] = Integer.valueOf(input[j]); }
		}
		
		for(int i = 0; i < N; i++) {
			input = reader.readLine().split(" ");
			for(int j = 0; j < M; j++) { B[i][j] = Integer.valueOf(input[j]); }
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) { ans.append(String.valueOf(A[i][j] + B[i][j]) + " "); }
			ans.append("\n");
		}
		System.out.println(ans);
	}
}
