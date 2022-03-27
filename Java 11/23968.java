/*
 * 제출 번호: 41067670
 * ID: adviate
 * 문제: 23968
 * 결과: 맞았습니다!!
 * 메모리: 19248 KB
 * 시간: 504 ms
 * 언어: Java 11
 * 코드 길이: 1054 B
 */

import java.io.*;

public class Main {
	static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = reader.readLine().split(" ");
        int N = Integer.valueOf(input[0]), K = Integer.valueOf(input[1]), swapCnt = 0, min = 0, max = 0;
        
        int[] arr = new int[N];
        input = reader.readLine().split(" ");
        for(int i = 0; i < arr.length; i++) { arr[i] = Integer.valueOf(input[i]); }
        
        for(int i = arr.length - 1; i > 0; i--) {
        	for(int j = 0; j < arr.length - 1; j++) {
        		if(arr[j] > arr[j + 1]) { 
        			swapCnt++;
        			swap(arr, j, j + 1);
        			if(swapCnt == K) { min = arr[j]; max = arr[j + 1]; }
        		}
        	}
        }
        
        if(swapCnt < K) { System.out.println(-1); }
        else { System.out.println(min + " " + max); }
    }
}
