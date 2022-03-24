/*
 * 제출 번호: 40952783
 * ID: adviate
 * 문제: 21144
 * 결과: 맞았습니다!!
 * 메모리: 14192 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 485 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine()) + 1;
		String input = reader.readLine();
		
		while((N--) > 1) {
			String length = Integer.toString(N);
			
			if(input.endsWith(length)) { input = input.substring(0, input.length() - length.length()); }
			else { break; }
		}
		System.out.println(N);
	}
}
