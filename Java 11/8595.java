/*
 * 제출 번호: 39161569
 * ID: adviate
 * 문제: 8595
 * 결과: 맞았습니다!!
 * 메모리: 67308 KB
 * 시간: 464 ms
 * 언어: Java 11
 * 코드 길이: 704 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.parseInt(reader.readLine());
		long sum = 0;
		char[] input = reader.readLine().toCharArray();
		
		StringBuilder tmp = new StringBuilder();
		for(int i = 0; i < input.length; i++) {
			if(Character.isDigit(input[i])) {
				tmp.append(input[i]);
				
				if(i == input.length - 1) { sum += Integer.parseInt(tmp.toString()); }
			} else { 
				if(tmp.length() > 0) {
					sum += Integer.parseInt(tmp.toString());
					tmp = tmp.delete(0, tmp.length());
				}
			}
		}
		System.out.println(sum);
	}
}
