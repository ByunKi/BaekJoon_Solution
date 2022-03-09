/*
 * 제출 번호: 40149713
 * ID: adviate
 * 문제: 5355
 * 결과: 맞았습니다!!
 * 메모리: 14520 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 579 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			double N = Double.valueOf(input[0]);
			
			for(int j = 1; j < input.length; j++) {
				switch(input[j]) {
					case "@": N *= 3; break;
					case "%": N += 5; break;
					case "#": N -= 7; break;
				}
			}
			System.out.println(String.format("%.2f", N));
		}
	}
}
