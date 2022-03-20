/*
 * 제출 번호: 40747294
 * ID: adviate
 * 문제: 10989
 * 결과: 맞았습니다!!
 * 메모리: 318176 KB
 * 시간: 1660 ms
 * 언어: Java 11
 * 코드 길이: 589 B
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int[] cnt = new int[10001];
        
        int N = Integer.valueOf(reader.readLine());
        for(int i = 0; i < N; i++) { cnt[Integer.valueOf(reader.readLine())]++; }
        
        for(int i = 1; i < 10001; i++) {
        	while((cnt[i]--) > 0) { ans.append(i).append("\n"); }
        }
        
        System.out.println(ans);
    }
}
