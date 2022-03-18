/*
 * 제출 번호: 40616951
 * ID: adviate
 * 문제: 20360
 * 결과: 맞았습니다!!
 * 메모리: 16308 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 605 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		char[] input = Integer.toBinaryString(Integer.valueOf(reader.readLine())).toCharArray();
		int num = input.length - 1;
		int[] ans = new int[input.length];
		for(int i = 0; i < ans.length; i++) { ans[i] = -1; }
		
		for(int i = 0; i < input.length; i++) {
			if(input[i] == '1') { ans[i] = num; }
			num--;
		}
		
		for(int i = ans.length - 1; i >= 0; i--) {
			if(ans[i] >= 0) { System.out.print(ans[i] + " "); }
		}
	}
}
