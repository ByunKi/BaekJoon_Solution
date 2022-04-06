/*
 * 제출 번호: 41572114
 * ID: adviate
 * 문제: 9300
 * 결과: 맞았습니다!!
 * 메모리: 72800 KB
 * 시간: 1616 ms
 * 언어: Java 11
 * 코드 길이: 679 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			double h = Double.valueOf(input[0]), radian = Math.toRadians(Double.valueOf(input[1]));
	
			String sin = String.format("%.8f", Math.sin(radian));
			String cos = String.format("%.8f", Math.cos(radian));		
			double sine = Double.valueOf(sin), cose = Double.valueOf(cos);
			// 왜 탄젠트를 사용하면, 1번 예제에서 0이 되지 않을까???
			System.out.println("Case " + (i + 1) + ": " + Math.abs(h / (sine/cose) - h));
		}
	}
}
