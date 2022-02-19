/*
 * 제출 번호: 39294259
 * ID: adviate
 * 문제: 17293
 * 결과: 출력 형식이 잘못되었습니다
 * 메모리:  KB
 * 시간:  ms
 * 언어: Java 11
 * 코드 길이: 930 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine());
		for(int i = N; i > 0; i--) {
			if(i > 1) {
				System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\r\n"
						+ "Take one down and pass it around, " + (i-1) + ((i-1) > 1 ? " bottles of beer on the wall." : " bottle of beer on the wall."));
			} else {
				System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\r\n"
						+ "Take one down and pass it around, no more bottles of beer on the wall.");
			}
			System.out.println();
		}
		
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.\r\n"
				+ "Go to the store and buy some more, " + N + (N > 1 ? " bottles of beer on the wall." : " bottle of beer on the wall."));
	}
}
