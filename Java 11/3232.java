/*
 * 제출 번호: 44367575
 * ID: adviate
 * 문제: 3232
 * 결과: 맞았습니다!!
 * 메모리: 14108 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 680 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			boolean check = false;
			
			for(int j = 2; j <= 16; j++) {
				try {
					if(Integer.parseInt(input[0], j) * Integer.parseInt(input[1], j) == Integer.parseInt(input[2], j)) { 
						System.out.println(j); 
						check = true; 
						break; 
					}
				} catch(NumberFormatException e) {
					continue;
				}
			}		
			if(!check) { System.out.println(0); }
		}
	}
}
