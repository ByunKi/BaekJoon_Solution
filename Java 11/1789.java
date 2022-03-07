/*
 * 제출 번호: 40048078
 * ID: adviate
 * 문제: 1789
 * 결과: 맞았습니다!!
 * 메모리: 31760 KB
 * 시간: 164 ms
 * 언어: Java 11
 * 코드 길이: 545 B
 */

import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger N = new BigInteger(reader.readLine()), sum = BigInteger.ZERO, num = BigInteger.ONE, cnt = BigInteger.ZERO;
		
		while(true) {
			sum = sum.add(num);
			cnt = cnt.add(BigInteger.ONE);
			
			if(sum.compareTo(N) > 0) { break; }
			num = num.add(BigInteger.ONE);
		}
		System.out.println(cnt.subtract(BigInteger.ONE));
	}
}
