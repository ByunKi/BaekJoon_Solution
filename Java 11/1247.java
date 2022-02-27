/*
 * 제출 번호: 39672522
 * ID: adviate
 * 문제: 1247
 * 결과: 맞았습니다!!
 * 메모리: 116692 KB
 * 시간: 720 ms
 * 언어: Java 11
 * 코드 길이: 598 B
 */

import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 3; i++) {
			int N = Integer.valueOf(reader.readLine());
			BigInteger sum = BigInteger.ZERO;
			for(int j = 0; j < N; j++) { sum = sum.add(new BigInteger(reader.readLine())); }
			
			if(sum.compareTo(BigInteger.ZERO) > 0) { System.out.println("+"); }
			else if(sum.equals(BigInteger.ZERO)) { System.out.println(0); }
			else { System.out.println("-"); }
		}
	}
}
