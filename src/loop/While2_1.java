package loop;

public class While2_1 {

    public static void main(String[] args) {
        int sum = 0;
        int start = 1;
        int destination = 3;
        while(start<=destination){
            sum += start;
            start++;
        }
        System.out.println(sum);
    }
}
