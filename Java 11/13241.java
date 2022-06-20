/*
 * 제출 번호: 44777917
 * ID: adviate
 * 문제: 13241
 * 결과: 맞았습니다!!
 * 메모리: 14228 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 511 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		long A = Long.valueOf(input[0]), B = Long.valueOf(input[1]);
		
		System.out.println(LCM(A, B));
	}
	
	public static long GCD(long A, long B) {
		if(A % B == 0) { return B; }
		return GCD(B, A % B);
	}
	
	public static long LCM(long A, long B) {
		return A * B / GCD(A, B);
	}
}
