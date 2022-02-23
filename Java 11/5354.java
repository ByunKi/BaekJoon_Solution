/*
 * 제출 번호: 39486268
 * ID: adviate
 * 문제: 5354
 * 결과: 맞았습니다!!
 * 메모리: 14168 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 577 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int num = Integer.parseInt(reader.readLine());
			
			for(int j = 0; j < num; j++) {
				for(int k = 0; k < num; k++) { 
					if(k + 1 < num && k != 0 && j != 0 && j + 1 < num) { System.out.print("J"); }
					else { System.out.print("#"); }
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
