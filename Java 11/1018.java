/*
 * 제출 번호: 45968723
 * ID: adviate
 * 문제: 1018
 * 결과: 맞았습니다!!
 * 메모리: 14320 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 994 B
 */

import java.io.*;

public class Main {
	static boolean mat[][];
	static int minValue = 64;
	
	public static void find(int x, int y) {
		int cnt = 0;
		boolean check = mat[x][y];
		
		for(int i = x; i < (x + 8); i++) {
			for(int j = y; j < (y + 8); j++) {
				if(mat[i][j] != check) { cnt++; }
				check = !check;
			}
			check = !check;
		}
		minValue = Math.min(Math.min(64-cnt, cnt), minValue);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.valueOf(input[0]), M = Integer.valueOf(input[1]);
		mat = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			input[0] = reader.readLine();
			for(int j = 0; j < M; j++) {
				mat[i][j] = input[0].charAt(j) == 'W' ? true : false;
			}
		}
		
		for(int i = 0; i < (N-7); i++) {
			for(int j = 0; j < (M-7); j++) {
				find(i,j);
			}
		}
		
		System.out.println(minValue);
	}
}
