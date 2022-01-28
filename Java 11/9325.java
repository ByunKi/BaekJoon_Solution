/*
 * 제출 번호: 38263742
 * ID: adviate
 * 문제: 9325
 * 결과: 맞았습니다!!
 * 메모리: 33536 KB
 * 시간: 340 ms
 * 언어: Java 11
 * 코드 길이: 591 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(reader.readLine());
		for(int i = 0; i < num; i++) {
			int price = Integer.parseInt(reader.readLine()), options = Integer.parseInt(reader.readLine());
			
			for(int j = 0; j < options; j++) {
				String[] arr = reader.readLine().split(" ");
				int p = Integer.parseInt(arr[0]), q = Integer.parseInt(arr[1]);
				price += (p*q);
			}
			
			System.out.println(price);
		}
 	}
}
