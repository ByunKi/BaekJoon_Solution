/*
 * 제출 번호: 38854353
 * ID: adviate
 * 문제: 10769
 * 결과: 맞았습니다!!
 * 메모리: 14104 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 642 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int happy = 0, sad = 0;
		String input = reader.readLine();
		
		for(int i = 0; i < input.length() - 2; i++) {
			if(input.substring(i, i+3).equals(":-)")) { happy++; }
			else if(input.substring(i, i+3).equals(":-(")) { sad++; }
		}
		
		if(happy == 0 && sad == 0) { System.out.println("none"); } 
		else if(happy > sad) { System.out.println("happy"); } 
		else if(happy == sad) { System.out.println("unsure"); } 
		else { System.out.println("sad"); }
	}
}
