/*
 * 제출 번호: 38991382
 * ID: adviate
 * 문제: 1236
 * 결과: 맞았습니다!!
 * 메모리: 14160 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 925 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] input = reader.readLine().split(" ");
		int N = Integer.parseInt(input[0]), M = Integer.parseInt(input[1]), row = 0, col = 0;
		char[][] mat = new char[N][M];

		for(int i = 0; i < mat.length; i++) {
			String tmp = reader.readLine();
			for(int j = 0; j < mat[i].length; j++) { mat[i][j] = tmp.charAt(j); }
		}

		for(int i = 0; i < N; i++) {
			boolean flag = true;
			for(int j = 0; j < M; j++) {
				if(mat[i][j] == 'X') { 
					flag = false;
					break; 
				}
			}
			if(flag) { row++; }
		}

		for(int i = 0; i < M; i++) {
			boolean flag = true;
			for(int j = 0; j < N; j++) {
				if(mat[j][i] == 'X') { 
					flag = false;
					break; 
				}
			}
			if(flag) { col++; }
		}
		
		System.out.println(Math.max(row, col));
	}
}
