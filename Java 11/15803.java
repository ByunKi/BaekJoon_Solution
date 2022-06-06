/*
 * 제출 번호: 44243338
 * ID: adviate
 * 문제: 15803
 * 결과: 맞았습니다!!
 * 메모리: 14252 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 128 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double[][] mat = new double[3][2];
		
		for(int i = 0; i < 3; i++) {
			String[] input = reader.readLine().split(" ");
			mat[i][0] = Double.valueOf(input[0]);
			mat[i][1] = Double.valueOf(input[1]);
		}
		
		double A, B;
		try { A = (mat[1][0] - mat[0][0]) / (mat[1][1] - mat[0][1]); } 
		catch (ArithmeticException e) { A = 0; }
		
		try { B = (mat[2][0] - mat[1][0]) / (mat[2][1] - mat[1][1]); } 
		catch (ArithmeticException e) { B = 0; }
		
		System.out.println(A == B ? "WHERE IS MY CHICKEN?" : "WINNER WINNER CHICKEN DINNER!");
	}
}
