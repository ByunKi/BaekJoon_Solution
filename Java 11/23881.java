/*
 * 제출 번호: 45699413
 * ID: adviate
 * 문제: 23881
 * 결과: 맞았습니다!!
 * 메모리: 17696 KB
 * 시간: 360 ms
 * 언어: Java 11
 * 코드 길이: 1171 B
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
        int N = Integer.valueOf(input[0]), K = Integer.valueOf(input[1]);
        
        int[] arr = new int[N];
        input = reader.readLine().split(" ");
        for(int i = 0; i < arr.length; i++) { arr[i] = Integer.valueOf(input[i]); }
        
        int swapCnt = 0, minValue = 0, maxValue = 0, idx = 0, last = arr.length - 1;
        for(int i = last; i > 0; i--) {
        	idx = i;
        	for(int j = 0; j < last; j++) {
        		 if(arr[j] > arr[idx]) { idx = j; }
        	}
        	if(idx != last) {
        		swapCnt++;
        		swap(arr, idx, i);
        		if(swapCnt == K) { minValue = arr[idx]; maxValue = arr[i]; }
        	}
        	last--;
        }
        
        if(swapCnt < K) { System.out.println(-1); }
        else { System.out.println(minValue + " " + maxValue); }
    }
}
