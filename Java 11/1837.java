/*
 * 제출 번호: 39959002
 * ID: adviate
 * 문제: 1837
 * 결과: 맞았습니다!!
 * 메모리: 288636 KB
 * 시간: 740 ms
 * 언어: Java 11
 * 코드 길이: 538 B
 */

import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int K = Integer.valueOf(input[1]), X = 0;
		BigInteger P = new BigInteger(input[0]);
		
		for(int i = 2; i < K; i++) { 
			if(P.mod(new BigInteger(Integer.toString(i))).equals(BigInteger.ZERO)) { X = i; break; }
		}
		
		System.out.println(X == 0 ? "GOOD" : "BAD " + X);
	}
}
