/*
 * 제출 번호: 37806935
 * ID: adviate
 * 문제: 15784
 * 결과: 맞았습니다!!
 * 메모리: 18656 KB
 * 시간: 0 ms (시간초과)
 * 언어: Java 11
 * 코드 길이: 676 B
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int a = scanner.nextInt() - 1, b = scanner.nextInt() - 1;
		
		int[][] mat = new int[N][N];
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) { mat[i][j] = scanner.nextInt(); }
		}
		scanner.close();
		
		int max = mat[a][b];
		for(int i = 0; i < mat.length; i++) {
			if(mat[a][i] > max) { max = mat[a][i]; System.out.println("ANGRY"); System.exit(0);}
			if(mat[i][b] > max) { max = mat[i][b]; System.out.println("ANGRY"); System.exit(0);}
		}
				
		System.out.println("HAPPY");
	}
}
