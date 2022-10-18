import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionaryOfManyTranslations;

    public DictionaryOfManyTranslations() {
        this.dictionaryOfManyTranslations = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dictionaryOfManyTranslations.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> dictionary = this.dictionaryOfManyTranslations.get(word);
        dictionary.add(translation);
    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> newTran = new ArrayList<>();
        if (Objects.nonNull(this.dictionaryOfManyTranslations.get(word))) {
            newTran = this.dictionaryOfManyTranslations.get(word);
        }
        return newTran;
    }

    public void remove(String word) {
        this.dictionaryOfManyTranslations.remove(word);
    }
}
