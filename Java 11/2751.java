/*
 * 제출 번호: 41063903
 * ID: adviate
 * 문제: 2751
 * 결과: 맞았습니다!!
 * 메모리: 148376 KB
 * 시간: 1660 ms
 * 언어: Java 11
 * 코드 길이: 609 B
 */

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        
        int length = Integer.valueOf(reader.readLine());
        int[] arr = new int[length];
        for(int i = 0; i < arr.length; i++) { arr[i] = Integer.valueOf(reader.readLine()); }
        
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) { ans.append(arr[i] + "\n"); }
        System.out.println(ans);
    }
}
