package org.skalicky.example.javafx.helloworld;

import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFxApplication extends Application {

    public static void main(final String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX Hello-World app - main window");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

}
