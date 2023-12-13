package casting;

public class Casting1 {

    public static void main(String[] args) {
        int value = 10;
        long longValue;
        double doubleValue;

        longValue = value; //int -> long
        System.out.println("int형을 long형으로 변환 " + longValue);

        doubleValue = longValue;
        System.out.println("long형을 double형으로 변환 " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue2 = "+ doubleValue);

    }
}
