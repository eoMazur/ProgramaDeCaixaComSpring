package com.pacientes.programadecaixacomspring.controller;

import com.pacientes.programadecaixacomspring.windows.CadastroJanela;
import com.pacientes.programadecaixacomspring.windows.CaixaJanela;
import javafx.scene.input.MouseEvent;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MainController {



    public void OnButtonCaixaClick(MouseEvent mouseEvent) throws IOException {
        new CaixaJanela();
    }

    public void OnButtonPrecoClick(MouseEvent mouseEvent) {
    }

    public void OnButtonCadastroClick(MouseEvent mouseEvent) throws IOException {
        new CadastroJanela();
    }

    public void OnButtonSobreClick(MouseEvent mouseEvent) {
    }

    public void OnButtonSairClick(MouseEvent mouseEvent) {
        System.exit(0);
    }


}
