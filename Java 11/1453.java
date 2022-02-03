/*
 * 제출 번호: 38488659
 * ID: adviate
 * 문제: 1453
 * 결과: 맞았습니다!!
 * 메모리: 14192 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 502 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean[] check = new boolean[101];
		
		int N = Integer.parseInt(reader.readLine()), cnt = 0;
		String[] arr = reader.readLine().split(" ");	
		for(int i = 0; i < arr.length; i++) {
			if(check[Integer.parseInt(arr[i])]) { cnt++; }
			else { check[Integer.parseInt(arr[i])] = true; }
		}
		
		System.out.println(cnt);
 	}
}
