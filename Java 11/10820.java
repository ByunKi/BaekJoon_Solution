/*
 * 제출 번호: 38542360
 * ID: adviate
 * 문제: 10820
 * 결과: 맞았습니다!!
 * 메모리: 16132 KB
 * 시간: 188 ms
 * 언어: Java 11
 * 코드 길이: 686 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = new String();
		
		while((input = reader.readLine()) != null) {
			int[] arr = new int [4];
			
			for(int i = 0; i < input.length(); i++) {
				if(Character.isLowerCase(input.charAt(i))) { arr[0]++; }
				if(Character.isUpperCase(input.charAt(i))) { arr[1]++; }
				if(Character.isDigit(input.charAt(i))) { arr[2]++; }
				if(Character.isSpaceChar(input.charAt(i))) { arr[3]++; }
			}
			
			for(int i = 0; i < 4; i++) { System.out.print(arr[i] + " "); }
			System.out.println();
		}
	}
}
