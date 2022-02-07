/*
 * 제출 번호: 38688710
 * ID: adviate
 * 문제: 21567
 * 결과: 맞았습니다!!
 * 메모리: 14412 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 596 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] nums = new int[10];
		
		long A = Long.parseLong(reader.readLine()), B = Long.parseLong(reader.readLine()), C = Long.parseLong(reader.readLine());
		String tmp = Long.toString(A*B*C);

		for(int i = 0; i < tmp.length(); i++) {
			for(int j = 0; j < 10; j++) {
				if(tmp.charAt(i) == Integer.toString(j).charAt(0)) { nums[j]++; }
			}
		}

		for(int i = 0; i < 10; i++) { System.out.println(nums[i]); }
 	}
}
