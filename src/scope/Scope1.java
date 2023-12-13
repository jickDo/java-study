package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10;  //생존 시작
        if(true){
            int x= 20;
            System.out.println("m의 값은 = "+m);
            System.out.println("x의 값은 = "+x);
        } // x 생존 종료
//        System.out.println("x의 값은 = "+ x ); 에러 발생

    }   // m 생존 종료
}
