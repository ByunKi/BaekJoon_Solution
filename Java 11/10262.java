/*
 * 제출 번호: 38947673
 * ID: adviate
 * 문제: 10262
 * 결과: 맞았습니다!!
 * 메모리: 14208 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 590 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int G = 0, E = 0;
		
		String[] input = reader.readLine().split(" ");
		for(int i = 0; i < input.length; i++) { G += Integer.parseInt(input[i]); }
		
		input = reader.readLine().split(" ");
		for(int i = 0; i < input.length; i++) { E += Integer.parseInt(input[i]); }
		
		if(G > E) { System.out.println("Gunnar"); }
		else if(G == E) { System.out.println("Tie"); }
		else { System.out.println("Emma"); }
	}
}
