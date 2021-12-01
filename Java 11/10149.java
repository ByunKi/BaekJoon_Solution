/*
 * 제출 번호: 35932897
 * ID: adviate
 * 문제: 10149
 * 결과: 맞았습니다!!
 * 메모리: 17548 KB
 * 시간:  204 ms
 * 언어: Java 11
 * 코드 길이: 398 B
 */

import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int testCases = scanner.nextInt();
		for(int i = 0; i < testCases; i++) {
			int time = scanner.nextInt();
			int rst = 0, num = 0;
			
			while(time >= rst) {
				rst = num + num*num;
				num++;
			}
			
			System.out.println(num-2);
		}
		
		scanner.close();
	}
}
