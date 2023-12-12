package loop;

public class Nested1 {

    public static void main(String[] args) {

        for(int i =0; i<3 ; i++){
            System.out.println("외부 for" +" i의 값은?: " + i);
            for (int j=0; j<2; j++){
                System.out.println("내부 for" +" j의 값은?: " + j);

            }
        }
    }
}
