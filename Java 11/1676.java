/*
 * 제출 번호: 41759555
 * ID: adviate
 * 문제: 1676
 * 결과: 맞았습니다!!
 * 메모리: 14780 KB
 * 시간: 140 ms
 * 언어: Java 11
 * 코드 길이: 657 B
 */

import java.io.*;
import java.math.BigInteger;

public class Main {
	public static BigInteger fact(BigInteger N) {
		if(N.compareTo(BigInteger.ZERO) == 0) { return BigInteger.ONE;}
		return N = N.multiply(fact(N.subtract(BigInteger.ONE)));
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger N = new BigInteger(reader.readLine());
		int cnt = 0;
		
		StringBuffer buffer = new StringBuffer(fact(N).toString());
		for(int i = buffer.length() - 1; i >= 0; i--) {
			if(buffer.charAt(i) != '0') { break; }
			cnt++;
		}
		System.out.println(cnt);
	}
}
