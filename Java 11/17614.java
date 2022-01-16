/*
 * 제출 번호: 37639643
 * ID: adviate
 * 문제: 17614
 * 결과: 맞았습니다!!
 * 메모리: 81820 KB
 * 시간: 420 ms
 * 언어: Java 11
 * 코드 길이: 430 B
 */
	
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(), cnt = 0;
		scanner.close();
		
		while(input > 0) {
			char[] tmp = Integer.toString(input).toCharArray();
			for(int i = 0; i < tmp.length; i++) {
				if(tmp[i] == '3' || tmp[i] == '6' || tmp[i] == '9') { cnt++; }
			}
			input--;
		}
		
		System.out.println(cnt);
	}
}
