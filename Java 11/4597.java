/*
 * 제출 번호: 39151105
 * ID: adviate
 * 문제: 4597
 * 결과: 맞았습니다!!
 * 메모리: 14180 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 737 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = new String();
		
		while((input = reader.readLine()) != null) {
			if(input.equals("#")) { break; }
			
			int cnt = 0;
			for(int i = 0; i < input.length(); i++) {
				if(input.charAt(i) == '1') { cnt++; }
			}
			
			if(input.contains("e")) {
				if(cnt % 2 == 0) { input = input.replace('e', '0'); } 
				else { input = input.replace('e', '1'); }
			}
			
			if(input.contains("o")) {
				if(cnt % 2 == 0) { input = input.replace('o', '1'); } 
				else { input = input.replace('o', '0'); }
			}
			
			System.out.println(input);
		}
	}
}
