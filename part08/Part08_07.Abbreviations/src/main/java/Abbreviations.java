import java.util.HashMap;

public class Abbreviations {
        private HashMap<String, String> abbreviationsList;
    public Abbreviations() {
        this.abbreviationsList = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation){
        this.abbreviationsList.put(abbreviation,explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        return this.abbreviationsList.containsKey(abbreviation);
    }
    public String findExplanationFor(String abbreviation){
        return this.abbreviationsList.get(abbreviation);
    }
}
