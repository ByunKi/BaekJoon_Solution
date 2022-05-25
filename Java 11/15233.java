/*
 * 제출 번호: 43790063
 * ID: adviate
 * 문제: 15233
 * 결과: 맞았습니다!!
 * 메모리: 14240 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 605 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		String tA = reader.readLine(), tB = reader.readLine();
		input = reader.readLine().split(" ");
		
		int A = 0,B = 0;
		for(int i = 0; i < input.length; i++) {
			if(tA.contains(input[i])) { A++; }
			if(tB.contains(input[i])) { B++; }
		}
		
		if(A > B) { System.out.println("A"); }
		else if(A == B) { System.out.println("TIE"); }
		else { System.out.println("B"); }
	}
}
