/*
 * 제출 번호: 39292331
 * ID: adviate
 * 문제: 2765
 * 결과: 맞았습니다!!
 * 메모리: 16732 KB
 * 시간: 188 ms
 * 언어: Java 11
 * 코드 길이: 609 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int nums = 1;
		while(true) {
			String[] input = reader.readLine().split(" ");
			if(input[1].equals("0")) { break; }
			
			double A = (3.1415927f * Double.parseDouble(input[0])) * Double.parseDouble(input[1]);
			double B = A /  12f / 5280f;
			double C = B / Double.parseDouble(input[2]) * 3600f;
			
			System.out.println("Trip #" + (nums++) + ": " + String.format("%.2f", B) + " " + String.format("%.2f", C));
		}
	}
}
