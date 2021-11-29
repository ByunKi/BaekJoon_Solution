// 제출 번호: 35874225
// 아이디: adviate
// 문제: 9085
// 결과: 맞았습니다!!
// 메모리: 17440 KB
// 시간: 200 ms
// 언어: Java 11
// 코드 길이: 394 B0

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tc = scanner.nextInt();
		
		for(int i = 0; i < tc; i++) {
			int sum = 0;
			int num = scanner.nextInt();
			for(int j = 0; j < num; j++) {
				int input = scanner.nextInt();
				sum += input;
			}
			
			System.out.println(sum);
		}
		
		scanner.close();
	}
}
