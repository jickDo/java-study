package operator;

public class Operator2 {

    public static void main(String[] args) {

        //문자열과 문자열 더하기
        String result1 = "hello" + "world";
        System.out.println(result1);

        //문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        System.out.println(s1+" "+s2);

        //문자열과 숫자 더하기
        //문자열과 숫자가 더해질때 숫자가 문자로 변해서 더해짐
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        //문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

    }
}
