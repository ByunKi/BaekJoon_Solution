/*
 * 제출 번호: 45648146
 * ID: adviate
 * 문제: 20953
 * 결과: 맞았습니다!!
 * 메모리: 52704 KB
 * 시간: 564 ms
 * 언어: Java 11
 * 코드 길이: 532 B
 */

import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			int a = Integer.valueOf(input[0]), b = Integer.valueOf(input[1]);
			
			ans.append((a + b) * (((a + b) * (a + b - 1)) / 2)).append("\n");
		}
		System.out.println(ans);
	}
}
