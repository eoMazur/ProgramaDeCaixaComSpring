package com.pacientes.programadecaixacomspring.controller;

import com.pacientes.programadecaixacomspring.windows.AbrirInterface;
import javafx.scene.input.MouseEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class MainController {

    private final AbrirInterface abrirInterface;

    @Autowired
    public MainController(AbrirInterface abrirInterface) {
        this.abrirInterface = abrirInterface;
    }


    public void OnButtonCaixaClick(MouseEvent mouseEvent) throws IOException {
        abrirInterface.abrirNovaInterface("/Caixa.fxml", "Tela de Caixa");
    }

    public void OnButtonPrecoClick(MouseEvent mouseEvent) {
    }

    public void OnButtonCadastroClick(MouseEvent mouseEvent) throws IOException {
        abrirInterface.abrirNovaInterface("/Cadastro.fxml", "Tela de Cadastro");
    }

    public void OnButtonSobreClick(MouseEvent mouseEvent) {
    }

    public void OnButtonSairClick(MouseEvent mouseEvent) {
        System.exit(0);
    }


}
