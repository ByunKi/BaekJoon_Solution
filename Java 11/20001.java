/*
 * 제출 번호: 39121133
 * ID: adviate
 * 문제: 20001
 * 결과: 맞았습니다!!
 * 메모리: 14264 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 586 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = new String();
		int problems = 0;
		
		while((input = reader.readLine()) != null) {
			if(input.equals("고무오리 디버깅 끝")) { break; }
			if(input.equals("문제")) { problems++; }
			if(input.equals("고무오리")) {
				if(problems == 0) { problems += 2; }
				else { problems--; }
			}
		}
		
		System.out.println(problems == 0 ? "고무오리야 사랑해" : "힝구");
	}
}
