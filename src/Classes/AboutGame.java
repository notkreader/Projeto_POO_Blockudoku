package Classes;

import Blockudoku.MenuInfo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/* 
 * NetBeans Project
 * @JoaoCabete
 * @190221046
 */
public class AboutGame extends VBox {
    
    /**
     * This constructor will call the createWindow method
     */
    public AboutGame() {
        createWindow();
    }
    
    /**
     * This method will display the information about Blockudoku
     */
    public void createWindow() {
        setAlignment(Pos.CENTER);
        setSpacing(20);
        setPadding(new Insets(30));
        
        Label cmdLabel = new Label("Sobre o Jogo");
        cmdLabel.setFont(Font.loadFont("file:resources/fonts/DidactGothic.ttf", 40));
        
        TextArea txtArea = new TextArea(MenuInfo.menuFive());
        txtArea.setFont(Font.loadFont("file:resources/fonts/DidactGothic.ttf", 18));
        txtArea.setEditable(false);
        txtArea.setBackground(null);
        txtArea.setFocusTraversable(false);
        
        Button back = new Button("Voltar");
        back.setFont(Font.loadFont("file:resources/fonts/DidactGothic.ttf", 18));
        back.setMinWidth(40);
        back.setFocusTraversable(true);
        back.setOnAction(e -> 
                ((Stage) back.getScene().getWindow()).close());
        
        this.getChildren().addAll(cmdLabel, txtArea, back);
    }
}
