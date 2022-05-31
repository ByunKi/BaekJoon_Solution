/*
 * 제출 번호: 43985550
 * ID: adviate
 * 문제: 7785
 * 결과: 맞았습니다!!
 * 메모리: 57244 KB
 * 시간: 744 ms
 * 언어: Java 11
 * 코드 길이: 659 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		TreeSet<String> set = new TreeSet<>();
		
		int TC = Integer.valueOf(reader.readLine());
		for(int i = 0; i < TC; i++) {
			String[] input = reader.readLine().split(" ");
			
			if(input[1].equals("enter")) { set.add(input[0]); }
			else { set.remove(input[0]); } 
		}
		
		Object[] arr = set.toArray();
		for(int i = set.size() - 1; i >= 0; i--) { ans.append(arr[i] + "\n"); }
		System.out.println(ans);
	}
}
