/*
 * 제출 번호: 41190510
 * ID: adviate
 * 문제: 17530
 * 결과: 맞았습니다!!
 * 메모리: 14756 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 437 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(reader.readLine()), idx = 0;
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) { 
			arr[i] = Integer.valueOf(reader.readLine()); 
			if(arr[i] > arr[idx]) { idx = i; }
		}
		
		System.out.println(idx == 0 ? "S" : "N");
	}
}
