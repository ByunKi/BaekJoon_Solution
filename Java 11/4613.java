/*
 * 제출 번호: 38990571
 * ID: adviate
 * 문제: 4613
 * 결과: 맞았습니다!!
 * 메모리: 14084 KB
 * 시간: 116 ms
 * 언어: Java 11
 * 코드 길이: 475 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String input = reader.readLine();
			if(input.equals("#")) { break; }
			
			int sum = 0;
			for(int i = 0; i < input.length(); i++) {
				if(input.charAt(i) == ' ') { continue; }
				sum += ((input.charAt(i) - 'A' + 1) * (i + 1));
			}
			System.out.println(sum);
		}
	}
}
