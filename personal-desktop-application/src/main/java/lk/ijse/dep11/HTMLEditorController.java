package lk.ijse.dep11;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.util.Objects;

public class HTMLEditorController {
    public MenuItem btnUserGuide;
    public MenuItem btnAboutUs;
    public MenuItem btnFileNew;
    public MenuItem btnFileExit;
    public AnchorPane HTMLroot;

    public void Initialize(){

    }

    public void btnUserGuideOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane userGuideRoot = FXMLLoader.load(getClass().getResource("/view/UserGuide.fxml"));
        Scene userGuideScene = new Scene(userGuideRoot);

        Stage primryStage = new Stage();
        primryStage.setScene(userGuideScene);

        primryStage.initModality(Modality.WINDOW_MODAL);
        primryStage.initOwner(HTMLroot.getScene().getWindow());

        primryStage.setTitle("User Guide");
        primryStage.centerOnScreen();
        primryStage.alwaysOnTopProperty();
        primryStage.show();
    }

    public void btnAboutUsOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane aboutUsRoot = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/AboutUs.fxml")));
        Scene aboutUsScene = new Scene(aboutUsRoot);

        Stage primaryStage = new Stage();
        primaryStage.setScene(aboutUsScene);

        primaryStage.initStyle(StageStyle.TRANSPARENT);
        aboutUsRoot.setBackground(Background.fill(Color.TRANSPARENT));
        aboutUsScene.setFill(Color.TRANSPARENT);

        FadeTransition fade = new FadeTransition(Duration.millis(2000),aboutUsRoot);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.playFromStart();

        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.sizeToScene();
        primaryStage.show();
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
