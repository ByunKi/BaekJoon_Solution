/*
 * 제출 번호: 42593982
 * ID: adviate
 * 문제: 5220
 * 결과: 맞았습니다!!
 * 메모리: 14036 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 623 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int cnt = 0;
			String[] input = reader.readLine().split(" ");
			input[0] = Integer.toBinaryString(Integer.valueOf(input[0]));
			
			for(int j = 0; j < input[0].length(); j++) {
				if(input[0].charAt(j) == '1') { cnt++; }
			}
			int isOdd = (cnt % 2 == 0) ? 0 : 1;
			System.out.println(Integer.valueOf(input[1]) == isOdd ? "Valid" : "Corrupt");
		}
	}
}
