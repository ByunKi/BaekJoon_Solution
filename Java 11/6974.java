/*
 * 제출 번호: 39165790
 * ID: adviate
 * 문제: 6974
 * 결과: 맞았습니다!!
 * 메모리: 14332 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 495 B
 */

import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(reader.readLine());
		for(int i = 0; i < TC; i++) {
			BigInteger A = new BigInteger(reader.readLine());
			BigInteger B = new BigInteger(reader.readLine());
			
			System.out.println(A.divide(B));
			System.out.println(A.mod(B));
			System.out.println();
		}
	}
}
