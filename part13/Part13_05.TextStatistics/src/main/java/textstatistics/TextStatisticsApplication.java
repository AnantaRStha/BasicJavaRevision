package textstatistics;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        HBox lables = new HBox();
        lables.setSpacing(10);
        lables.getChildren().add(new Label("Letters: 0"));
        lables.getChildren().add(new Label("Words: 0"));
        lables.getChildren().add(new Label("The longest word is:"));
//        buttons.getChildren().add(new Button("Second"));
//        buttons.getChildren().add(new Button("Third"));

//        VBox texts = new VBox();
//        texts.setSpacing(10);
//        texts.getChildren().add(new Label("First"));
//        texts.getChildren().add(new Label("Second"));
//        texts.getChildren().add(new Label("Third"));

        layout.setBottom(lables);
//        layout.setLeft(texts);

        layout.setCenter(new TextArea(""));

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
