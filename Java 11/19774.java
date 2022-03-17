/*
 * 제출 번호: 40569227
 * ID: adviate
 * 문제: 19774
 * 결과: 맞았습니다!!
 * 메모리: 17568 KB
 * 시간: 364 ms
 * 언어: Java 11
 * 코드 길이: 465 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String input = reader.readLine();
			int A = Integer.valueOf(input.substring(0, 2)), B = Integer.valueOf(input.substring(2, 4));
			
			System.out.println((A*A + B*B) % 7 == 1 ? "YES" : "NO");
		}
	}
}
