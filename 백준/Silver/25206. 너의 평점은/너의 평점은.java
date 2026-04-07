import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
            double totalGrade = 0.0;
        double result = 0.0;
        for (int i = 0; i < 20; i++) {
            String sub = scanner.next();
            double grade = scanner.nextDouble();
            String rate = scanner.next();

        if(rate.equals("P")) {
            continue;
        }

            totalGrade += grade;
            if (rate.equals("A+")) {

                result += grade * 4.5;
            } else if (rate.equals("A0")) {
                result += grade * 4.0;
            } else if (rate.equals("B+")) {
                result += grade * 3.5;
            } else if (rate.equals("B0")) {
                result += grade * 3.0;
            } else if (rate.equals("C+")) {
                result += grade * 2.5;
            } else if (rate.equals("C0")) {
                result += grade * 2.0;
            } else if (rate.equals("D+")) {
                result += grade * 1.5;
            } else if (rate.equals("D0")) {
                result += grade * 1.0;
            } else if (rate.equals("F")) {
                result += grade * 0.0;
            }


        }

        double avg = result / totalGrade;
        System.out.printf("%.6f\n", avg);





    }

}
