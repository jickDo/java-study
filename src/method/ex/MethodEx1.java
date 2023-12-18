package method.ex;

public class MethodEx1 {

    public static void main(String[] args) {

        extractAverage(1,2,3);
        System.out.println("==============================");
        extractAverage(15,25,35);

    }

    public static void extractAverage(int one, int two, int three){
        int sum= one+two+three;
        double average = sum/3.0;
        System.out.println("평균값: "+ average);
    }
}
