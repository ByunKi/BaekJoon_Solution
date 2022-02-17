/*
 * 제출 번호: 39205114
 * ID: adviate
 * 문제: 9946
 * 결과: 맞았습니다!!
 * 메모리: 41856 KB
 * 시간: 724 ms
 * 언어: Java 11
 * 코드 길이: 691 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		
		while(true) {
			String A = reader.readLine();
			String B = reader.readLine();
			if(A.equals("END") && B.equals("END")) { break; }
			
			char[] Aarr = A.toCharArray();
			Arrays.sort(Aarr);
			A = new String(Aarr);
			
			char[] Barr = B.toCharArray();
			Arrays.sort(Barr);
			B = new String(Barr);
					
			if(A.equals(B)) { System.out.println("Case " + (cnt+1) + ": same"); }
			else { System.out.println("Case " + (cnt+1) + ": different"); }
			
			cnt++;
		}
	}
}
