import java.util.InputMismatchException;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args){
        System.out.println("Welcome to the quiz");
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Hello " + name);
        Quiz animals = new Quiz();
        MultChoice elephant = new MultChoice("Elephant");
        elephant.setQuestionString("What colors are elephants typically?");
        elephant.setPossibleChoices("White", "Purple", "Yellow", "Grey");
        elephant.setAnswer(4);
        animals.addQuestion(elephant);
        MultChoice tiger = new MultChoice("Tiger");
        tiger.setQuestionString("What colors are tigers typically?");
        tiger.setPossibleChoices("Green and Black", "White and Blue", "Purple and Yellow", "Orange and Black");
        tiger.setAnswer(4);
        TrueFalse deer = new TrueFalse("Deer", "Is a buck a type of deer?");
        deer.setAnswer(true);
        CheckBox walrus = new CheckBox("Walrus");
        walrus.setQuestionString("Choose all numbers that correctly describe a walrus.");
        walrus.setPossibleChoices("Mammal", "Water Creature", "Can fly", "Has hooves");
        walrus.setAnswers(1);
        walrus.setAnswers(2);
        animals.addQuestion(deer);
        animals.addQuestion(tiger);
        animals.addQuestion(walrus);
        animals.startQuiz();
        System.out.println("You got a " + animals.gradeQuiz() + " on this test.");


    }
}
