package loop;

public class For1 {

    public static void main(String[] args) {
        int destination = 3;
        int sum=0;
        for(int start=1; start<=destination; start++){
            sum +=start;
            System.out.println("현재 합은?: "+ sum);
        }
    }
}
