/*
 * 제출 번호: 38736554
 * ID: adviate
 * 문제: 6679
 * 결과: 맞았습니다!!
 * 메모리: 13996 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 584 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 1000; i < 10000; i++) {
			
			int num = i, sixteen = 0, twelve = 0, ten = 0;
			while(num != 0) {
				sixteen += (num % 16);
				num /= 16;
			}
			
			num = i;
			while(num != 0) {
				twelve += (num % 12);
				num /= 12;
			}
			
			num = i;
			while(num != 0) {
				ten += (num % 10);
				num /= 10;
			}
			
			if(ten == twelve && ten == sixteen) { System.out.println(i); }
		}
	}
}
