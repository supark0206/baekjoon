package bronze1.여름나기_18130;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fan = sc.nextInt();
        int home = sc.nextInt();
        int price = Integer.MAX_VALUE;
        int fanNum = 0;

        for(int i=0; i<fan; i++){
            int P = sc.nextInt(); // 선풍기가격
            int K = sc.nextInt(); // 추가비용 내는 시간
            int C  = sc.nextInt(); // 추가비용 초기값

            int addPrice = 0;

            int num = home/K;
            if(home%K == 0) num -= 1;


            for(int j=1; j<=num; j++){
                addPrice = addPrice + (C * j) ;
            }

            addPrice += P ;

            if(addPrice<price){
                fanNum = i;
            }
            price = Math.min(price,addPrice);
        }

        System.out.println(fanNum+1 + " " + price);
    }
}
