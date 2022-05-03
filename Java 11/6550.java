/*
 * 제출 번호: 42818431
 * ID: adviate
 * 문제: 6550
 * 결과: 맞았습니다!!
 * 메모리: 16128 KB
 * 시간: 176 ms
 * 언어: Java 11
 * 코드 길이: 533 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = new String();

		while((input = reader.readLine()) != null) {
			String[] tmp = input.split(" ");
			int idx = 0;

			for(int j = 0; j < tmp[1].length(); j++) {
				if(tmp[0].charAt(idx) == tmp[1].charAt(j)) { idx++; }
				if(idx == tmp[0].length()) { break; }
			}
			System.out.println(idx == tmp[0].length() ? "Yes" : "No");
		}
	}
}
