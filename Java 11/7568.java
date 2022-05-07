/*
 * 제출 번호: 42982929
 * ID: adviate
 * 문제: 7568
 * 결과: 맞았습니다!!
 * 메모리: 16188 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 728 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int N = Integer.valueOf(reader.readLine());
		int[][] arr = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			String[] input = reader.readLine().split(" ");
			arr[i][0] = Integer.valueOf(input[0]);
			arr[i][1] = Integer.valueOf(input[1]);
		}
		
		for(int i = 0; i < N; i++) {
			int rank = 1;
			
			for(int j = 0; j < N; j++) {
				if(i == j) { continue; }
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) { rank++; }
			}
			
			ans.append(rank + " ");
		}
		System.out.println(ans);
	}
}
