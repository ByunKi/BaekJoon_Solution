/*
 * 제출 번호: 39959939
 * ID: adviate
 * 문제: 14659
 * 결과: 맞았습니다!!
 * 메모리: 20844 KB
 * 시간: 500 ms
 * 언어: Java 11
 * 코드 길이: 729 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine());
		String[] input = reader.readLine().split(" ");
		
		int[] arr = new int[N], kills = new int[N];
		for(int i = 0; i < arr.length; i++) { arr[i] = Integer.valueOf(input[i]); }
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = (i + 1); j < kills.length; j++) {
				if(arr[i] > arr[j]) { kills[i]++; }
				else { break; }
			}
		}
		
		int max = -1;
		for(int i = 0; i < kills.length; i++) {
			if(max < kills[i]) { max = kills[i]; }
		}
		
		System.out.println(max);
	}
}
