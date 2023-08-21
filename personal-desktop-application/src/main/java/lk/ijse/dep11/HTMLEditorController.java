package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HTMLEditorController {
    public MenuItem btnUserGuide;
    public MenuItem btnAboutUs;
    public MenuItem btnFileNew;
    public MenuItem btnFileExit;

    public void Initialize(){

    }

    public void btnUserGuideOnAction(ActionEvent actionEvent) {

    }

    public void btnAboutUsOnAction(ActionEvent actionEvent) {

    }

    public void btnFileNewOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane HTMLroot = FXMLLoader.load(getClass().getResource("/view/HTMLEditor.fxml"));
        Scene htmlScene = new Scene(HTMLroot);

        Stage primaryStage = (Stage) HTMLroot.getScene().getWindow();
        primaryStage.setScene(htmlScene);
        primaryStage.setTitle("Text Editor");
        primaryStage.setMaximized(true);
        primaryStage.setResizable(true);
        primaryStage.centerOnScreen();
        primaryStage.alwaysOnTopProperty();
        primaryStage.show();
    }

    public void btnFileExitOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }
}
