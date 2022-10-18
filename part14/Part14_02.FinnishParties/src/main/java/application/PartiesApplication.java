package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.File;
import java.nio.file.Paths;
import java.util.*;

public class PartiesApplication extends Application {


    @Override
    public void start(Stage stage) {

        Map<String, List<Double>> map = new HashMap<>();
        try (Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))) {

            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                // we print the line that we read
                String[] pieces = row.split("\t");
                List<Double> values = new ArrayList<>();
                String key = "";
                for (int i = 0; i < pieces.length; i++) {
                    if (i == 0) {
                        key = pieces[i];
                    } else {
                        if (pieces[i].equals("-")) {
                            values.add(0.0);
                        } else {
                            values.add(Double.valueOf(pieces[i]));
                        }
                    }
                }
                map.put(key, values);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        NumberAxis xAxis = new NumberAxis(1968, 2008, 5);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        map.remove("Party");
        for (String key : map.keySet()) {
            XYChart.Series data = new XYChart.Series();
            data.setName(key);
            if (map.get(key).get(0) != 0.0) data.getData().add(new XYChart.Data(1968, map.get(key).get(0)));
            if (map.get(key).get(1) != 0.0) data.getData().add(new XYChart.Data(1972, map.get(key).get(1)));
            if (map.get(key).get(2) != 0.0) data.getData().add(new XYChart.Data(1976, map.get(key).get(2)));
            if (map.get(key).get(3) != 0.0) data.getData().add(new XYChart.Data(1980, map.get(key).get(3)));
            if (map.get(key).get(4) != 0.0) data.getData().add(new XYChart.Data(1984, map.get(key).get(4)));
            if (map.get(key).get(5) != 0.0) data.getData().add(new XYChart.Data(1988, map.get(key).get(5)));
            if (map.get(key).get(6) != 0.0) data.getData().add(new XYChart.Data(1992, map.get(key).get(6)));
            if (map.get(key).get(7) != 0.0) data.getData().add(new XYChart.Data(1996, map.get(key).get(7)));
            if (map.get(key).get(8) != 0.0) data.getData().add(new XYChart.Data(2000, map.get(key).get(8)));
            if (map.get(key).get(9) != 0.0) data.getData().add(new XYChart.Data(2004, map.get(key).get(9)));
            if (map.get(key).get(10) != 0.0) data.getData().add(new XYChart.Data(2008, map.get(key).get(10)));
            lineChart.getData().add(data);
        }
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
