/*
 * 제출 번호: 36939899
 * ID: adviate
 * 문제: 15820
 * 결과: 50점
 * 메모리: 17948 KB
 * 시간: 240 ms
 * 언어: Java 11
 * 코드 길이: 802 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sampleProblems = scanner.nextInt(), SysProblems = scanner.nextInt();
		int sample = 0, Sys = 0;
		
		for(int i = 0; i < sampleProblems; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			if(a == b) {
				sample++;
			}
		}
		
		for(int i = 0; i < SysProblems; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			if(a == b) {
				Sys++;
			}
			
		}
		
		if(sample == sampleProblems && Sys == SysProblems) {
			System.out.println("Accepted");
		} else if(sample == sampleProblems && Sys != SysProblems) {
			System.out.println("Why Wrong!!!");
		} else {
			System.out.println("Wrong Answer");
		}

		scanner.close();
	}
}
