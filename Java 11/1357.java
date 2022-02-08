/*
 * 제출 번호: 38760449
 * ID: adviate
 * 문제: 1357
 * 결과: 맞았습니다!!
 * 메모리: 14200 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 495 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int A = Integer.parseInt(new StringBuffer(input[0]).reverse().toString());
		int B = Integer.parseInt(new StringBuffer(input[1]).reverse().toString());
		
		System.out.println(Integer.parseInt(new StringBuffer(Integer.toString(A+B)).reverse().toString()));
	}
}
