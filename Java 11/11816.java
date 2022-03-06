/*
 * 제출 번호: 40001703
 * ID: adviate
 * 문제: 11816
 * 결과: 맞았습니다!!
 * 메모리: 14184 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 457 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		String input = reader.readLine();

		if(input.contains("x")) { System.out.println(Integer.parseInt(input.substring(2, input.length()), 16)); }
		else if(input.charAt(0) == '0') { System.out.println(Integer.parseInt(input, 8)); }
		else { System.out.println(input); }
	}
}
