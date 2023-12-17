package array.ex;

import java.util.Scanner;

public class TwoDiArrayEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] people = new int[4][3];

        for (int i=0; i<4; i++){
            System.out.println(i+1+"번 학생의 성적을 입력하세요");
            for(int j=0; j<3; j++){
                if (j==0){
                    System.out.print("국어 성적: ");
                    people[i][0] = scanner.nextInt();
                } else if (j==1) {
                    System.out.print("영어 성적: ");
                    people[i][1] = scanner.nextInt();
                } else {
                    System.out.print("수학 성적: ");
                    people[i][2] = scanner.nextInt();
                }
            }
        }

        for (int i=0; i<4; i++){
            int total =0;
            for(int j=0; j<3; j++){
                total+= people[i][j];
            }
            System.out.println(i+"번 학생의 총점은: "+ total+", 평균은 "+total/3.0);
        }
    }
}
