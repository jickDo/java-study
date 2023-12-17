package array.ex;

public class ArrayEx1 {

    public static void main(String[] args) {
        int array[] ={90,80,70,60,50};

        int total=0;
        double average;

        for(int i=0; i<5; i++){
            total+=array[i];
        }
        average= (double) total/ array.length;

        System.out.println("총합은? = "+ total);
        System.out.println("평균은? = "+ average);
    }
}
