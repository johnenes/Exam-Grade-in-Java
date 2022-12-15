import  java.util.Scanner;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter mathematics score ");
        int mathScore = input.nextInt();
        System.out.println("Enter English Score ");
        int engScore = input.nextInt();
        System.out.println("Enter Physics Score ");
        int pyhScore = input.nextInt();

        ScoreProcess getScoreGrade = new ScoreProcess();

        getScoreGrade.resultExpression(mathScore, engScore,pyhScore );
    }
}