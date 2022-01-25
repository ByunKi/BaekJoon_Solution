/*
 * 제출 번호: 38102881
 * ID: adviate
 * 문제: 15917
 * 결과: 맞았습니다!!
 * 메모리: 73588 KB
 * 시간: 520 ms
 * 언어: Java 11
 * 코드 길이: 510 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int num = Integer.parseInt(reader.readLine());
			
			if((num&-num) == num) { builder.append(1).append("\n"); } 
			else { builder.append(0).append("\n"); }
		}
		System.out.println(builder);
 	}
}
