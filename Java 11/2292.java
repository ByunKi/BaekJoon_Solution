/*
 * 제출 번호: 35835723
 * ID: adviate
 * 문제: 2292
 * 결과: 맞았습니다!!
 * 메모리: 17604 KB
 * 시간:  204 ms
 * 언어: Java 11
 * 코드 길이: 393 B
 */

import java.util.*;

public class Main {	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0, cnt = 0, i = 0;
		
		while(true) {
			if(num == 1) {
				break;
			} else if(num > sum * 6 + 1) {
				cnt++;
				i++;
				sum += i;
			} else {
				break;
			}
		}
		
		System.out.println(cnt + 1);
		scanner.close();
	}
}
