package GUI;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class UIMain extends Application{

    @FXML
    private Parent parent;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("GUIMainFXML.fxml"));
        primaryStage.setTitle("CloRec");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();


    }
}


