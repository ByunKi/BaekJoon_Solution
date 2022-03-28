/*
 * 제출 번호: 41136284
 * ID: adviate
 * 문제: 24883
 * 결과: 맞았습니다!!
 * 메모리: 14180 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 312 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		char input = reader.readLine().charAt(0);
		System.out.println((input == 'n' || input == 'N') ? "Naver D2" : "Naver Whale");
	}
}
