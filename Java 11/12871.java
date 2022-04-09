/*
 * 제출 번호: 41727672
 * ID: adviate
 * 문제: 12871
 * 결과: 맞았습니다!!
 * 메모리: 14244 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 721 B
 */

import java.io.*;

public class Main {
	public static int GCD(int A, int B) {
		if(B == 0) { return A; }
		return GCD(B, A % B);
	}
	
	public static int LCM(int A, int B) {
		return A * B / GCD(A, B);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String A = reader.readLine(), B = reader.readLine();
		int lcm = LCM(A.length(), B.length());
		
		StringBuilder fA = new StringBuilder(A), fB = new StringBuilder(B);
		for(int i = 0; i < lcm / A.length() - 1; i++) { fA.append(A); }
		for(int i = 0; i < lcm / B.length() - 1; i++) { fB.append(B); }
		
		System.out.println(fA.toString().equals(fB.toString()) ? 1 : 0);
	}
}
