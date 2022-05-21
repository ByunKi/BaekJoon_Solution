/*
 * 제출 번호: 43602820
 * ID: adviate
 * 문제: 2238
 * 결과: 맞았습니다!!
 * 메모리: 51660 KB
 * 시간: 608 ms
 * 언어: Java 11
 * 코드 길이: 852 B
 */

import java.io.*;
import java.util.*;

public class Main {   

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		TreeMap<Integer, String> map = new TreeMap<>();
		HashSet<Integer> set = new HashSet<>();
		
		String[] input = reader.readLine().split(" ");
		int U = Integer.valueOf(input[0]), N = Integer.valueOf(input[1]);
		
		int[] arr = new int[U + 1];
		for(int i = 0; i < N; i++) {
			input = reader.readLine().split(" ");
			int num = Integer.valueOf(input[1]);
			arr[num]++;
			
			if(map.containsKey(num)) { continue; }
			map.put(num, input[0]);
		}
		
		int min = 100001, idx = 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > 0 && min > arr[i]) {
				min = arr[i];
				idx = i;
			}
		}
		System.out.println(map.get(idx) + " " + idx);
	}
}
