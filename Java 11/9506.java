/*
 * 제출 번호: 40104990
 * ID: adviate
 * 문제: 9506
 * 결과: 맞았습니다!!
 * 메모리: 15792 KB
 * 시간: 160 ms
 * 언어: Java 11
 * 코드 길이: 742 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int N = Integer.valueOf(reader.readLine()), sum = 0;
			if(N < 0) { break; }
			
			StringBuffer buffer = new StringBuffer();
			for(int i = 1; i < N; i++) {
				if(N % i == 0) { buffer.append(i + " "); sum += i; }
			}
			
			if(N == sum) {
				System.out.print(N + " = ");
				
				String[] tmp = buffer.toString().trim().split(" ");
				for(int i = 0; i < tmp.length - 1; i++) { System.out.print(tmp[i] + " + "); }
				
				System.out.println(tmp[tmp.length - 1]);
			} else {
				System.out.println(N + " is NOT perfect.");
			}
		}
	}
}
