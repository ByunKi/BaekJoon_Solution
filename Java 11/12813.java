/*
 * 제출 번호: 38635886
 * ID: adviate
 * 문제: 12813
 * 결과: 맞았습니다!!
 * 메모리: 87544 KB
 * 시간: 3496 ms
 * 언어: Java 11
 * 코드 길이: 894 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] A = reader.readLine().split(""), B = reader.readLine().split("");
		
		for(int i = 0; i < A.length; i++) { System.out.print(Integer.parseInt(A[i]) & Integer.parseInt(B[i])); }
		System.out.println();
		
		for(int i = 0; i < A.length; i++) { System.out.print(Integer.parseInt(A[i]) | Integer.parseInt(B[i])); }
		System.out.println();
		
		for(int i = 0; i < A.length; i++) { System.out.print(Integer.parseInt(A[i]) ^ Integer.parseInt(B[i])); }
		System.out.println();
		
		for(int i = 0; i < A.length; i++) { System.out.print(Integer.parseInt(A[i]) ^ 1); }
		System.out.println();
		
		for(int i = 0; i < A.length; i++) { System.out.print(Integer.parseInt(B[i]) ^ 1); }
		System.out.println();

 	}
}
