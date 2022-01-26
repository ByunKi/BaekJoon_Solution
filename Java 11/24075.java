/*
 * 제출 번호: 38151163
 * ID: adviate
 * 문제: 24075
 * 결과: 맞았습니다!!
 * 메모리: 14180 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 385 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = reader.readLine().split(" ");
		int A = Integer.parseInt(arr[0]), B = Integer.parseInt(arr[1]);
		
		System.out.println(Math.max(A+B, A-B));
		System.out.println(Math.min(A+B, A-B));
 	}
}
