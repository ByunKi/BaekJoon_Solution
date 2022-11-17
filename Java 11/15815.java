/*
 * 제출 번호: 51755009
 * ID: adviate
 * 문제: 15815
 * 결과: 맞았습니다!!
 * 메모리: 14152 KB
 * 시간: 120 ms
 * 언어: Java 11
 * 코드 길이: 938 B
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        String s = reader.readLine();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) { stack.add(ch-'0'); }
            else {
                int a = stack.pop();
                int b = stack.pop();

                switch (s.charAt(i)) {
                    case '+': stack.push(a+b); break;
                    case '-': stack.push(b-a); break;
                    case '*': stack.push(a*b); break;
                    case '/': stack.push(b/a); break;
                    default: break;
                }
            }
        }

        System.out.println(stack.peek());
        reader.close();
    }
}
