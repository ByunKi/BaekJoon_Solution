/*
 * 제출 번호: 45342019
 * ID: adviate
 * 문제: 5751
 * 결과: 맞았습니다!!
 * 메모리: 17372 KB
 * 시간: 172 ms
 * 언어: Java 11
 * 코드 길이: 538 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int N = Integer.valueOf(reader.readLine());
			if(N == 0) { break; } 
			
			String[] input = reader.readLine().split(" ");
			int M = 0, J = 0;
			for(int i = 0; i < input.length; i++) {
				if(input[i].equals("0")) { M++; }
				else { J++; }
			}
			System.out.println("Mary won " + M + " times and John won " + J + " times");
		}
	}
}
