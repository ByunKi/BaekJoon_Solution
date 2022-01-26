/*
 * 제출 번호: 38157082
 * ID: adviate
 * 문제: 2154
 * 결과: 맞았습니다!!
 * 메모리: 17008 KB
 * 시간: 168 ms
 * 언어: Java 11
 * 코드 길이: 405 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		
		StringBuilder str = new StringBuilder();
		for(int i = 1; i <= num; i++) { str.append(i); }

		System.out.println(str.toString().indexOf(Integer.toString(num)) + 1);
 	}
}
