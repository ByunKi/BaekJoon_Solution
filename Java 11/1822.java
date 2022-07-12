/*
 * 제출 번호: 45968526
 * ID: adviate
 * 문제: 1822
 * 결과: 맞았습니다!!
 * 메모리: 216196 KB
 * 시간: 1924 ms
 * 언어: Java 11
 * 코드 길이: 971 B
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		TreeSet<Integer> A = new TreeSet<>(), B = new TreeSet<>();
		
		String[] input = reader.readLine().split(" ");
		int lenA = Integer.valueOf(input[0]), lenB = Integer.valueOf(input[1]);
		
		input = reader.readLine().split(" ");
		for(int i = 0; i < lenA; i++) { A.add(Integer.valueOf(input[i])); }
		
		input = reader.readLine().split(" ");
		for(int i = 0; i < lenB; i++) { B.add(Integer.valueOf(input[i])); }
		
		Iterator<Integer> it = B.iterator();
		while(it.hasNext()) {
			int element = it.next();
			if(A.contains(element)) { A.remove(element); }
		}
		
		it = A.iterator();
		while(it.hasNext()) { ans.append(it.next() + " "); }
		
		System.out.println(A.size());
		if(A.size() > 0) { System.out.println(ans); }		
	}
}
