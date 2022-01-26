/*
 * 제출 번호: 38152151
 * ID: adviate
 * 문제: 24079
 * 결과: 맞았습니다!!
 * 메모리: 14052 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 416 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(reader.readLine())*60, B = Integer.parseInt(reader.readLine())*60, C  = Integer.parseInt(reader.readLine())*60;
		
		if(A+B > C+30) { System.out.println(0); } 
		else { System.out.println(1); }
 	}
}
