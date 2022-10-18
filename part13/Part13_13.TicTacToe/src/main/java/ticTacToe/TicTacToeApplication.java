package ticTacToe;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // 2. Create the views ("subviews")
//        PracticeView practiceView = new PracticeView(dictionary);
//        InputView inputView = new InputView(dictionary);

        // 3. Create the higher level layout
        BorderPane layout = new BorderPane();
        GridPane gridPane = new GridPane();


        Button btn1 = new Button(" ");
        btn1.setFont(Font.font("Monospaced", 40));
        Button btn2 = new Button(" ");
        btn2.setFont(Font.font("Monospaced", 40));
        Button btn3 = new Button(" ");
        btn3.setFont(Font.font("Monospaced", 40));
        Button btn4 = new Button(" ");
        btn4.setFont(Font.font("Monospaced", 40));
        Button btn5 = new Button(" ");
        btn5.setFont(Font.font("Monospaced", 40));
        Button btn6 = new Button(" ");
        btn6.setFont(Font.font("Monospaced", 40));
        Button btn7 = new Button(" ");
        btn7.setFont(Font.font("Monospaced", 40));
        Button btn8 = new Button(" ");
        btn8.setFont(Font.font("Monospaced", 40));
        Button btn9 = new Button(" ");
        btn9.setFont(Font.font("Monospaced", 40));

        gridPane.add(btn1, 0, 0);
        gridPane.add(btn2, 0, 1);
        gridPane.add(btn3, 0, 2);

        gridPane.add(btn4, 1, 0);
        gridPane.add(btn5, 1, 1);
        gridPane.add(btn6, 1, 2);

        gridPane.add(btn7, 2, 0);
        gridPane.add(btn8, 2, 1);
        gridPane.add(btn9, 2, 2);
        final boolean[] isX = {true};
        Label wordInstruction = new Label("Turn: X");
        String turnX = "Turn: X";
        String turnO = "Turn: O";

        Label finalWordInstruction = wordInstruction;
        btn1.setOnAction((event) -> {
            if (btn1.getText().equals(" ")) {
                if ((isX[0])) {
                    btn1.setText("X");
                    finalWordInstruction.setText(turnO);
                } else {
                    btn1.setText("O");
                    finalWordInstruction.setText(turnX);
                }
            }
            if (!btn1.getText().equals(" ") && !btn3.getText().equals(" ") && !btn4.getText().equals(" ") && !btn5.getText().equals(" ") && !btn6.getText().equals(" ")
                    && !btn7.getText().equals(" ") && !btn8.getText().equals(" ") && !btn9.getText().equals(" ")) {
                finalWordInstruction.setText("The end!");
            }
            isX[0] = !isX[0];
        });

        btn2.setOnAction((event) -> {
            if (btn2.getText().equals(" ")) {
                if ((isX[0])) {
                    btn2.setText("X");
                    finalWordInstruction.setText(turnO);
                } else {
                    btn2.setText("O");
                    finalWordInstruction.setText(turnX);
                }
            }
            if (!btn1.getText().equals(" ") && !btn3.getText().equals(" ") && !btn4.getText().equals(" ") && !btn5.getText().equals(" ") && !btn6.getText().equals(" ")
                    && !btn7.getText().equals(" ") && !btn8.getText().equals(" ") && !btn9.getText().equals(" ")) {
                finalWordInstruction.setText("The end!");
            }
            isX[0] = !isX[0];
        });

        btn3.setOnAction((event) -> {
            if (btn3.getText().equals(" ")) {
                if ((isX[0])) {
                    btn3.setText("X");
                    finalWordInstruction.setText(turnO);
                } else {
                    btn3.setText("O");
                    finalWordInstruction.setText(turnX);
                }
            }
            if (!btn1.getText().equals(" ") && !btn3.getText().equals(" ") && !btn4.getText().equals(" ") && !btn5.getText().equals(" ") && !btn6.getText().equals(" ")
                    && !btn7.getText().equals(" ") && !btn8.getText().equals(" ") && !btn9.getText().equals(" ")) {
                finalWordInstruction.setText("The end!");
            }
            isX[0] = !isX[0];
        });

        btn4.setOnAction((event) -> {
            if (btn4.getText().equals(" ")) {
                if ((isX[0])) {
                    btn4.setText("X");
                    finalWordInstruction.setText(turnO);
                } else {
                    btn4.setText("O");
                    finalWordInstruction.setText(turnX);
                }
            }
            if (!btn1.getText().equals(" ") && !btn3.getText().equals(" ") && !btn4.getText().equals(" ") && !btn5.getText().equals(" ") && !btn6.getText().equals(" ")
                    && !btn7.getText().equals(" ") && !btn8.getText().equals(" ") && !btn9.getText().equals(" ")) {
                finalWordInstruction.setText("The end!");
            }
            isX[0] = !isX[0];
        });

        btn5.setOnAction((event) -> {
            if (btn5.getText().equals(" ")) {
                if ((isX[0])) {
                    btn5.setText("X");
                    finalWordInstruction.setText(turnO);
                } else {
                    btn5.setText("O");
                    finalWordInstruction.setText(turnX);
                }
            }
            if (!btn1.getText().equals(" ") && !btn3.getText().equals(" ") && !btn4.getText().equals(" ") && !btn5.getText().equals(" ") && !btn6.getText().equals(" ")
                    && !btn7.getText().equals(" ") && !btn8.getText().equals(" ") && !btn9.getText().equals(" ")) {
                finalWordInstruction.setText("The end!");
            }
            isX[0] = !isX[0];
        });

        btn6.setOnAction((event) -> {
            if (btn6.getText().equals(" ")) {
                if ((isX[0])) {
                    btn6.setText("X");
                    finalWordInstruction.setText(turnO);
                } else {
                    btn6.setText("O");
                    finalWordInstruction.setText(turnX);
                }
            }
            if (!btn1.getText().equals(" ") && !btn3.getText().equals(" ") && !btn4.getText().equals(" ") && !btn5.getText().equals(" ") && !btn6.getText().equals(" ")
                    && !btn7.getText().equals(" ") && !btn8.getText().equals(" ") && !btn9.getText().equals(" ")) {
                finalWordInstruction.setText("The end!");
            }
            isX[0] = !isX[0];
        });

        btn7.setOnAction((event) -> {
            if (btn7.getText().equals(" ")) {
                if ((isX[0])) {
                    btn7.setText("X");
                    finalWordInstruction.setText(turnO);
                } else {
                    btn7.setText("O");
                    finalWordInstruction.setText(turnX);
                }
            }
            isX[0] = !isX[0];
        });
        btn8.setOnAction((event) -> {
            if (btn8.getText().equals(" ")) {
                if ((isX[0])) {
                    btn8.setText("X");
                    finalWordInstruction.setText(turnO);
                } else {
                    btn8.setText("O");
                    finalWordInstruction.setText(turnX);
                }
            }
            isX[0] = !isX[0];
        });
        btn9.setOnAction((event) -> {
            if (btn9.getText().equals(" ")) {
                if ((isX[0])) {
                    btn9.setText("X");
                    finalWordInstruction.setText(turnO);
                } else {
                    btn9.setText("O");
                    finalWordInstruction.setText(turnX);
                }
            }
            isX[0] = !isX[0];
        });


        wordInstruction.setFont(Font.font("Monospaced", 40));
        layout.setTop(wordInstruction);
        layout.setCenter(gridPane);


//        enterButton.setOnAction((event) -> layout.setCenter(inputView.getView()));
//        practiceButton.setOnAction((event) -> layout.setCenter(practiceView.getView()));


        // 6. Create the main view and add the high level layout
        Scene view = new Scene(layout, 400, 300);

        // 7. Show the application
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
