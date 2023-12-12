package loop;

public class Continue1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true){

            if(i==3){
                i++;
                continue;
            }

            System.out.println("현재 i의 값은?: "+ i);
            i++;

            if(i==6){
                break;
            }


        }
}}
