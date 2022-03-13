package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root);
        String css = this.getClass().getResource("style.css").toExternalForm();
        stage.setTitle("Calculator");

        Image icon = new Image("sample/images/icon.jpg");
        stage.getIcons().add(icon);

        scene.getStylesheets().add(css);
        stage.setResizable(false);

        stage.setScene(scene);
        stage.show();
    }
}
