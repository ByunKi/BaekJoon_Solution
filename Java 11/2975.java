// 제출 번호: 35127336
// 아이디: adviate
// 문제: 2975
// 문제 제목: Transactions
// 결과: 맞았습니다!!
// 메모리: 17624KB
// 시간: 228ms
// 언어: Java 11
// 코드 길이: 927B
// 제출한 시간: 2021.11.06 12:49:36

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            String[] inputs = input.split(" ");
            int account = Integer.parseInt(inputs[0]);
            int wallet = Integer.parseInt(inputs[2]);

            if (account == 0 && wallet == 0 && inputs[1].equals("W")) {
                break;
            }

            if(inputs[1].equals("W")) {
                if((account - wallet) < -200) {
                    System.out.println("Not allowed");
                }
                else {
                    System.out.println(account - wallet);
                }
            }

            if(inputs[1].equals("D")) {
                account += wallet;
                System.out.println(account);
            }
        }

        scanner.close();
    }
}
