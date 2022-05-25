/*
 * 제출 번호: 43789871
 * ID: adviate
 * 문제: 4562
 * 결과: 맞았습니다!!
 * 메모리: 14044 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 493 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			ans.append(Integer.valueOf(input[0]) >= Integer.valueOf(input[1]) ? "MMM BRAINS\n" : "NO BRAINS\n");
		}
		System.out.println(ans);
	}
}
