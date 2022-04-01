/*
 * 제출 번호: 41309334
 * ID: adviate
 * 문제: 4150
 * 결과: 맞았습니다!!
 * 메모리: 16588 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 505 B
 */

import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(reader.readLine());
		
		BigInteger[] arr = new BigInteger[N + 1];
		arr[0] = BigInteger.ZERO; arr[1] = BigInteger.ONE;
		
		if(N > 1) {
			for(int i = 2; i <= N; i++) { arr[i] = arr[i - 1].add(arr[i - 2]); }
		}
		System.out.println(arr[N]);
	}
}
