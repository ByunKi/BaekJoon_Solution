/*
 * 제출 번호: 41228001
 * ID: adviate
 * 문제: 2729
 * 결과: 맞았습니다!!
 * 메모리: 14368 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 487 B
 */

import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			BigInteger A = new BigInteger(input[0], 2), B = new BigInteger(input[1], 2);
			
			A = A.add(B);
			System.out.println(A.toString(2));
		}
	}
}
