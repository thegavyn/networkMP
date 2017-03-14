import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.control.TextField;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by Mark Gavin on 3/12/2017.
 */
public class Client extends Application {
    Scene stMenu, batField, login, winX;
    VBox sMenu, lMenu, winFrame;
    HBox batMenu;
    StackPane back;
    Stage window;

    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;
        primaryStage.setTitle("THE WORLD'S GREATEST ROCK PAPER SCISSORS GAME");
        sMenu = firstWindow();
        stMenu = new Scene(sMenu, 1000, 700);
        back = secondWindow();
        batField = new Scene(back, 1000, 700);
        lMenu = loginHere();
        login = new Scene(lMenu, 300, 350);
        winFrame = winningC();
        winX = new Scene(winFrame, 500, 500);
        window.setScene(stMenu);
        primaryStage.show();
    }
    public VBox firstWindow()
    {
        ImageView iv = new ImageView();
        ImageView ig = new ImageView();
        Image titleS = new Image("logo.png", 800, 400, false, false);
        iv.setImage(titleS);
        Image blink = new Image("start.gif", 150, 100, false, false);
        ig.setImage(blink);
        sMenu = new VBox(20);
        VBox holder = new VBox(20);
        sMenu.setPadding(new Insets(50, 100, 50, 100));
        sMenu.setSpacing(10);
        Button goTo = new Button("", ig);
        goTo.setOnAction(e -> window.setScene(login));
        holder.getChildren().add(goTo);
        holder.setPadding(new Insets(0, 0, 0, 350));
        sMenu.getChildren().addAll(iv, holder);
        goTo.setStyle("-fx-background-color: Black;");
        sMenu.setStyle("-fx-background-color: Black;");
        return sMenu;
    }
    public StackPane secondWindow()
    {
        ImageView aren = new ImageView();
        ImageView r1 = new ImageView();
        ImageView s1 = new ImageView();
        ImageView p1 = new ImageView();
        ImageView r2 = new ImageView();
        ImageView s2 = new ImageView();
        ImageView p2 = new ImageView();
        Label pOne = new Label("Player 1");
        Label pTwo = new Label("Player 2");
        VBox first = new VBox(20);
        VBox second = new VBox(20);
        Button bp1, br1, bs1, bp2, br2, bs2;
        Image batField = new Image("arena.jpg", true);
        Image rock1 = new Image("bato.png", 100, 100 , false, false);
        Image scissors1 = new Image("gunting.png", 100, 100 , false, false);
        Image paper1 = new Image("papel.png", 100, 100 , false, false);
        Image rock2 = new Image("bato.png", 100, 100 , false, false);
        Image scissors2 = new Image("gunting.png", 100, 100 , false, false);
        Image paper2 = new Image("papel.png", 100, 100 , false, false);
        aren.setImage(batField);
        p1.setImage(paper1);
        s1.setImage(scissors1);
        r1.setImage(rock1);
        r2.setImage(rock2);
        p2.setImage(paper2);
        s2.setImage(scissors2);
        bp1 = new Button ("", p1);
        bp1.setOnAction(e -> window.setScene(winX));
        bp2 = new Button ("", p2);
        bs1 = new Button ("", s1);
        bs2 = new Button ("", s2);
        br1 = new Button("", r1);
        br2 = new Button ("", r2);
        bp1.setStyle("-fx-background-color: rgba(199, 63, 92, 0.4);");
        bs1.setStyle("-fx-background-color: rgba(199, 63, 92, 0.4);");
        br1.setStyle("-fx-background-color: rgba(199, 63, 92, 0.4);");
        bs2.setStyle("-fx-background-color: rgba(52, 63, 125, 0.4);");
        br2.setStyle("-fx-background-color: rgba(52, 63, 125, 0.4);");
        bp2.setStyle("-fx-background-color: rgba(52, 63, 125, 0.4);");
        batMenu = new HBox(20);
        HBox ph1 = new HBox(5);
        HBox ph2 = new HBox(5);
        ph1.getChildren().addAll(bp1, bs1, br1);
        ph2.getChildren().addAll(bp2, bs2, br2);
        ph1.setPadding(new Insets(300, 0, 0, 80));
        ph2.setPadding(new Insets(300, 0, 0, 80));
        first.getChildren().addAll(pOne, ph1);
        second.getChildren().addAll(pTwo, ph2);
        first.setPadding(new Insets(150, 0, 0, 0));
        second.setPadding(new Insets(150, 0, 0, 0));
        first.setSpacing(-200);
        second.setSpacing(-200);
        pOne.setStyle("-fx-font: 24 arial;");
        pTwo.setStyle("-fx-font: 24 arial;");
        batMenu.getChildren().addAll(first, second);
        first.setStyle("-fx-background-color: rgba(199, 63, 92, 0.4);");
        second.setStyle("-fx-background-color: rgba(52, 63, 125, 0.4);");
        batMenu.setSpacing(120);
        back = new StackPane();
        back.getChildren().add(aren);
        back.getChildren().add(batMenu);


        return back;
    }
    public VBox loginHere()
    {
        //Scene loginArea = new Scene(sMenu, 1000, 700);
        File holder;
        VBox canvas1 = new VBox(20);
        Button openFile = new Button("Click to Upload Profile Picture");
        ImageView icon = new ImageView();
        Button nextB = new Button("Continue to the Fray");
        HBox forEach1, forEach2, forEach3;
        TextField user;
        forEach1 = new HBox(20);
        forEach2 = new HBox(20);
        forEach3 = new HBox(20);
        forEach2.getChildren().addAll(icon, openFile);
        user = new TextField();
        Label name  = new Label("Username: ");
        Label logging = new Label("USER LOGIN");
        logging.setStyle("-fx-font: 36 arial;");
        nextB.setOnAction(e -> window.setScene(batField));
        //openFile.setOnAction(e -> getIcon());
        openFile.setOnAction(e -> getIcon());
        //holder = getIcon();
        forEach1.getChildren().addAll(name, user);
        forEach1.setPadding(new Insets(50, 0, 0, 0));
        canvas1.setPadding(new Insets(100, 0, 0, 10));
        canvas1.getChildren().addAll(logging, forEach1, openFile, nextB);
        return canvas1;
    }

    public File getIcon()
    {
        //profPic = new ImageView();
        FileChooser fc = new FileChooser();
        fc.setTitle("Open User Icon");
        File image = fc.showOpenDialog(window);
        return image;
    }

    public VBox winningC()
    {
        VBox holder = new VBox(100);
        Label win = new Label ("THE WINNER");
        win.setStyle("-fx-font-size: 34 arial");
        ImageView winIx = new ImageView();
        Label winnah = new Label("Name of Winner");
        holder.getChildren().addAll(win, winIx, winnah);
        holder.setPadding(new Insets(50, 0,0,100));
        holder.setStyle("");
        return holder;
    }
}

