package array;

public class ArrayDi2 {

    public static void main(String[] args) {

        //2차원 배열 줄이기
        int[][] arr ={
                {1,2,3},
                {1,2,3}
        };

        for(int row=0; row<=1; row++){
            for(int column=0; column<=2; column++){
                System.out.println("arr["+row+"]["+column+"] = "+arr[row][column]);
            }
        }
    }
}
