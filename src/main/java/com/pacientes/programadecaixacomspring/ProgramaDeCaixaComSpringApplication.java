package com.pacientes.programadecaixacomspring;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProgramaDeCaixaComSpringApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        var context = SpringApplication.run(ProgramaDeCaixaComSpringApplication.class);
        var fxml = new FXMLLoader((getClass().getResource("/Main.fxml")));


        var scene = new Scene(fxml.load());
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Tela princípal");
        stage.show();
    }
}
