/*
 * 제출 번호: 37679737
 * ID: adviate
 * 문제: 17263
 * 결과: 맞았습니다!!
 * 메모리: 314312 KB
 * 시간: 1956 ms
 * 언어: Java 11
 * 코드 길이: 329 B
 */
	
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		int[] arr = new int[T];
		for(int i = 0; i < T; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		
		Arrays.sort(arr);
		System.out.println(arr[T-1]);
	}
}
