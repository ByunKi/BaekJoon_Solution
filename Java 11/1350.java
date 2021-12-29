/*
 * 제출 번호: 36791736
 * ID: adviate
 * 문제: 1350
 * 결과: 맞았습니다!!
 * 메모리: 17772 KB
 * 시간: 212 ms
 * 언어: Java 11
 * 코드 길이: 590 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int testCase = scanner.nextInt();
		long[] arr = new long [testCase];
		for(int i = 0; i < testCase; i++) {
			arr[i] = scanner.nextLong();
		}
		int cluster = scanner.nextInt();
		long cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > cluster) {
				double rst = (double) arr[i] / cluster;
				cnt += Math.ceil(rst);
			} else {
				if(arr[i] > 0) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt * cluster);
		scanner.close();
	}
}
