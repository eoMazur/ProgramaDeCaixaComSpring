package com.pacientes.programadecaixacomspring.windows;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CaixaJanela {

    public CaixaJanela() throws IOException {
        var fxml = new FXMLLoader((getClass().getResource("/Caixa.fxml")));


        var scene = new Scene(fxml.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Tela de Caixa");
        stage.show();
    }
}
