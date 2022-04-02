/*
 * 제출 번호: 41365267
 * ID: adviate
 * 문제: 2684
 * 결과: 맞았습니다!!
 * 메모리: 15892 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 870 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int[] ans = new int[8];
			
			String input = reader.readLine();
			for(int j = 0; j < input.length() - 2; j++) {
				String sub = input.substring(j, j + 3);

				if(sub.equals("TTT")) { ans[0]++; }
				else if(sub.equals("TTH")) { ans[1]++; }
				else if(sub.equals("THT")) { ans[2]++; }
				else if(sub.equals("THH")) { ans[3]++; }
				else if(sub.equals("HTT")) { ans[4]++; }
				else if(sub.equals("HTH")) { ans[5]++; }
				else if(sub.equals("HHT")) { ans[6]++; }
				else { ans[7]++; }
			}
			for(int j = 0; j < ans.length; j++) { System.out.print(ans[j] + " "); }
			System.out.println();
		}
	}
}
