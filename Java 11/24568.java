/*
 * 제출 번호: 42153427
 * ID: adviate
 * 문제: 24568
 * 결과: 맞았습니다!!
 * 메모리: 14216 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 317 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int R = Integer.valueOf(reader.readLine()), S = Integer.valueOf(reader.readLine());
		System.out.println((R * 8 + S * 3) - 28);
	}
}
