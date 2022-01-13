/*
 * 제출 번호: 37488074
 * ID: adviate
 * 문제: 17350
 * 결과: 맞았습니다!!
 * 메모리: 19784 KB
 * 시간: 300 ms
 * 언어: Java 11
 * 코드 길이: 414 B
 */
	
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean flag = false;
		int num = scanner.nextInt();
		for(int i = 0; i < num; i++) {
			String input = scanner.next();
			if(input.equals("anj")) {	flag = true; }
		}
		scanner.close();
		
		if(flag) { System.out.println("뭐야;"); }
		else { System.out.println("뭐야?"); }
	}
}
