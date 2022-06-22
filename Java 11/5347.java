/*
 * 제출 번호: 44871523
 * ID: adviate
 * 문제: 5347
 * 결과: 맞았습니다!!
 * 메모리: 13984 KB
 * 시간: 116 ms
 * 언어: Java 11
 * 코드 길이: 673 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			long A = Long.valueOf(input[0]), B = Long.valueOf(input[1]);
			
			ans.append(LCM(A, B)).append("\n");
		}
		System.out.println(ans);
	}
	
	public static long GCD(long A, long B) {
		if(A % B == 0) { return B; }
		return GCD(B, A % B);
	}
	
	public static long LCM(long A, long B) {
		return A * B / GCD(A, B);
	}
}
