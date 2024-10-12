import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Question <T>{
    private String name;
    private String type;
    private int number;

    public Question(String name){
        this.name = name;
        this.number++;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract ArrayList<Integer> getAnswers();
    public abstract T getAnswer();
    public abstract String getQuestionString();
    public abstract Map <Integer, String> getPossibleChoices();
}
