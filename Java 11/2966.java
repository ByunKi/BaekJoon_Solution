/*
 * 제출 번호: 38489412
 * ID: adviate
 * 문제: 2966
 * 결과: 맞았습니다!!
 * 메모리: 14284 KB
 * 시간: 132 ms
 * 언어: Java 11
 * 코드 길이: 960 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		char[] Adrian = {'A','B','C'}, Bruno = {'B', 'A', 'B', 'C'}, Goran = {'C', 'C', 'A', 'A', 'B', 'B'};
		int scoreAdrian = 0, scoreBruno = 0, scoreGoran = 0;
		
		int N = Integer.parseInt(reader.readLine());
		String input = reader.readLine();
		for(int i = 0; i < input.length(); i++) {
			if(Adrian[i % 3] == input.charAt(i)) { scoreAdrian++; }
			if(Bruno[i % 4] == input.charAt(i)) { scoreBruno++; }
			if(Goran[i % 6] == input.charAt(i)) { scoreGoran++; }
		}
		
		int maxCorrect = Math.max(scoreGoran, Math.max(scoreAdrian, scoreBruno));
		System.out.println(maxCorrect);
		
		if(maxCorrect == scoreAdrian) { System.out.println("Adrian"); }
		if(maxCorrect == scoreBruno) { System.out.println("Bruno"); }
		if(maxCorrect == scoreGoran) { System.out.println("Goran"); }
 	}
}
