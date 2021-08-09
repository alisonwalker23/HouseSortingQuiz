import java.util.Scanner;

public class HouseQuiz {

    private static Scanner userInput = new Scanner(System.in);
    private static Questions ques = new Questions();

    public static void main(String[] args) {

        // print questions/answer options then uses Scanner for user answer
        System.out.println(ques.questions());

        // uses placement method to calculate which house
        System.out.println(ques.placement());
    }

}
