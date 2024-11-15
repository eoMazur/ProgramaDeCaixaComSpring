package com.pacientes.programadecaixacomspring;

import com.pacientes.programadecaixacomspring.loader.SpringFXMLLoader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProgramaDeCaixaComSpringApplication extends Application {

    private ConfigurableApplicationContext springContext;

    @Override
    public void init(){
        springContext = new SpringApplicationBuilder(ProgramaDeCaixaComSpringApplication.class).run();
    }

    @Override
    public void start(Stage stage) throws Exception {
        //var context = SpringApplication.run(ProgramaDeCaixaComSpringApplication.class);
        //var fxml = new FXMLLoader((getClass().getResource("/Main.fxml")));

        SpringFXMLLoader fxmlLoader = springContext.getBean(SpringFXMLLoader.class);
        FXMLLoader fxml = fxmlLoader.load("/Main.fxml");

        Parent root = fxml.getRoot();

        Scene scene = new Scene(root);

        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Tela princípal");
        stage.show();
    }

    @Override
    public void stop(){
        springContext.stop();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
