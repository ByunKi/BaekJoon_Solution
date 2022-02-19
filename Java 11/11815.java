/*
 * 제출 번호: 39300098
 * ID: adviate
 * 문제: 11815
 * 결과: 맞았습니다!!
 * 메모리: 14752 KB
 * 시간: 148 ms
 * 언어: Java 11
 * 코드 길이: 598 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		String[] input = reader.readLine().split(" ");
		for(int i = 0; i < TC; i++) {
			long begin = 0, end = 1000000000;
			
			while(begin + 1 < end) {
				long mid = (begin + end) / 2;
				
				if(mid * mid < Long.parseLong(input[i])) { begin = mid; }
				else { end = mid; }
			}
			System.out.print((end * end == Long.parseLong(input[i]) ? "1" : "0") + " ");
		}
	}
}
