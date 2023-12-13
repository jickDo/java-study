package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int value;

        // value = doubleValue;
        // 실수를 정수에 넣게 되면 에러 발

         value = (int) doubleValue; //형 변환
        System.out.println(value);
    }
}
