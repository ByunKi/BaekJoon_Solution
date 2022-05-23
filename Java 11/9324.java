/*
 * 제출 번호: 43662653
 * ID: adviate
 * 문제: 9324
 * 결과: 맞았습니다!!
 * 메모리: 33384 KB
 * 시간: 368 ms
 * 언어: Java 11
 * 코드 길이: 747 B
 */

import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int[] checks = new int[26];
			Boolean flag = true;
			
			String input = reader.readLine();
			for(int j = 0; j < input.length(); j++) { 
				int num = input.charAt(j) - 'A';
				checks[num]++;
				
				if(checks[num] > 0 && checks[num] % 3 == 0) { 
					if(j == input.length() - 1) { flag = false; break; }
					if(input.charAt(j) != input.charAt(j + 1)) { flag = false; break; }
					else { checks[num] = 0; j++; }
				}
			}
			System.out.println(flag ? "OK" : "FAKE");
		}
	}
}
