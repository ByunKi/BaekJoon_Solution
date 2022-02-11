/*
 * 제출 번호: 38920248
 * ID: adviate
 * 문제: 6438
 * 결과: 맞았습니다!!
 * 메모리: 14128 KB
 * 시간: 116 ms
 * 언어: Java 11
 * 코드 길이: 345 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) { System.out.println(new StringBuffer(reader.readLine()).reverse().toString()); }
	}
}
