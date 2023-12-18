package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        repeatWord("안녕",5);
    }

    public static void repeatWord(String message,int number){
        for(int i=0; i<number; i++){
            System.out.println(message);
        }
    }
}
