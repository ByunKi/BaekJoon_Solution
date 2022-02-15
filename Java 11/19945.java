/*
 * 제출 번호: 39090147
 * ID: adviate
 * 문제: 19945
 * 결과: 맞았습니다!!
 * 메모리: 14276 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 296 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(reader.readLine());
		System.out.println(Integer.toBinaryString(num).length());
	}
}
