/*
 * 제출 번호: 42982852
 * ID: adviate
 * 문제: 4775
 * 결과: 맞았습니다!!
 * 메모리: 23984 KB
 * 시간: 292 ms
 * 언어: Java 11
 * 코드 길이: 923 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> set = new HashSet<>();

		int N = Integer.valueOf(reader.readLine());
		for(int i = 0; i < N; i++) { set.add(reader.readLine()); }

		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String input = "";
			Boolean flag = true;
			StringBuilder ans = new StringBuilder();
			
			while(!(input = reader.readLine()).equals("-1")) {
				if(!set.contains(input)) { 
					flag = false; 
					ans.append(input + "\n"); 
				}
			}
			
			if(flag) { System.out.println("Email " + (i + 1) + " is spelled correctly."); } 
			else {
				System.out.println("Email " + (i + 1) + " is not spelled correctly.");
				System.out.print(ans);
			}
		}
		System.out.println("End of Output");
	}
}
