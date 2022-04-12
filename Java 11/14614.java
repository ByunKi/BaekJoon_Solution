/*
 * 제출 번호: 41896624
 * ID: adviate
 * 문제: 14614
 * 결과: 맞았습니다!!
 * 메모리: 14232 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 435 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int A = Integer.valueOf(input[0]), B =  Integer.valueOf(input[1]);
		
		if((input[2].charAt(input[2].length() - 1) - '0') % 2 == 0) { System.out.println(A); }
		else { System.out.println(A ^ B); }
	}
}
