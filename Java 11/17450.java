/*
 * 제출 번호: 36916312
 * ID: adviate
 * 문제: 17450
 * 결과: 맞았습니다!!
 * 메모리: 17872 KB
 * 시간: 216 ms
 * 언어: Java 11
 * 코드 길이: 787 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double[] prices = new double [3], weights = new double[3];
		int idx = 0;
		double max = 0;
		for(int i = 0; i < 3; i++) {
			prices[i] = scanner.nextDouble();
			weights[i] = scanner.nextDouble();  
			
			if(prices[i] * 10 >= 5000) {
				prices[i] = (prices[i] * 10) - 500;
			} else {
				prices[i] *= 10;
			}
			weights[i] *= 10;
		}
		
		for(int i = 0; i < 3; i++) {
			if(max < (weights[i] / prices[i])) {
				idx = i;
				max = (weights[i] / prices[i]);               
			}
		}
		
		if(idx == 0) {
			System.out.println("S");
		} else if(idx == 1) {
			System.out.println("N");
		} else {
			System.out.println("U");
		}
		
		scanner.close();
	}
}
