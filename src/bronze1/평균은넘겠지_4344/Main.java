package bronze1.평균은넘겠지_4344;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public void solution(ArrayList<int[]> array) {

        String answer = "";

        for (int[] n : array) {
            int sum = 0;
            int avg = 0;
            float cnt = 0;

            for (int score : n) {
                sum += score;
                avg = sum/n.length;
            }

            for (int score : n) {
                if(score > avg) {
                    cnt++;
                }
            }
            float per = (cnt*100)/n.length;
            answer = String.format("%.3f", per) + "%";
            System.out.println(answer);
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<int[]> array = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            int m = sc.nextInt();
            int[] score = new int[m];
            
            for(int j=0; j<m; j++){
                score[j] = sc.nextInt();
            }
            array.add(score);
        }

        main.solution(array);

    }
}
