/*
 * 제출 번호: 35792578
 * ID: adviate
 * 문제: 2442
 * 결과: 맞았습니다!!
 * 메모리: 18664KB
 * 시간:  400ms
 * 언어: Java 11
 * 코드 길이: 498B
 */


import java.util.*;

public class Main {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num - (i + 1); j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
