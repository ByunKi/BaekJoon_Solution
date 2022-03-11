/*
 * 제출 번호: 40281683
 * ID: adviate
 * 문제: 5598
 * 결과: 맞았습니다!!
 * 메모리: 14668 KB
 * 시간: 172 ms
 * 언어: Java 11
 * 코드 길이: 408 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String input = reader.readLine();
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) < 'D') { System.out.print((char)(input.charAt(i) + 23)); }
			else { System.out.print((char)(input.charAt(i) - 3)); }
		}
	}
}
