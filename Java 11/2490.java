/*
 * 제출 번호: 38048977
 * ID: adviate
 * 문제: 2490
 * 결과: 맞았습니다!!
 * 메모리: 14184 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 624 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 3; i++) {
			String input = reader.readLine(); String[] tmp = input.split(" ");
			int cnt = 0;
			
			for(int j = 0; j < 4; j++) {
				if(tmp[j].equals("1")) { cnt++; }
			}
			
			if(cnt == 0) { System.out.println("D"); }
			else if(cnt == 1) { System.out.println("C"); }
			else if(cnt == 2) { System.out.println("B"); }
			else if(cnt == 3) { System.out.println("A"); }
			else { System.out.println("E"); }
		}
 	}
}
