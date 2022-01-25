/*
 * 제출 번호: 38100009
 * ID: adviate
 * 문제: 20673
 * 결과: 맞았습니다!!
 * 메모리: 14144 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 427 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int p = Integer.parseInt(reader.readLine()), q = Integer.parseInt(reader.readLine());
		
		if(p <= 50 && q <= 10) { System.out.println("White"); } 
		else if (q > 30) { System.out.println("Red"); } 
		else { System.out.println("Yellow"); }
 	}
}
