package dictionary;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // You can test your dictionary here
//        SaveableDictionary dictionary = new SaveableDictionary();
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        dictionary.add("ohjelmointi", "programming");
//        dictionary.delete("apina");
//        dictionary.delete("banana");
//
//        System.out.println(dictionary.translate("apina"));
//        System.out.println(dictionary.translate("monkey"));
//        System.out.println(dictionary.translate("banana"));
//        System.out.println(dictionary.translate("banaani"));
//        System.out.println(dictionary.translate("ohjelmointi"));
//        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
//        boolean wasSuccessful = dictionary.load();
//
//        if (wasSuccessful) {
//            System.out.println("Successfully loaded the dictionary from file");
//        }
//        dictionary.save();
        SaveableDictionary s = new SaveableDictionary( "words.txt");
                s.load();
                s.translate("olut");
                s.save();
    }
}
