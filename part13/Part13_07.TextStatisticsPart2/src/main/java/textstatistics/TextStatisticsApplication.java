package textstatistics;


import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.util.Arrays;

import static javafx.application.Application.launch;

public class TextStatisticsApplication extends Application {


    @Override
    public void start(Stage window) {

        BorderPane layout = new BorderPane();
        TextArea textArea = new TextArea("");
        HBox lables = new HBox();
        Label letters = new Label();
        Label word = new Label();
        Label longestWord = new Label();
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            // set values of text elements
            letters.setText("Letters: " + characters);
            word.setText("Words: " + words);
            longestWord.setText("The longest word is: " + longest);
        });
        lables.setSpacing(10);
        lables.getChildren().add(letters);
        lables.getChildren().add(word);
        lables.getChildren().add(longestWord);
        layout.setBottom(lables);
        layout.setCenter(textArea);
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}
