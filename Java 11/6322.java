/*
 * 제출 번호: 41365377
 * ID: adviate
 * 문제: 6322
 * 결과: 맞았습니다!!
 * 메모리: 16192 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 1422 B
 */

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			double c = Double.parseDouble(st.nextToken());
			
			if(a == 0 && b == 0 && c == 0) { break; }
			
			System.out.println("Triangle #" + (i++));
			
			if(a == -1) {
				if(c <= b) {
					System.out.println("Impossible.");
				} else {
					a = Math.sqrt((c * c) - (b * b));
					System.out.println("a = " + String.format("%.3f", a));
				}
			}
			if(b == -1) {
				if(c <= a) {
					System.out.println("Impossible.");
				} else {
					b = Math.sqrt((c * c) - (a * a));
					System.out.println("b = " + String.format("%.3f", b));
				}
			}
			if(c == -1) {
				c = Math.sqrt((a * a) + (b * b));
				System.out.println("c = " + String.format("%.3f", c));
			}

			System.out.println();
		}
	}

}
