import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CheckBox extends Question <Integer>{
    private String questionString = "";
    private HashMap<Integer, String> possibleChoices = new HashMap<>();
    private ArrayList<Integer> answers = new ArrayList<Integer>();
    public CheckBox(String name) {
        super(name);
        super.setType(String.valueOf(this.getClass()));
    }

    public void setQuestionString(String questionString){
        this.questionString = questionString;
    }

    public String getQuestionString() {
        return this.questionString;
    }

    public void setPossibleChoices(String possibleChoice1, String possibleChoice2, String possibleChoice3, String possibleChoice4){
        int num = 1;
        possibleChoices.put(num++, possibleChoice1);
        possibleChoices.put(num++, possibleChoice2);
        possibleChoices.put(num++, possibleChoice3);
        possibleChoices.put(num, possibleChoice4);
    }

    @Override
    public Map<Integer, String> getPossibleChoices() {
        return this.possibleChoices;
    }

    public void setAnswers(Integer rightAnswer1){
        answers.add(rightAnswer1);
    }

    public void setAnswers(Integer rightAnswer1, Integer rightAnswer2){
        answers.add(rightAnswer1);
        answers.add(rightAnswer2);
    }

    public void setAnswers(Integer rightAnswer1, Integer rightAnswer2, Integer rightAnswer3){
        answers.add(rightAnswer1);
        answers.add(rightAnswer2);
        answers.add(rightAnswer3);
    }

    public void setAnswers(Integer rightAnswer1, Integer rightAnswer2, Integer rightAnswer3, Integer rightAnswer4){
        answers.add(rightAnswer1);
        answers.add(rightAnswer2);
        answers.add(rightAnswer3);
        answers.add(rightAnswer4);
    }

    public ArrayList<Integer> getAnswers(){
        return this.answers;
    }


    @Override
    public Integer getAnswer(){
       return null;
    }





}
