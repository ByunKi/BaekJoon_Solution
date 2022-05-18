/*
 * 제출 번호: 43459914
 * ID: adviate
 * 문제: 22935
 * 결과: 맞았습니다!!
 * 메모리: 14568 KB
 * 시간: 148 ms
 * 언어: Java 11
 * 코드 길이: 821 B
 */

import java.io.*;

public class Main {
	static String[] arr = { "", "VVV딸기", "VV딸기V", "VV딸기딸기", "V딸기VV", "V딸기V딸기", 
			"V딸기딸기V", "V딸기딸기딸기", "딸기VVV", "딸기VV딸기", "딸기V딸기V", 
			"딸기V딸기딸기", "딸기딸기VV", "딸기딸기V딸기", "딸기딸기딸기V","딸기딸기딸기딸기" };

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			int N = Integer.valueOf(reader.readLine()) - 1;
			N %= 28;
			N++;
			
			if(N <= 15) { ans.append(arr[N] + "\n"); }
			else {ans.append(arr[30 - N] + "\n");}
		}
		System.out.println(ans);
	}
}
