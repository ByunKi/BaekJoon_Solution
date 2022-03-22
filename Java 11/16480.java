/*
 * 제출 번호: 40847719
 * ID: adviate
 * 문제: 16480
 * 결과: 맞았습니다!!
 * 메모리: 14220 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 479 B
 */

import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] input = reader.readLine().split(" ");
		int R = Integer.valueOf(input[0]), r = Integer.valueOf(input[1]);
		
		BigInteger ans = new BigInteger(input[0]), tmp = new BigInteger(String.valueOf(2 * r));
		System.out.println(ans.multiply(ans.subtract(tmp)));
	}
}
