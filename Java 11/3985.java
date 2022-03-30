/*
 * 제출 번호: 41246529
 * ID: adviate
 * 문제: 3985
 * 결과: 맞았습니다!!
 * 메모리: 14824 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 827 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int L = Integer.valueOf(reader.readLine()), N = Integer.valueOf(reader.readLine());
		int[] cake = new int[L];
		
		int maxSum = 0, maxExpect = 0, expectIdx = 0, realIdx = 0;
		for(int i = 0; i < N; i++) {
			String[] input = reader.readLine().split(" ");
			int begin = Integer.valueOf(input[0]), end = Integer.valueOf(input[1]), sum = 0;
			if(end - begin > maxExpect) { maxExpect = end - begin; expectIdx = i; }

			for(int j = begin - 1; j < end; j++) {
				if(cake[j] == 0) { cake[j] = (i + 1); sum++; }
			}
			if(sum > maxSum) { maxSum = sum; realIdx = i;}
		}
		System.out.println(expectIdx + 1);
		System.out.println(realIdx + 1);
	}
}
