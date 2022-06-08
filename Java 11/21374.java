/*
 * 제출 번호: 44325215
 * ID: adviate
 * 문제: 21734
 * 결과: 맞았습니다!!
 * 메모리: 14152 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 532 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		String input = reader.readLine();
		for(int i = 0; i < input.length(); i++) {
			int tmp = input.charAt(i), size = 0;
			while(tmp != 0) {
				size += (tmp % 10);
				tmp /= 10;
			}
			for(int j = 0; j < size; j++) { ans.append(input.charAt(i)); }
			ans.append("\n");
		}
		System.out.println(ans);
	}
}
