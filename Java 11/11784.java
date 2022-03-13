/*
 * 제출 번호: 40342211
 * ID: adviate
 * 문제: 11784
 * 결과: 맞았습니다!!
 * 메모리: 14368 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 459 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = new String();

		while((input = reader.readLine()) != null) {
			StringBuilder ans = new StringBuilder();
			for(int i = 0; i < input.length(); i+=2) { ans.append((char)(Integer.parseInt(input.substring(i, i + 2), 16))); }
			
			System.out.println(ans);
		}
	}
}
