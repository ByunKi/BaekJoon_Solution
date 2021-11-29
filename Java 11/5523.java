// 제출 번호: 35872700
// 아이디: adviate
// 문제: 5523
// 결과: 맞았습니다!!
// 메모리: 309868 KB
// 시간: 1928 ms
// 언어: Java 11
// 코드 길이: 435 B

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int aCnt = 0, bCnt = 0;
		
		for(int i = 0; i < testCase; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			if(b > a) {
				bCnt++;
			}
			else if (a > b) {
				aCnt++;
			}
		}
		
		System.out.println(aCnt + " " + bCnt);
		scanner.close();
	}
}
