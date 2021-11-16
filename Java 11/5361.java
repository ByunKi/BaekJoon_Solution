// 제출 번호: 35473342
// 아이디: adviate
// 문제: 5361
// 문제 제목: 전투 드로이드 가격 
// 결과: 맞았습니다!!
// 메모리: 17872KB
// 시간: 212ms
// 언어: Java 11
// 코드 길이: 555B
// 제출한 시간: 2021.11.16 15:59:06

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] partsPrice = { 350.34, 230.9, 190.55, 125.3, 180.9 };
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        double price;

        for(int i = 0; i < cases; i++) {
            price = 0;
            for (double v : partsPrice) {
                price += (v * scanner.nextInt());
            }
            System.out.println("$" + String.format("%.2f", price));
        }
        scanner.close();
    }
}
