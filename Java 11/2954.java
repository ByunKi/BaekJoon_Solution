/*
 * 제출 번호: 39629748
 * ID: adviate
 * 문제: 2954
 * 결과: 맞았습니다!!
 * 메모리: 14116 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 670 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer buffer = new StringBuffer(reader.readLine());
		for(int i = 0; i < buffer.length(); i++) {
			switch(buffer.charAt(i)) {
				case 'a':
					buffer.replace(i+1, i+3, "");
					break;
				case 'e':
					buffer.replace(i+1, i+3, "");
					break;
				case 'i':
					buffer.replace(i+1, i+3, "");
					break;
				case 'o':
					buffer.replace(i+1, i+3, "");
					break;
				case 'u':
					buffer.replace(i+1, i+3, "");
					break;
			}
		}
		
		System.out.println(buffer);
	}
}
