/*
 * 제출 번호: 39129495
 * ID: adviate
 * 문제: 20113
 * 결과: 맞았습니다!!
 * 메모리: 14264 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 751 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		int[] arr = new int[N];
		
		String[] input = reader.readLine().split(" ");
		for(int i = 0; i < N; i++) { 
			if(Integer.parseInt(input[i]) == 0) { continue; }
			else { arr[Integer.parseInt(input[i]) - 1]++; }
		}
		
		boolean isRedundant = false;
		int max = -1, idx = 0;
		for(int i = 0; i < N; i++) {
			if(max < arr[i]) {
				idx = i;
				max = arr[i];
				isRedundant = false;
			} else if(max == arr[i]) {
				isRedundant = true;
			}
		}
		
		System.out.println(isRedundant == true ? "skipped" : idx + 1);
	}
}
