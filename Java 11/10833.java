/*
 * 제출 번호: 42498781
 * ID: adviate
 * 문제: 10833
 * 결과: 100점
 * 메모리: 14240 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 445 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine()), sum = 0;
		for(int i = 0; i < N; i++) {
			String[] input = reader.readLine().split(" ");
			int A = Integer.valueOf(input[0]), B = Integer.valueOf(input[1]);
			
			sum += B % A; 
		}
		System.out.println(sum);
	}
}
