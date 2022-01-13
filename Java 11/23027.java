/*
 * 제출 번호: 37487653
 * ID: adviate
 * 문제: 23027
 * 결과: 맞았습니다!!
 * 메모리: 17692 KB
 * 시간: 212 ms
 * 언어: Java 11
 * 코드 길이: 687 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		if(S.contains("A")) {
			S = S.replaceAll("B", "A");	S = S.replaceAll("C", "A");	S = S.replaceAll("D", "A");	S = S.replaceAll("F", "A");
		} else if(S.contains("B") && !S.contains("A")) {
			S = S.replaceAll("C", "B");	S = S.replaceAll("D", "B");	S = S.replaceAll("F", "B");
		} else if(S.contains("C") && !S.contains("A") && !S.contains("B")) {
			S = S.replaceAll("D", "C");	S = S.replaceAll("F", "C");
		} else {
			for(int i = 0; i < S.length(); i++) { S = S.replace(S.charAt(i), 'A'); }
		}
		System.out.println(S);
	}
}
