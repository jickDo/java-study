package scanner.ex;

public class ChangeVarEx {

    public static void main(String[] args) {
        int tmp;
        int first = 10;
        int second = 20;

        tmp = first;
        first = second;
        second = tmp;

        System.out.println(tmp+" "+ first+" "+ second);
    }
}
