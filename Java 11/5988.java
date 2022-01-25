/*
 * 제출 번호: 38098732
 * ID: adviate
 * 문제: 5988
 * 결과: 맞았습니다!!
 * 메모리: 14388 KB
 * 시간: 140 ms
 * 언어: Java 11
 * 코드 길이: 484 B
 */

import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			BigInteger num = new BigInteger(reader.readLine());
			if(num.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
 	}
}
