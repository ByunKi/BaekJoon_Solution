/*
 * 제출 번호: 39583251
 * ID: adviate
 * 문제: 1032
 * 결과: 맞았습니다!!
 * 메모리: 14216 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 586 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		String[] input = new String[TC];
		
		input[0] = reader.readLine();
		StringBuffer ans = new StringBuffer(input[0]);
		
		for(int i = 1; i < TC; i++) {
			input[i] = reader.readLine();
			for(int j = 0; j < input[i].length(); j++) {
				if(input[i-1].charAt(j) != input[i].charAt(j)) { ans.replace(j, j+1, "?"); }
			}
		}
		System.out.println(ans);
	}
}
