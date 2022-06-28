/*
 * 제출 번호: 45175396
 * ID: adviate
 * 문제: 1817
 * 결과: 맞았습니다!!
 * 메모리: 14296 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 616 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = reader.readLine().split(" ");
		int N = Integer.valueOf(input[0]), M = Integer.valueOf(input[1]), acc = 0, boxes = 1;
		
		if(N > 0) {
			input = reader.readLine().split(" ");
			for(int i = 0; i < N; i++) {
				int tmp = Integer.valueOf(input[i]);
				if(acc + tmp <= M) { acc += tmp; }
				else { 
					acc = tmp; 
					boxes++; 
				}
			}
			System.out.println(boxes);
		}
		else { System.out.println(0); }
	}
}
