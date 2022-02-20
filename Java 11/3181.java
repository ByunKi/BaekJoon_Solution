/*
 * 제출 번호: 39337599
 * ID: adviate
 * 문제: 3181
 * 결과: 맞았습니다!!
 * 메모리: 14248 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 720 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = reader.readLine().split(" ");
		
		System.out.print((char)(input[0].charAt(0) - 32));
		for(int i = 1; i < input.length; i++) {
			switch(input[i]) {
				case "i":
					continue;
				case "pa":
					continue;
				case "te":
					continue;
				case "ni":
					continue;
				case "niti":
					continue;
				case "a":
					continue;
				case "ali":
					continue;
				case "nego":
					continue;
				case "no":
					continue;
				case "ili":
					continue;
			}
			System.out.print((char)(input[i].charAt(0) - 32));
		}
	}
}
