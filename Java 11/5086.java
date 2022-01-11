/*
 * 제출 번호: 37398397
 * ID: adviate
 * 문제: 5086
 * 결과: 맞았습니다!!
 * 메모리: 17524 KB
 * 시간: 196 ms
 * 언어: Java 11
 * 코드 길이: 422 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int A = scanner.nextInt(), B = scanner.nextInt();
			if(A == 0 && B == 0) {
				break;
			}
			
			if(B % A == 0) {
				System.out.println("factor");
			} else if(A % B == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}
	}
}
