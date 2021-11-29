// 제출 번호: 35875262
// 아이디: adviate
// 문제: 10984
// 결과: 맞았습니다!!
// 메모리: 19000 KB
// 시간: 276 ms
// 언어: Java 11
// 코드 길이: 573 B

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tc = scanner.nextInt();
		
		for(int i = 0; i < tc; i++) {
			double avg = 0;
			int sum = 0;
			int num = scanner.nextInt();
			for(int j = 0; j < num; j++) {
				int inputSubject = scanner.nextInt();
				double doubleSubject = scanner.nextDouble();
				
				sum += inputSubject;
				avg +=  (inputSubject * doubleSubject);
			}
			
			System.out.print(sum + " ");
			System.out.printf("%.1f \n", avg / sum);
		}
		
		scanner.close();
	}
}
