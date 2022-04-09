/*
 * 제출 번호: 41726716
 * ID: adviate
 * 문제: 2903
 * 결과: 맞았습니다!!
 * 메모리: 14180 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 294 B
 */


import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(reader.readLine());
		
		System.out.println((long) Math.pow(1 + Math.pow(2, N), 2));
	}
}
