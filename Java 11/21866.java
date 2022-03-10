/*
 * 제출 번호: 40196401
 * ID: adviate
 * 문제: 21866
 * 결과: 맞았습니다!!
 * 메모리: 14184 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 648 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] maxScore = {100, 100, 200, 200, 300, 300, 400, 400, 500};
		
		String[] input = reader.readLine().split(" ");
		boolean isHacker = false;
		int sum = 0;
		
		for(int i = 0; i < input.length; i++) {
			int num = Integer.valueOf(input[i]);
			if(num > maxScore[i]) { isHacker = true; }
			sum += num;
		}
		
		if(!isHacker) {
			if(sum >= 100) { System.out.println("draw"); }
			else { System.out.println("none"); }
		} else { System.out.println("hacker"); }
	}
}
