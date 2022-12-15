public class ScoreProcess {
    int totalPercentage;
    public void resultExpression(int math, int eng, int pys){
    totalPercentage = (math + eng + pys) *100/ 150;
        System.out.println("percentage : "  + totalPercentage);

    if(totalPercentage >=80){
        System.out.println("Grade: " + "A");

    } else if (totalPercentage >=70) {
        System.out.println("Grade: " + "B");

    }else if(totalPercentage >=50){
        System.out.println("Grade: " +"C");
    }else if(totalPercentage>=40) {
        System.out.println("Grade: " + "D");
    }else {
        System.out.println("Grade: " + "F");
    }


    }
}
