/*
 * 제출 번호: 39871151
 * ID: adviate
 * 문제: 10174
 * 결과: 맞았습니다!!
 * 메모리: 14052 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 682 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
		
			StringBuffer input = new StringBuffer(reader.readLine());
			for(int j = 0; j < input.length(); j++) {
				if(Character.isUpperCase(input.charAt(j))) { 
					input.insert(j, Character.toLowerCase(input.charAt(j)));   
					input.deleteCharAt(j + 1);
				}
			}
			String reverse = new StringBuffer(input.toString()).reverse().toString();
			System.out.println(input.toString().equals(reverse) ? "Yes" : "No");
		}
	}
}
