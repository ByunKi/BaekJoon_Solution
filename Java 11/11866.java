/*
 * 제출 번호: 41012449
 * ID: adviate
 * 문제: 11866
 * 결과: 맞았습니다!!
 * 메모리: 24016 KB
 * 시간: 180 ms
 * 언어: Java 11
 * 코드 길이: 820 B
 */

import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer ans = new StringBuffer();
        
        String[] input = reader.readLine().split(" ");
        int N = Integer.valueOf(input[0]), K = Integer.valueOf(input[1]);
        
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 1; i <= N; i++) { list.add(i); }
        
        ans.append("<");
        while(!list.isEmpty()) {
        	for(int i = 0; i < (K - 1); i++) { list.add(list.pop()); }
        	ans.append(list.pop() + ", ");
        }
        ans.setLength(ans.length() - 2);
        ans.append(">");
        
        System.out.println(ans);
    }
}
