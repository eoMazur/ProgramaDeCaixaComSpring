# Sistema de Caixa com Spring Boot e JavaFX

Este projeto é um sistema de caixa desenvolvido como parte da disciplina de **Programação Orientada a Objetos II (POO2)** do curso de **Análise e Desenvolvimento de Sistemas** no **IFPR - Campus União da Vitória**. Ele combina a robustez do **Spring Boot** no backend com a facilidade do **JavaFX** para a interface gráfica.

---

## Pré-requisitos

Antes de começar, certifique-se de ter as ferramentas necessárias:

1. **Java Development Kit (JDK) 21** (ou versão compatível).
2. **IntelliJ IDEA** (ou outra IDE da sua preferência).
3. **Gradle** ou **Maven** (configurado no projeto Spring Boot).
4. As bibliotecas do **JavaFX SDK** disponíveis na pasta `javafx-sdk` do repositório.

---

## Como configurar o projeto

### 1. Clone o repositório
Abra um terminal e execute os seguintes comandos:
```bash
git clone <URL_DO_REPOSITORIO>
cd <NOME_DO_DIRETORIO>
```

### 2. Configure as bibliotecas do JavaFX

As bibliotecas necessárias estão localizadas na pasta **`javafx-sdk`** dentro do repositório. Para configurá-las no IntelliJ IDEA:

1. Abra o IntelliJ IDEA e vá até **File > Project Structure > Libraries**.
2. Clique no botão **+** (Adicionar) e selecione **Java**.
3. Navegue e selecione a pasta **`javafx-sdk/lib`** no diretório clonado.
4. Confirme e aplique as alterações.

### 3. Configure as opções de execução

Para executar o projeto com JavaFX, você precisa configurar as opções de VM no IntelliJ IDEA:

1. Vá até **Run > Edit Configurations**.
2. Selecione a configuração de execução da classe principal (ProgramaDeCaixaComSpring).
3. No campo **VM options**, adicione o seguinte comando (substituindo `<CAMINHO_ABSOLUTO_PARA_JAVAFX-SDK/LIB>` pelo caminho real da pasta):
   ```bash
   --module-path <CAMINHO_ABSOLUTO_PARA_JAVAFX-SDK/LIB> --add-modules javafx.controls,javafx.fxml
   ```

4. Salve as configurações.

---

## Como executar o programa

1. Certifique-se de que todas as bibliotecas estão configuradas corretamente e as opções de VM foram ajustadas.
2. No IntelliJ IDEA, localize a classe principal do projeto (ProgramaDeCaixaComSpring).
3. Clique com o botão direito do mouse e selecione **Run 'Application'** para iniciar o programa.
4. A interface gráfica será exibida, conectada ao backend gerenciado pelo Spring Boot.

---

## Estrutura do Projeto

- **Backend (Spring Boot)**:
    - Responsável pela lógica de negócios, persistência de dados e comunicação com a interface.
- **Frontend (JavaFX)**:
    - Fornece uma interface gráfica amigável para interação com o utilizador.

---

## Sobre o IFPR União da Vitória

Este projeto foi desenvolvido como parte do curso de **Análise e Desenvolvimento de Sistemas** no **Instituto Federal do Paraná**, campus União da Vitória.

---

**Sinta-se à vontade para explorar, modificar e contribuir com este projeto. As suas sugestões e melhorias são bem-vindas! 😊**


