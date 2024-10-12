import java.util.*;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Quiz {
    private String name;
    private ArrayList<Question<?>> questionList = new ArrayList<>();
    private double score = 0.0;

    public void addQuestion(Question<?> question) {
        questionList.add(question);
    }

    public void removeQuestion(Question<?> question) {
        questionList.remove(question);
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        if (score == 0) {
            this.score += 1;
        }
        else if (score < 1){
            this.score += score;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public double gradeQuiz() {
        double score = questionList.size() - this.score;
        return Math.round(score / questionList.size() * 100);
    }
    //must subtract wrong answers when using checkbox quiz

    public Boolean getBoolean(Scanner input) {
        Boolean userAnswer = null;
        try {
            userAnswer = input.nextBoolean();
        } catch (Exception e) {
            System.out.println("You must enter either a true or false.");
            input.nextLine();
            return getBoolean(input);
        }
        return userAnswer;
    }

    public void startQuiz() {
        Scanner input = new Scanner(System.in);
        for (Question<?> question : questionList) {

            if (question instanceof TrueFalse) {
                System.out.println(question.getQuestionString());
                System.out.println("Please enter either 'True' or 'False': ");
                Boolean userAnswer = getBoolean(input);
                if (userAnswer.equals(question.getAnswer())) {
                    System.out.println("The correct answer was " + question.getAnswer() + ". You answered "
                            + userAnswer + ". You were correct.");
                    setScore(1);
                } else {
                    System.out.println("The correct answer was " + question.getAnswer() + ". You answered "
                            + userAnswer + ". You were incorrect.");
                    setScore(0);
                }
            } else if (question instanceof MultChoice) {
                Integer answer = (Integer) question.getAnswer();
                System.out.println(question.getQuestionString());
                Map<Integer, String> possibleChoices = question.getPossibleChoices();
                for (Map.Entry<Integer, String> entry : possibleChoices.entrySet())
                    System.out.println(entry.getKey() + " " + entry.getValue());
                System.out.println("Please enter your answer in a number form: ");
                Number userAnswer = input.nextInt();
                if (userAnswer.equals(answer)) {
                    System.out.println("The correct answer was " + answer + ". You entered " + userAnswer +
                            ". You were correct.");
                    setScore(1);
                } else {
                    System.out.println("The correct answer was " + answer + ". You entered " + userAnswer +
                            ". You were incorrect.");
                    setScore(0);
                }
            } else {
                Double rightAnswers = 0.0;
                System.out.println(question.getQuestionString());
                Map<Integer, String> possibleChoices = question.getPossibleChoices();
                for (Map.Entry<Integer, String> entry : possibleChoices.entrySet())
                    System.out.println(entry.getKey() + " " + entry.getValue());
                System.out.println("Please choose all correct answers in number form one by one: ");
                System.out.println("Please enter 0 when done choosing.");
                ArrayList<Integer> answers = new ArrayList<>();
                int userInput;
                do{
                    userInput = input.nextInt();
                    if(userInput != 0) {
                        answers.add(userInput);
                    }
                }
                while(userInput != 0);
                for (Integer userChoice : answers) {
                    for (Integer rightAnswer : question.getAnswers()) {
                        if (userChoice == rightAnswer) {
                            rightAnswers ++;

                        }
                    }
                }
                setScore(rightAnswers / question.getAnswers().size());
            }
        }
    }
}
