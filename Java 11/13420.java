/*
 * 제출 번호: 39388220
 * ID: adviate
 * 문제: 13420
 * 결과: 맞았습니다!!
 * 메모리: 14728 KB
 * 시간: 152 ms
 * 언어: Java 11
 * 코드 길이: 862 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			Long tmp = (long) 0;
			
			switch(input[1]) {
				case "+":
					tmp = Long.parseLong(input[0]) + Long.parseLong(input[2]);
					break;
				case "-":
					tmp = Long.parseLong(input[0]) - Long.parseLong(input[2]);
					break;
				case "*":
					tmp = Long.parseLong(input[0]) * Long.parseLong(input[2]);
					break;
				case "/":
					tmp = Long.parseLong(input[0]) / Long.parseLong(input[2]);
					break;
			}
			
			if(tmp == Long.parseLong(input[4])) { System.out.println("correct"); }
			else { System.out.println("wrong answer"); }
		}
	}
}
