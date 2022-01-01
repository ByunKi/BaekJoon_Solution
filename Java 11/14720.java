/*
 * 제출 번호: 36917079
 * ID: adviate
 * 문제: 14720
 * 결과: 맞았습니다!!
 * 메모리: 19316 KB
 * 시간: 264 ms
 * 언어: Java 11
 * 코드 길이: 477 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); 
		int pattern = 0, cnt = 0;
		
		int[] nums = new int [input];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = scanner.nextInt();
		
			if(pattern == nums[i]) {
				cnt++;
				if(pattern <= 1) {
					pattern++;
				} else {
					pattern = 0;
				}
			}
		}
		
		System.out.println(cnt);
		scanner.close();
	}
}
