/*
 * 제출 번호: 41142921
 * ID: adviate
 * 문제: 24313
 * 결과: 맞았습니다!!
 * 메모리: 14164 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 516 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] input = reader.readLine().split(" ");
		int a1 = Integer.valueOf(input[0]), a0 = Integer.valueOf(input[1]), c = Integer.valueOf(reader.readLine()), n0 = Integer.valueOf(reader.readLine());
		
		if(a1 == c && a0 < 0) { System.out.println(1); }
		else { System.out.println(a1 >= c ? 0 : a1 * n0 + a0 <= n0 * c ? 1 : 0); }
	}
}
