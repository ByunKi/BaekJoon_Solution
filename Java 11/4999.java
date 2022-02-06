/*
 * 제출 번호: 38633122
 * ID: adviate
 * 문제: 4999
 * 결과: 맞았습니다!!
 * 메모리: 14308 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 341 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String P = reader.readLine(), D = reader.readLine();
		
		if(P.length() >= D.length()) { System.out.println("go"); }
		else { System.out.println("no"); }
 	}
}
