/*
 * 제출 번호: 39871271
 * ID: adviate
 * 문제: 2702
 * 결과: 맞았습니다!!
 * 메모리: 16708 KB
 * 시간: 232 ms
 * 언어: Java 11
 * 코드 길이: 564 B
 */

import java.io.*;

public class Main {
	public static int GCD(int A, int B) {
		if(A % B == 0) { return B; }
		return GCD(B, A % B);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) { 
			String[] input = reader.readLine().split(" ");
			int A = Integer.valueOf(input[0]), B = Integer.valueOf(input[1]);
			int gcd = GCD(A, B);
			
			System.out.println(A * B / gcd + " " + gcd);
		}
	}
}
