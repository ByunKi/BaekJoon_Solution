/*
 * 제출 번호: 43700563
 * ID: adviate
 * 문제: 11650
 * 결과: 맞았습니다!!
 * 메모리: 69532 KB
 * 시간: 904 ms
 * 언어: Java 11
 * 코드 길이: 735 B
 */

import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int N = Integer.valueOf(reader.readLine());
		
		int[][] mat = new int[N][2];
		for(int i = 0; i < N; i++) {
			String[] input = reader.readLine().split(" ");
			mat[i][0] = Integer.valueOf(input[0]);
			mat[i][1] = Integer.valueOf(input[1]); 
		}
		
		Arrays.sort(mat, (e1, e2) -> {
			if(e1[0] == e2[0]) { return e1[1] - e2[1]; }
			else { return e1[0] - e2[0]; }
		});
		
		for(int i = 0; i < N; i++) { ans.append(mat[i][0] + " " + mat[i][1] + "\n"); }
		System.out.println(ans);
	}
}
