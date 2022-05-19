/*
 * 제출 번호: 43547176
 * ID: adviate
 * 문제: 1748
 * 결과: 맞았습니다!!
 * 메모리: 14176 KB
 * 시간: 312 ms
 * 언어: Java 11
 * 코드 길이: 741 B
 */

import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(reader.readLine());
		long ans = 0;
		for(int i = 1; i <= N; i++) {
			if(i < 10) { ans++; }
    		else if(i >= 10 && i < 100) { ans += 2; }
    		else if(i >= 100 && i < 1000) { ans += 3; }
    		else if(i >= 1000 && i < 10000) { ans += 4; }
    		else if(i >= 10000 && i < 100000) { ans += 5; }
    		else if(i >= 100000 && i < 1000000) { ans += 6; }
    		else if(i >= 1000000 && i < 10000000) { ans += 7; }
    		else if(i >= 10000000 && i < 100000000) { ans += 8; }
    		else { ans += 9; }
		}
		System.out.println(ans);	
	}
}
