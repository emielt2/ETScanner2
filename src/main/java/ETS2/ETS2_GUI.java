package ETS2;
import geb.report.ReportState;
import geb.report.ScreenshotReporter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.util.Arrays;
//---
//import ETS2.ScanTest1;
//import pageobjects.afspraak.AfspraakOverlaysPage
/*import pageobjects.afspraak.AfspraakPage
import pageobjects.algemeen.KCCPage
import pageobjects.algemeen.LoginPage
import spock.lang.Stepwise*/
import geb.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

///--
public class ETS2_GUI extends Application {
    static int counter=0;
    static int tryCounter=0;
    static String outputs[]= new String[5];
    @Override
    public void start(Stage primaryStage){
        System.out.println("STARTED");

        primaryStage.setTitle("ETScanner2.0");
        GridPane grid1 = new GridPane();
        grid1.setAlignment(Pos.TOP_LEFT);
        grid1.setHgap(10);
        grid1.setVgap(10);
        grid1.setPadding(new Insets(25, 25, 25, 25));
//--buttonGo
        Button buttonGo = new Button("Open session URL");//buttonGo
        HBox hbButtonGo = new HBox(40);//buttonGo
        hbButtonGo.setAlignment(Pos.TOP_RIGHT);//buttonGo
        hbButtonGo.getChildren().add(buttonGo);//buttonGo
        grid1.add(hbButtonGo, 1, 0);//buttonGo
///---
        //---
        Button buttonCloseSession = new Button("Close session--REPORT--------");
        HBox hdButtonCloseSession = new HBox(40);
        hdButtonCloseSession.setAlignment(Pos.TOP_RIGHT);
        hdButtonCloseSession.getChildren().add(buttonCloseSession);
        grid1.add(hdButtonCloseSession, 2, 0);
        ///---
        //---

        final Button buttonClicking = new Button("---CLICKCLICK---");
        HBox hbButtonClicking = new HBox(40);
        hbButtonClicking.setAlignment(Pos.TOP_LEFT);


        //--checkbox
        final CheckBox cb1 = new CheckBox("CheckBox cb1");
        cb1.setSelected(true);
        //grid1.add(cb1,3,0);

        //grid1.add(cb1);


        grid1.add(hbButtonClicking, 1, 3);
///-----
        ///---
        //---

        Button buttonMouseOver = new Button("MouseOver");
        HBox hbButtonMouseOver = new HBox(40);
        hbButtonMouseOver.setAlignment(Pos.TOP_LEFT);
        hbButtonMouseOver.getChildren().add(buttonMouseOver);
       // grid1.add(hbButtonMouseOver, 1, 7);

        ///---

        //---

        Button buttonMouseClick = new Button("MouseClick");
        HBox hbButtonMouseClick = new HBox(40);
        hbButtonMouseClick.setAlignment(Pos.TOP_LEFT);
        hbButtonMouseClick.getChildren().add(buttonMouseClick);
        //grid1.add(hbButtonMouseClick, 1, 8);
        hbButtonClicking.getChildren().addAll(buttonClicking,buttonMouseOver,buttonMouseClick);
        ///---


        Separator sepHor1 = new Separator();
        sepHor1.setMinWidth(300);
        sepHor1.setLayoutX(100);
        grid1.add(sepHor1,0,4);
        Separator sepHor2 = new Separator();
        Separator sepVer = new Separator();//Vertical separator
        sepVer.setOrientation(Orientation.VERTICAL);//Vertical separator
        final Text statusText = new Text();
        //grid1.add(statusText, 1, 6);
        Text scenetitle = new Text("Welcome Citizen47281");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        //grid1.add(scenetitle, 0, 1/*, 1, 1*/);

        final Text scenetitle2 = new Text("Last results:");
        Arrays.fill(outputs, "---");
        scenetitle2.setText("");
        for(int i=0;i<5;i++){
            scenetitle2.setText(scenetitle2.getText().concat(outputs[i]).concat("\n"));
        }
        scenetitle2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 13));
        grid1.add(scenetitle2, 0, 5, 2, 1);

        //final TextField urlInputField = new TextField("http://orteil.dashnet.org/cookieclicker/");
        final TextField urlInputField = new TextField("http://genius.com/forums");
        urlInputField.setAlignment(Pos.TOP_LEFT);

        final TextField inputField1 = new TextField("header");
        final TextField inputField2 = new TextField("innerHTML");
        final SeleniumDaoETS2 browser1 = new SeleniumDaoETS2(urlInputField.getText());

        /**
         * Start Auto browser
         */
        try {
           // browser1.startSeleniumConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
/**
 * End Auto browser
 */

        buttonGo.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                statusText.setFill(Color.BLUE);
                statusText.setText("Processing... " + counter ++);
                try {
                    System.out.println("Go clicked");
                    browser1.startSeleniumConnection();//groovy test


                } catch (Exception e1) {
                    e1.printStackTrace();
                }

            }
        });

        buttonCloseSession.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent e) {

                try {
                    System.out.println("Show clicked");

                    FunctionsDaoETS2 funcs = new FunctionsDaoETS2();
                    System.out.println(funcs.getDateString());

                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        buttonClicking.setOnAction(new EventHandler<ActionEvent>() {


            //    #cart-icon
            //      span#cart-count
            public void handle(ActionEvent e) {

                try {
                    System.out.println("--------------------------clicked");

                } catch (Exception e1) {

                    e1.printStackTrace();
                }
            }
        });
        //inputField2.setOnAction(););
        inputField1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    System.out.println("Go clicked");
                    buttonClicking.fire();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

            }
        });
        inputField2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    System.out.println("Go clicked");
                    buttonClicking.fire();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

            }
        });

//TODO maak scanbutton
        buttonMouseOver.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent e) {

                try {
                    System.out.println("buttonMouseOver clicked");
                    browser1.mouseOver(inputField1.getText());
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        buttonMouseClick.setOnAction(new EventHandler<ActionEvent>() {
//todo betere clicker maken
            public void handle(ActionEvent e) {

                try {
                    System.out.println("Mouseclick clicked");
                    browser1.mouseClick(inputField1.getText());
                 //   browser1.buyNextItem();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });



//--SETTING CONTENT OF GRIDS
       GridPane grid2 = new GridPane();
        Label userName = new Label("FROM valuta:");
        //grid1.add(userName, 0, 3);
        grid1.add(urlInputField, 0, 0);
        //String input1=urlInputField.getText();
        grid1.add(inputField1, 0, 1);
        grid1.add(inputField2, 1, 1);

//        grid1.add(table,2,0,1,70);

        primaryStage.setScene(new Scene(grid1, 900, 500));
        //todo add stuff to scene ofzo  https://community.oracle.com/thread/2587213?start=0&tstart=0
        primaryStage.getScene().fillProperty();
        primaryStage.alwaysOnTopProperty();
        primaryStage.show();
    }
///------

    public static void main(String[] args) {
        launch(args);
    }
}