/*
 * 제출 번호: 38262563
 * ID: adviate
 * 문제: 9317
 * 결과: 맞았습니다!!
 * 메모리: 48848 KB
 * 시간: 812 ms
 * 언어: Java 11
 * 코드 길이: 655 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] input = reader.readLine().split(" ");
			if(input[0].equals("0") && input[1].equals("0") && input[2].equals("0")) { break; }
			double D = Double.parseDouble(input[0]), W = 16 * D / Math.sqrt(337), H = 9 * W / 16;
			int Rh = Integer.parseInt(input[1]), Rv = Integer.parseInt(input[2]);
			
			System.out.println("Horizontal DPI: " + String.format("%.2f", Rh/W));
			System.out.println("Vertical DPI: " + String.format("%.2f", Rv/H));
		}
 	}
}
