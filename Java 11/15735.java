/*
 * 제출 번호: 37122980
 * ID: adviate
 * 문제: 15735
 * 결과: 맞았습니다!!
 * 메모리: 17636 KB
 * 시간: 216 ms
 * 언어: Java 11
 * 코드 길이: 446 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int L = scanner.nextInt(), R = scanner.nextInt(), A = scanner.nextInt();
		System.out.println(Math.min(L+A, Math.min(R+A, (L+R+A) / 2)) * 2);
		// 예제 1번
		// (왼발, 오른발 잡이 + 양발잡이 값)의 최소의 2배가 된다...
		// 예제 2번 전체를 다 더해서 2로 나눔
		scanner.close();
	}
}
