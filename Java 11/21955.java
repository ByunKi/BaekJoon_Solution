/*
 * 제출 번호: 40569293
 * ID: adviate
 * 문제: 21955
 * 결과: 맞았습니다!!
 * 메모리: 16056 KB
 * 시간: 152 ms
 * 언어: Java 11
 * 코드 길이: 344 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		System.out.println(input.substring(0, input.length() / 2) + " " + input.substring(input.length() / 2, input.length()));
	}
}
