package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {

        BorderPane layoutFirst = new BorderPane();
        Button first = new Button("To the second view!");
        layoutFirst.setTop(new Label("First view!"));
        layoutFirst.setCenter(first);

        VBox vBox = new VBox();
        Button second = new Button("To the third view!");
        vBox.getChildren().add(second);
        vBox.getChildren().add(new Label("Second view!"));

        GridPane layoutThird = new GridPane();
        layoutThird.add(new Label("Third view!"), 0, 0);
        Button button = new Button("To the first view!");
        layoutThird.add(button, 1, 1);

        Scene firstPanel = new Scene(layoutFirst);
        Scene secondPanel = new Scene(vBox);
        Scene thirdPanel = new Scene(layoutThird);

        first.setOnAction((event) -> {
            window.setScene(secondPanel);
        });

        second.setOnAction((event) -> {
            window.setScene(thirdPanel);
        });
        button.setOnAction((event) -> {
            window.setScene(firstPanel);
        });

        window.setScene(firstPanel);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
