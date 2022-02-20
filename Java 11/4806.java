/*
 * 제출 번호: 39333952
 * ID: adviate
 * 문제: 4806
 * 결과: 맞았습니다!!
 * 메모리: 14172 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 324 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = new String();
		int cnt = 0;
		
		while((input = reader.readLine()) != null) {
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
