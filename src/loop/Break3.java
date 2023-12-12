package loop;

public class Break3 {

    public static void main(String[] args) {
        int sum=0;

        for(int start=1 ;; start++){
            if (sum >=10){
                System.out.println(sum);
                break;
            }
            sum+=start;
        }
    }
}
