/*
 * 제출 번호: 38152641
 * ID: adviate
 * 문제: 24072
 * 결과: 맞았습니다!!
 * 메모리: 14184 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 416 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = reader.readLine().split(" ");
		int A = Integer.parseInt(arr[0]), B = Integer.parseInt(arr[1]), C  = Integer.parseInt(arr[2]);
		
		if(A <= C && B > C) { System.out.println(1); } 
		else { System.out.println(0); }
 	}
}
