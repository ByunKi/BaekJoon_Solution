/*
 * 제출 번호: 38095587
 * ID: adviate
 * 문제: 5597
 * 결과: 맞았습니다!!
 * 메모리: 14268 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 457 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[28];
		boolean[] check = new boolean[30];
		for(int i = 0; i < 28; i++) { 
			arr[i] = Integer.parseInt(reader.readLine());
			check[arr[i]-1] = true;
		}
		
		for(int i = 0; i < 30; i++) {
			if(!check[i]) {
				System.out.println(i + 1);
			}
		}
 	}
}
