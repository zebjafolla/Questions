import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MultChoice extends Question<Integer>{
    private String questionString = "";
    private HashMap <Integer, String> possibleChoices = new HashMap<>();
    private Integer answer;
    public MultChoice(String name){
        super(name);
        super.setType(String.valueOf(this.getClass()));
    }

    public String getQuestionString() {
        return questionString;
    }

    public void setQuestionString(String questionString) {
        this.questionString = questionString;
    }

    public Map <Integer, String> getPossibleChoices() {
        return this.possibleChoices;
    }

    public void setPossibleChoices(String possibleAnswer1, String possibleAnswer2, String possibleAnswer3, String possibleAnswer4) {
        int num = 1;
        possibleChoices.put(num++, possibleAnswer1);
        possibleChoices.put(num++, possibleAnswer2);
        possibleChoices.put(num++, possibleAnswer3);
        possibleChoices.put(num, possibleAnswer4);

    }
    public ArrayList<Integer> getAnswers(){
        return null;
    }
    public Integer getAnswer() {
        return this.answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }
}
