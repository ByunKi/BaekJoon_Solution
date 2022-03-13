/*
 * 제출 번호: 40340940
 * ID: adviate
 * 문제: 24544
 * 결과: 맞았습니다!!
 * 메모리: 16124 KB
 * 시간: 160 ms
 * 언어: Java 11
 * 코드 길이: 702 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine());
		int[][] arr = new int[2][N];
		String[] input = reader.readLine().split(" ");
		for(int i = 0; i < N; i++) { arr[0][i] = Integer.valueOf(input[i]); }
		
		input = reader.readLine().split(" ");
		for(int i = 0; i < N; i++) { arr[1][i] = Integer.valueOf(input[i]); }
		
		long total = 0, unregistered = 0;
		for(int i = 0; i < N; i++) {
			if(arr[1][i] < 1) { unregistered += arr[0][i]; }
			total += arr[0][i];
		}
		
		System.out.println(total + "\n" + unregistered);
	}
}
