/*
 * 제출 번호: 35970963
 * ID: adviate
 * 문제: 2083
 * 결과: 맞았습니다!!
 * 메모리: 17708 KB
 * 시간:  208 ms
 * 언어: Java 11
 * 코드 길이: 527 B
 */

import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int age = 1;
		int weight = 1;
		
		while(true) {
			name = scanner.next();
			age = scanner.nextInt();
			weight = scanner.nextInt();
			
			if(name.equals("#") && age == 0 && weight == 0) {
				break;
			}
			
			if(age > 17 || weight >= 80) {
				System.out.println(name + " Senior");
			} else {
				System.out.println(name + " Junior");
			}
		}
		
		scanner.close();
	}
}
