package array;

public class ArrayDi0 {

    public static void main(String[] args) {

        int[][] arr =new int[2][3];

        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;

        arr[1][0]=1;
        arr[1][1]=2;
        arr[1][2]=3;

        System.out.println("arr[0][0] = "+ arr[0][0]);
        System.out.println("arr[0][1] = "+ arr[0][1]);
        System.out.println("arr[0][2] = "+ arr[0][2]);
        System.out.println("===========================");

        System.out.println("arr[0][0] = "+ arr[1][0]);
        System.out.println("arr[0][1] = "+ arr[1][1]);
        System.out.println("arr[0][2] = "+ arr[1][2]);
        System.out.println("===========================");
    }
}