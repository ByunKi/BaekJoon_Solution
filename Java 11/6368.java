/*
 * 제출 번호: 36909813
 * ID: adviate
 * 문제: 6378
 * 결과: 맞았습니다!!
 * 메모리: 17568 KB
 * 시간: 212 ms
 * 언어: Java 11
 * 코드 길이: 575 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String num = scanner.next();
			if(num.equals("0")) {
				break;
			}
			
			int ans = 0;
			if(num.length() < 2) {
				ans = Integer.parseInt(num);
			}
			
			while(num.length() >= 2) {
				ans = 0;
				
				String[] tmp = num.split("");
				for(int i = 0; i < tmp.length; i++) {
					ans += Integer.parseInt(tmp[i]);
				}
				num = Integer.toString(ans);
			}
			System.out.println(ans);
			
		}
		
		scanner.close();
	}
}
