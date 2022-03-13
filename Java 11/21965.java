/*
 * 제출 번호: 40380066
 * ID: adviate
 * 문제: 21965
 * 결과: 맞았습니다!!
 * 메모리: 28216 KB
 * 시간: 304 ms
 * 언어: Java 11
 * 코드 길이: 753 B
 */

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int height = Integer.valueOf(reader.readLine()), count = 0;
		String[] input = reader.readLine().split(" ");
		
		int[] arr = new int[height];
		for(int i = 0; i < arr.length; i++) { arr[i] = Integer.valueOf(input[i]); }
		
		boolean isMountain = true;
		for(int i = 1; i < arr.length; i++) { 
			if(arr[i - 1] < arr[i]) {
				if(count < 0) {
					isMountain = false;
					break;
				}
				count++;	
			} else if(arr[i - 1] == arr[i]) { 
				isMountain = false; 
				break; 
			} else {
				count = -1;
			}
		}
		
		System.out.println(isMountain ? "YES" : "NO");
	}
}
