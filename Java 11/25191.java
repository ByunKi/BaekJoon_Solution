/*
 * 제출 번호: 43789713
 * ID: adviate
 * 문제: 25191
 * 결과: 맞았습니다!!
 * 메모리: 14144 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 406 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine()), A, B;
		String[] input = reader.readLine().split(" ");
		A = Integer.valueOf(input[0]) / 2; B = Integer.valueOf(input[1]);
		
		System.out.println(Math.min(N, A + B));
	}
}
