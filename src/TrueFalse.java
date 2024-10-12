import java.util.ArrayList;
import java.util.HashMap;

public class TrueFalse extends Question<Boolean>{
    private String questionString = "";
    private boolean answer;
    public TrueFalse(String name, String question) {
        super(name);
        super.setType(String.valueOf(this.getClass()));
        this.questionString = question;
    }

    public String getQuestionString() {
        return questionString;
    }

    public void setQuestionString(String questionString) {
        this.questionString = questionString;
    }

    public Boolean getAnswer(){
        return this.answer;
    }

    public ArrayList<Integer> getAnswers(){
        return null;
    }

    public void setAnswer(boolean answer){
        this.answer = answer;
    }
    @Override
    public HashMap<Integer, String> getPossibleChoices() {
        return null;
    }
}
