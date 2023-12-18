package method;

public class MethodRef {

    public static void main(String[] args) {
        //겨산 1

        int sum= add(1,2);
        System.out.println("a + b = "+ sum);

        //계산 2
        //TODO sum2는 안좋은 네이밍
        //TODO addXAndY 이런 명확한 네이밍이 좋음
        int sum2= add(10,20);
        System.out.println("x + y = "+sum2);
    }

    public static int add(int x, int y){
        return x+y;
    }
}
