/*
 * 제출 번호: 39724032
 * ID: adviate
 * 문제: 1924
 * 결과: 맞았습니다!!
 * 메모리: 14220 KB
 * 시간: 128 ms
 * 언어: Java 11
 * 코드 길이: 823 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		String[] input = reader.readLine().split(" ");
		int M = Integer.valueOf(input[0]), D = Integer.valueOf(input[1]), sum = 0;
		
		for(int i = 0; i <= 12; i++) {
			if(i == M) { break; }
			sum += months[i];
		}
		sum += D;
		
		switch(sum % 7) {
			case 0: System.out.println("SUN"); break;
			case 1: System.out.println("MON"); break;
			case 2: System.out.println("TUE"); break;
			case 3: System.out.println("WED"); break;
			case 4: System.out.println("THU"); break;
			case 5: System.out.println("FRI"); break;
			case 6: System.out.println("SAT"); break;
		}
	}
}
