package org.skalicky.example.javafx.helloworldwithspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.stage.Stage;

@SpringBootApplication
public class JavaFxApplication extends Application {

    private static String[] savedArgs;

    private ConfigurableApplicationContext applicationContext;

    public static void main(final String[] args) throws Exception {
        launchApp(JavaFxApplication.class, args);
    }

    private static void launchApp(Class<? extends Application> appClass, String[] args) {

        savedArgs = args;
        Application.launch(appClass, args);
    }

    @Override
    public void init() throws Exception {
        applicationContext = SpringApplication.run(getClass(), savedArgs);
        applicationContext.getAutowireCapableBeanFactory().autowireBean(this);
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX Spring-Boot Hello-World app - main window");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        applicationContext.close();
    }

}
