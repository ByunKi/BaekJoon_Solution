/*
 * 제출 번호: 44596518
 * ID: adviate
 * 문제: 2033
 * 결과: 맞았습니다!!
 * 메모리: 14192 KB
 * 시간: 124 ms
 * 언어: Java 11
 * 코드 길이: 600 B
 */

import java.io.*;

public class Main {	    
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
        char[] input = reader.readLine().toCharArray();
        int[] arr = new int[input.length];
        for(int i = 0; i < arr.length; i++) { arr[i] = Integer.valueOf(input[i] - '0'); }
        
        for(int i = (arr.length - 1); i > 0; i--) {
        	if(arr[i] >= 5) { arr[i - 1]++; } 
        	arr[i] = 0; 
        }
        
        for(int i = 0; i < arr.length; i++) { System.out.print(arr[i]); }
	}
}
