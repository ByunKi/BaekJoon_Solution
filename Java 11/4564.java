/*
 * 제출 번호: 40502985
 * ID: adviate
 * 문제: 4564
 * 결과: 맞았습니다!!
 * 메모리: 14452 KB
 * 시간: 156 ms
 * 언어: Java 11
 * 코드 길이: 560 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String input = reader.readLine();
			if(input.equals("0")) { break; }
			
			System.out.print(input + " ");
			while(input.length() > 1) {
				int value = 1;
				for(int i = 0; i < input.length(); i++) { value *= (int)(input.charAt(i) - 48); }
				System.out.print(value + " ");
				
				input = Integer.toString(value);
			}
			System.out.println();
		}
	}
}
