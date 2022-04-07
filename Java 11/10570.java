/*
 * 제출 번호: 41670033
 * ID: adviate
 * 문제: 10570
 * 결과: 맞았습니다!!
 * 메모리: 20536 KB
 * 시간: 208 ms
 * 언어: Java 11
 * 코드 길이: 543 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int[] arr = new int[1001];
			int N = Integer.valueOf(reader.readLine()), idx = 0;
			
			for(int j = 0; j < N; j++) { arr[Integer.valueOf(reader.readLine())]++; }
			for(int j = 0; j < 1001; j++) {
				if(arr[j] > arr[idx]) { idx = j; }
			}
			System.out.println(idx);
		}
	}
}
