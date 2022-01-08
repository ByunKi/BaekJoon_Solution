/*
 * 제출 번호: 37241486
 * ID: adviate
 * 문제: 1681
 * 결과: 맞았습니다!!
 * 메모리: 66004 KB
 * 시간: 336 ms
 * 언어: Java 11
 * 코드 길이: 354 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String L = scanner.next();
		int cnt = 0, num = 1;
		
		while(cnt < N) {
			if(!Integer.toString(num).contains(L)) { cnt++; } 
			num++;
		}
		
		System.out.println(num-1);
		scanner.close();
	}
}
