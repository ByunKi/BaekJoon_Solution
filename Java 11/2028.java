/*
 * 제출 번호: 37549583
 * ID: adviate
 * 문제: 2028
 * 결과: 맞았습니다!!
 * 메모리: 17776 KB
 * 시간: 208 ms
 * 언어: Java 11
 * 코드 길이: 544 B
 */
	
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int TC = scanner.nextInt();
		for(int i = 0; i < TC; i++) {
			int input = scanner.nextInt(), tmp = 0;
			long num = input*input;
			
			if(Integer.toString(input).length() == 1) { tmp = 10; } 
			else if (Integer.toString(input).length() == 2) { tmp = 100; } 
			else { tmp = 1000; }
			
			if(num % tmp == input) { System.out.println("YES"); } 
			else { System.out.println("NO"); }
		}
		scanner.close();
	}
}
