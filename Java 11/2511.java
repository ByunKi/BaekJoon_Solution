/*
 * 제출 번호: 37988007
 * ID: adviate
 * 문제: 2511
 * 결과: 맞았습니다!!
 * 메모리: 16060 KB
 * 시간: 164 ms
 * 언어: Java 11
 * 코드 길이: 960 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] A = new int[10]; int scoreA = 0;
		int[] B = new int[10]; int scoreB = 0;
		String str, winner = "D"; String[] tmp;
		
		str = reader.readLine(); tmp = str.split(" ");
		for(int i = 0; i < A.length; i++) { A[i] = Integer.parseInt(tmp[i]); }
		
		str = reader.readLine(); tmp = str.split(" ");
		for(int i = 0; i < B.length; i++) { B[i] = Integer.parseInt(tmp[i]); }
		
		for(int i = 0; i < 10; i++) {
			if(A[i] > B[i]) {
				scoreA += 3;
				winner = "A";
			} else if(A[i] == B[i]) {
				scoreA++;
				scoreB++;
			} else {
				scoreB += 3;
				winner = "B";
			}
		}
		
		System.out.println(scoreA + " " + scoreB);
		if(scoreA > scoreB) { System.out.println("A"); } 
		else if(scoreB > scoreA) { System.out.println("B"); } 
		else { System.out.println(winner); }
 	}
}
