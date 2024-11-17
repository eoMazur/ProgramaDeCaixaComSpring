package com.pacientes.programadecaixacomspring.windows;

import com.pacientes.programadecaixacomspring.loader.SpringFXMLLoader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AbrirInterface {

    private final SpringFXMLLoader fxmlLoader;

    @Autowired
    public AbrirInterface(SpringFXMLLoader fxmlLoader) {
        this.fxmlLoader = fxmlLoader;
    }

    public void abrirNovaInterface(String fxmlPath, String titulo) {
        try {
            FXMLLoader loader = fxmlLoader.load(fxmlPath);
            Parent root = loader.getRoot();

            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setTitle(titulo);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
