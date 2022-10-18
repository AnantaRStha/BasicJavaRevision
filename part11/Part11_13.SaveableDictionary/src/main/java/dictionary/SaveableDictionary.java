package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SaveableDictionary {
    private HashMap<String, List<String>> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(file)).forEach(row ->
            {
                String[] parts = row.split(":");
                if (parts.length == 2) {
                    add(parts[0].trim(), parts[1].trim());
                }
            });
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public void add(String word, String translation) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.get(word).add(translation);
        } else {
            List<String> translations = new ArrayList<>();
            translations.add(translation);
            this.dictionary.put(word, translations);
        }
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word).get(0);
        } else {
            for (String s : this.dictionary.keySet()) {
                if (this.dictionary.get(s).contains(word)) {
                    return s;
                }
            }
        }
        return null;
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        } else {
            for (String s : this.dictionary.keySet()) {
                if (this.dictionary.get(s).contains(word)) {
                    this.dictionary.remove(s);
                    break;
                }
            }
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(file);
            for (String s : this.dictionary.keySet()) {
                this.dictionary.get(s).stream().forEach(x -> {
                    writer.println(s + ":" + x);
                });
            }
            writer.close();
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }

    }

}
