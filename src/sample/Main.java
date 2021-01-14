package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    //Constants
    public static final int GRID_PADDING = 10;
    public static final int SCENE_WIDTH = 1080;
    public static final int SCENE_HEIGHT = 720;
    public static final int V_GAP = 8;
    public static final int H_GAP = 10;

    Button addCourseButton;
    GridPane grid;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        addCourseButton = new Button("Add Course");
        grid = new GridPane();
        grid.setPadding(new Insets(GRID_PADDING,GRID_PADDING,GRID_PADDING,GRID_PADDING));
        grid.setVgap(V_GAP);
        grid.setHgap(H_GAP);

        DatePicker datePickerStart = new DatePicker();
        DatePicker datePickerEnd = new DatePicker();

        Text titleText = new Text("Study Helper Setup");
        GridPane.setConstraints(titleText, 0, 0);

        Label courseNameLabel = new Label("Course Name:");
        GridPane.setConstraints(courseNameLabel,0,1);

        TextField courseNameInput = new TextField("");
        GridPane.setConstraints(courseNameInput, 1, 1);

        Label semesterStartLabel = new Label("Semester Start:");
        GridPane.setConstraints(semesterStartLabel, 0, 2);

        Label semesterEndLabel = new Label("Semester End:");
        GridPane.setConstraints(semesterEndLabel, 0, 3);

        GridPane.setConstraints(datePickerStart, 1, 2);
        GridPane.setConstraints(datePickerEnd, 1, 3);

        GridPane.setConstraints(addCourseButton, 1, 4);

        Text currentCoursesText = new Text("Current Courses");
        GridPane.setConstraints(currentCoursesText, 0, 6);

        grid.getChildren().addAll(titleText, courseNameLabel, courseNameInput, semesterStartLabel, semesterEndLabel, addCourseButton, datePickerStart, datePickerEnd, currentCoursesText);

        Scene scene = new Scene(grid, SCENE_WIDTH, SCENE_HEIGHT);

        primaryStage.setTitle("Study Helper");
        primaryStage.setScene(scene);

        addCourseButton.setOnAction( e -> {
            System.out.println(courseNameInput.getText());
            System.out.println(datePickerStart.getValue());
            System.out.println(datePickerEnd.getValue());

        });

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
