/*
 * 제출 번호: 40338325
 * ID: adviate
 * 문제: 1009
 * 결과: 맞았습니다!!
 * 메모리: 14364 KB
 * 시간: 152 ms
 * 언어: Java 11
 * 코드 길이: 776 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			int a = Integer.valueOf(input[0]), b = Integer.valueOf(input[1]), tmp = 0;
			long ans = 1;
			
			if(a % 10 == 0 || a % 10 == 1 || a % 10 == 5 || a % 10 == 6) { ans = a % 10; }
			else if(a % 10 == 4 || a % 10 == 9) { 
				tmp = b % 2; 
				if(tmp == 0) { tmp = 2; }
			} else {
				tmp = b % 4; 
				if(tmp == 0) { tmp = 4; }
			}
			
			for(int j = 0; j < tmp; j++) { ans = (ans * a) % 10; }
			if(ans == 0) { ans = 10; }
			System.out.println(ans);
		}
	}
}
