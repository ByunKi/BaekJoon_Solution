/*
 * 제출 번호: 44512317
 * ID: adviate
 * 문제: 1003
 * 결과: 맞았습니다!!
 * 메모리: 16104 KB
 * 시간: 144 ms
 * 언어: Java 11
 * 코드 길이: 844 B
 */

import java.io.*;

public class Main {	    
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
		
		int TC = Integer.valueOf(reader.readLine());
		for(int j = 0; j < TC; j++) {
			int K = Integer.valueOf(reader.readLine());
			
			if(K == 0) { ans.append(1 + " " + 0).append("\n"); }
			else {
		        int[][] arr = new int[K + 1][2];
		        arr[0][0] = 1; arr[0][1] = 0;
		        arr[1][0] = 0; arr[1][1] = 1;
		        
		        for(int i = 2; i < arr.length; i++) {
		            arr[i][0] = arr[i - 1][0] + arr[i - 2][0];
		            arr[i][1] = arr[i - 1][1] + arr[i - 2][1];
		        }
		        ans.append(arr[K][0] + " " + arr[K][1]).append("\n");
			}
		}
		System.out.println(ans);
	}
}
