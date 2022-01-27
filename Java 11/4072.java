/*
 * 제출 번호: 38200790
 * ID: adviate
 * 문제: 4072
 * 결과: 맞았습니다!!
 * 메모리: 14624 KB
 * 시간: 164 ms
 * 언어: Java 11
 * 코드 길이: 516 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String input = reader.readLine();
			if(input.equals("#")) { break; }
			
			String[] arr = input.split(" ");
			for(int i = 0; i < arr.length; i++) {
				for(int j = arr[i].length()-1; j >= 0; j--) {
					System.out.print(arr[i].charAt(j));
				}
				System.out.print(" ");
			}
			System.out.println();
		}
 	}
}
