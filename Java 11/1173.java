/*
 * 제출 번호: 36745610
 * ID: adviate
 * 문제: 1173
 * 결과: 맞았습니다!!
 * 메모리: 17716 KB
 * 시간: 208 ms
 * 언어: Java 11
 * 코드 길이: 556 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int m = scanner.nextInt();
		int M = scanner.nextInt();
		int T = scanner.nextInt();
		int R = scanner.nextInt();
		int X = m, minute = 0;
		
		while(N > 0) {
			if ((m + T) > M) {
				minute = -1;
				break;
			}
			
			if(X < m) {
				X = m;
			}
			
			if((X + T) <= M) {
				X += T;
				N--;
			} else {
				X -= R;
			}
			
			minute++;
		}
		
		System.out.println(minute);
		scanner.close();
	}
}
