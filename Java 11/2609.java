/*
 * 제출 번호: 40195534
 * ID: adviate
 * 문제: 2609
 * 결과: 맞았습니다!!
 * 메모리: 16260 KB
 * 시간: 164 ms
 * 언어: Java 11
 * 코드 길이: 465 B
 */

import java.io.*;

public class Main {
	public static int GCD(int a, int b) {
		if(a % b == 0) { return b; }
		return GCD(b, a % b);
	}

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] input = reader.readLine().split(" ");
		int a = Integer.valueOf(input[0]), b = Integer.valueOf(input[1]), tmp = GCD(a, b);

		System.out.println(tmp + "\n" + a * b / tmp);
	}
}
