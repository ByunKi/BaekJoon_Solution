/*
 * 제출 번호: 38948164
 * ID: adviate
 * 문제: 4435
 * 결과: 맞았습니다!!
 * 메모리: 14956 KB
 * 시간: 148 ms
 * 언어: Java 11
 * 코드 길이: 899 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] GA = {1, 2, 3, 3, 4, 10};
		int[] SA = {1, 2, 2, 2, 3, 5, 10};
		
		int TC = Integer.parseInt(reader.readLine());
		for(int t = 0; t < TC; t++) {
			int A = 0, B = 0;
			
			String[] input = reader.readLine().split(" ");
			for(int i = 0; i < input.length; i++) { A += (Integer.parseInt(input[i]) * GA[i]); }
			
			input = reader.readLine().split(" ");
			for(int i = 0; i < input.length; i++) { B += (Integer.parseInt(input[i]) * SA[i]); }
			
			System.out.print("Battle " + (t+1) + ": ");
			if(B > A) { System.out.println("Evil eradicates all trace of Good"); }
			else if(A == B) { System.out.println("No victor on this battle field"); }
			else { System.out.println("Good triumphs over Evil"); }
		}
	}
}
