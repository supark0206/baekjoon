package bronze1.여름나기_18130;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        int price = Integer.MAX_VALUE;
        int NNum = 0;

        for(int i=0; i<N; i++){
            int P = sc.nextInt(); // 선풍기가격
            int K = sc.nextInt(); // 추가비용 내는 시간
            int C  = sc.nextInt(); // 추가비용 초기값

            int addPrice = 0;

            int num = Q/K;
            if(Q%K == 0) num -= 1;


            addPrice = C * (num*(num+1)/2) + P;

            if(addPrice<price){
                NNum = i;
            }
            price = Math.min(price,addPrice);
        }

        System.out.println(NNum+1 + " " + price);
    }
}
