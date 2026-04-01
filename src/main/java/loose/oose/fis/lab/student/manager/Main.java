package loose.oose.fis.lab.student.manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader root = FXMLLoader.load(getClass().getResource("fxml/view-students.fxml"));
        primaryStage.setTitle("FIS - Student Manager-ceva");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}