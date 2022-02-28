/*
 * 제출 번호: 39725164
 * ID: adviate
 * 문제: 5235
 * 결과: 맞았습니다!!
 * 메모리: 14968 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 816 B
 */

import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			BigInteger odd = BigInteger.ZERO, even = BigInteger.ZERO;
			
			for(int j = 1; j < input.length; j++) {
				if(new BigInteger(input[j]).mod(BigInteger.TWO).equals(BigInteger.ZERO)) { even = even.add(new BigInteger(input[j])); }
				else { odd = odd.add(new BigInteger(input[j])); }
			}
			
			int cmp = even.compareTo(odd);
			if(cmp > 0) { System.out.println("EVEN"); }
			else if(cmp == 0) { System.out.println("TIE"); }
			else { System.out.println("ODD"); }
		}
	}
}
