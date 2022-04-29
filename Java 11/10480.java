/*
 * 제출 번호: 42641648
 * ID: adviate
 * 문제: 10480
 * 결과: 맞았습니다!!
 * 메모리: 14524 KB
 * 시간: 136 ms
 * 언어: Java 11
 * 코드 길이: 396 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int num = Integer.valueOf(reader.readLine());
			System.out.println(num % 2 == 0 ? (num + " is even") : (num + " is odd"));
		}
	}
}
