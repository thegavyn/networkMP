import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

/**
 * Created by Mark Gavin on 3/14/2017.
 */
public class Server extends Application {
    Scene batField, login, winFrame;
    VBox lMenu, winX;
    HBox batMenu;
    StackPane back;
    Stage window;

    public static void main(String [] args)
    {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;
        primaryStage.setTitle("THE GREATEST ROCK PAPER SCISSORS SERVER");
        back = totheFray();
        batField = new Scene(back, 1000, 700);
        lMenu = configuringL();
        login = new Scene(lMenu, 300, 350);
        winX = crowningV();
        winFrame = new Scene(winX, 500, 500);
        window.setScene(login);
        window.show();
    }

    public StackPane totheFray ()
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
        bp1.setOnAction(e -> window.setScene(winFrame));
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

    public VBox configuringL()
    {
        VBox form = new VBox(20);
        Label L1 = new Label("Player 1: ");
        Label L2 = new Label("Player 2:");
        Label L3 = new Label("Player 3: ");
        Label L4 = new Label("Player 4: ");
        TextField tf1 = new TextField("IP Address Here");
        TextField tf2 = new TextField("IP Address Here");
        TextField tf3 = new TextField("IP Address Here");
        TextField tf4 = new TextField("IP Address Here");
        HBox com1 = new HBox(10);
        HBox com2 = new HBox(10);
        HBox com3 = new HBox(10);
        HBox com4 = new HBox(10);
        Button cont = new Button("Proceed to Login ");
        cont.setOnAction(e -> window.setScene(batField));
        com1.getChildren().addAll(L1, tf1);
        com2.getChildren().addAll(L2, tf2);
        com3.getChildren().addAll(L3, tf3);
        com4.getChildren().addAll(L4, tf4);
        form.getChildren().addAll(com1, com2, com3, com4, cont);
        form.setPadding(new Insets(70, 0, 0, 50));
        return form;
    }

    public VBox crowningV()
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
