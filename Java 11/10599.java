/*
 * 제출 번호: 38264628
 * ID: adviate
 * 문제: 10599
 * 결과: 맞았습니다!!
 * 메모리: 16012 KB
 * 시간: 152 ms
 * 언어: Java 11
 * 코드 길이: 568 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] input = reader.readLine().split(" ");
			if(input[0].equals("0") && input[1].equals("0") && input[2].equals("0") && input[3].equals("0")) { break; }
			
			int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]), c = Integer.parseInt(input[2]), d = Integer.parseInt(input[3]);
			System.out.println(Math.abs(c-b) + " " + Math.abs(d-a));
		}
 	}
}
