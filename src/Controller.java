import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    private Button btnAddCourse;

    public void handleButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("newFXML.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Scene scene = new Scene(root, 600, 65);
        Stage stage;

    }
}
