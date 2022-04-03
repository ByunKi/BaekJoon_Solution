/*
 * 제출 번호: 41453413
 * ID: adviate
 * 문제: 5698
 * 결과: 맞았습니다!!
 * 메모리: 19580 KB
 * 시간: 256 ms
 * 언어: Java 11
 * 코드 길이: 609 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] input = reader.readLine().split(" ");
			boolean isTautogram = true;
			if(input[0].equals("*")) { break; }
			
			char ch = Character.toUpperCase(input[0].charAt(0));
			for(int i = 1; i < input.length; i++) {
				if(ch == Character.toUpperCase(input[i].charAt(0))) { isTautogram = true; }
				else { isTautogram = false; break; }
			}
			
			System.out.println(isTautogram ? "Y" : "N");
		} 
	}
}
