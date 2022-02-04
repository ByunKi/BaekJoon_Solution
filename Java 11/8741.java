/*
 * 제출 번호: 38537131
 * ID: adviate
 * 문제: 8741
 * 결과: 맞았습니다!!
 * 메모리: 22000 KB
 * 시간: 264 ms
 * 언어: Java 11
 * 코드 길이: 427 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		int input = Integer.parseInt(reader.readLine());
		
		for(int i = 0; i < input; i++) { ans.append(1); }
		for(int i = 0; i < input - 1; i++) { ans.append(0); }
		System.out.println(ans.toString());
	}
}
