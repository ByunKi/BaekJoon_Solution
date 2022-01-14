/*
 * 제출 번호: 37550180
 * ID: adviate
 * 문제: 16561
 * 결과: 맞았습니다!!
 * 메모리: 17752 KB
 * 시간: 212 ms
 * 언어: Java 11
 * 코드 길이: 400 B
 */
	
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(), cnt = 0;
		
		for(int i = 1; i <= input/3; i++) {
			for(int j = 1; j <= input/3; j++) {
				int sum = i*3+j*3;
				if((input - sum) % 3 == 0 && sum < input) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		scanner.close();
	}
}
