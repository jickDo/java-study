package cond;

public class If4 {

    public static void main(String[] args) {
        int age = 20;

        if (age<=7){
            System.out.println("미취학입니다");
        } else if (age<=13) {
            System.out.println("8세이상 13세 이하입니다");
        } else if (age<=16) {
            System.out.println("14세이상 16세 이하입니다");
        } else if (age<=19) {
            System.out.println("17세이상 19세 이하입니다");
        }
        else {
            System.out.println("성인입니다");
        }
    }
}

