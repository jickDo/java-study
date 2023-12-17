package array;

public class Array1Ref1 {

    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5];

        //변수값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학생1 의 점수 " +students[0]);
        System.out.println("학생2 의 점수 " +students[1]);
        System.out.println("학생3 의 점수 " +students[2]);
        System.out.println("학생4 의 점수 " +students[3]);
        System.out.println("학생5 의 점수 " +students[4]);

        System.out.println(students);
        //배열 그자체는 주소값만 가지고있다.
    }
}
