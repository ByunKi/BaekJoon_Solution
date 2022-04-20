/*
 * 제출 번호: 42243475
 * ID: adviate
 * 문제: 12790
 * 결과: 맞았습니다!!
 * 메모리: 16888 KB
 * 시간: 192 ms
 * 언어: Java 11
 * 코드 길이: 686 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			
			int[] arr = new int[4];
			for(int j = 0; j < input.length; j++) { arr[j % 4] += Integer.valueOf(input[j]); }
			
			if(arr[0] < 1) { arr[0] = 1; }
			if(arr[1] < 1) { arr[1] = 1; }
			if(arr[2] < 0) { arr[2] = 0; }
			
			ans.append(arr[0] + arr[1] * 5 + arr[2] * 2 + arr[3] * 2 + "\n");
		}
		System.out.println(ans);
	}
}
