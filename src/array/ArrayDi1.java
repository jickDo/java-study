package array;

public class ArrayDi1 {

    public static void main(String[] args) {

        int[][] arr =new int[2][3];

        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;

        arr[1][0]=1;
        arr[1][1]=2;
        arr[1][2]=3;


        for(int row=0; row<=1; row++){
            for(int column=0; column<=2; column++){
                System.out.println("arr["+row+"]["+column+"] = "+arr[row][column]);
            }
        }
    }
}
