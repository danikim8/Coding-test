import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //6단계 - 8
        Scanner sc = new Scanner(System.in);
        int n = 20;//전공과목 개수

        double totalCredits = 0.0;
        double totalGradePoints = 0.0;

        for(int i=0; i<n; i++){
            String subject = sc.next(); //과목명
            double credits = sc.nextDouble(); //학점
            String grade = sc.next(); //등급
            //ObjectOrientedProgramming1 3.0 A+

            if(!grade.equals("P")){// P/F 과목 아닌 경우에만 계산
                double gradePoints = getGradePoints(grade); //과목평점
                totalCredits += credits;
                totalGradePoints += credits * gradePoints;
            }
        }
        double majorGPA = totalGradePoints / totalCredits;
        System.out.printf("%.6f\n",majorGPA);
    }
    //등급을 기반으로 과목평점을 반환하는 함수
    public static double getGradePoints(String grade) {
        switch (grade) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return 0.0; // 기타 등급은 0.0으로 처리
        }
    }
}
