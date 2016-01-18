package ETS2;
//import geb.Browser;
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
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;
//---
//import ETS2.ScanTest1;
//import pageobjects.afspraak.AfspraakOverlaysPage
/*import pageobjects.afspraak.AfspraakPage
import pageobjects.algemeen.KCCPage
import pageobjects.algemeen.LoginPage
import spock.lang.Stepwise*/

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
        grid1.setHgap(5);
        grid1.setVgap(5);
        grid1.setPadding(new Insets(1, 25, 25, 25));


//---------------------------------
        Button button01OpenSession = new Button("Open session URL");//button01OpenSession
        Button button02CloseSession = new Button("Close session");
        Button button03Information = new Button("Information");
        Button button04MouseOver = new Button("MouseOver");
        Button button05InfoAttribute = new Button("Attribute info");
        Button button06MouseClick = new Button("MouseClick");
        Button button07InfoGebSpockForms = new Button("InfoGebSpockForms");
        Button button08SaveToSql = new Button("SaveToSql");
        Button button09Report = new Button("Report");
        final Button button10ClickSandbox = new Button("ClickSandbox");
//-------------------------------
        final CheckBox checkbox1 = new CheckBox("PNG");//.setselected?
        checkbox1.setSelected(true);
        final CheckBox checkbox2 = new CheckBox("HTML");//.setselected?
        checkbox2.setSelected(true);
//-------------------------------
        HBox hBox1 = new HBox(40);
        hBox1.setSpacing(3);
        HBox hBox2 = new HBox(40);
        HBox hBox3 = new HBox(40);
        //HBox hBox4 = new HBox(40);
        VBox vBox1 = new VBox(40);
        vBox1.setSpacing(3);
        VBox vBox2 = new VBox(40);//New!!
//-------------------------------
        /*alles is standaard topleft //hBox1.setAlignment(Pos.TOP_LEFT);
        hBox2.setAlignment(Pos.TOP_LEFT);
        hBox3.setAlignment(Pos.TOP_LEFT);
        //hBox4.setAlignment(Pos.TOP_LEFT);
        vBox1.setAlignment(Pos.TOP_LEFT);
        vBox2.setAlignment(Pos.TOP_RIGHT);
*/
//--------------------------------

//--------------------------------
        Separator sepHor1 = new Separator();
        Separator sepHor2 = new Separator();
        Separator sepVer = new Separator();//Vertical separator
        sepHor1.setMinWidth(300);
        sepHor1.setLayoutX(100);
        sepVer.setOrientation(Orientation.VERTICAL);//Vertical separator
//--------------------------------
        final Text statusText = new Text();
        final Text scenetitle1 = new Text("Welcome Citizen47281");
        final Text scenetitle2 = new Text("Last results:");
        final TextField urlInputField = new TextField("http://www.ad.nl/");
        //final TextField inputField1 = new TextField("header");
        final TextField inputField1 = new TextField("li.crossbrowser");

        final TextField inputField2 = new TextField("displayed");//innerHTML was mooi.  getProperties niet goed.
        urlInputField.setAlignment(Pos.TOP_LEFT);
        scenetitle1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        scenetitle2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 13));
        scenetitle2.setText(""+scenetitle2.getWrappingWidth());
        scenetitle2.setWrappingWidth(500);
        //scenetitle2.scroll in grid ipv text?
//--------------------------------
        hBox1.getChildren().addAll(urlInputField,button01OpenSession,button02CloseSession);
        hBox2.getChildren().addAll(inputField1,inputField2);
        vBox1.getChildren().addAll(button03Information,button04MouseOver,button05InfoAttribute,button06MouseClick,button07InfoGebSpockForms,button08SaveToSql);
        hBox3.getChildren().addAll(checkbox1,checkbox2,button09Report);
        vBox2.getChildren().add(scenetitle2);

        vBox2.setStyle("-fx-border-color: red;");
        vBox2.setMaxWidth(500);
        vBox2.setMinWidth(500);
        vBox2.setFillWidth(true);

//--------------------------------
        Arrays.fill(outputs, "---");
        for(int i=0;i<5;i++){
            scenetitle2.setText(scenetitle2.getText().concat(outputs[i]).concat("\n"));
        }
//--------------------------------
        //final SeleniumDaoETS2 seleniumInstance1 = new SeleniumDaoETS2(urlInputField.getText());
        //final BrowserDaoETS2 browserInstance1 = new BrowserDaoETS2(urlInputField.getText());
        final GroovyBrowserDaoETS2 groovybrowser = new GroovyBrowserDaoETS2(urlInputField.getText());
//--------------------------------

        /**
        * Start Auto browser
        */
                try {
                    groovybrowser.startSeleniumConnection(urlInputField.getText());
           // seleniumInstance1.startSeleniumConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        /**
         * End Auto browser
         */


        inputField1.setOnAction(new EventHandler<ActionEvent>() {
                                    public void handle(ActionEvent e) {
                                        try {
                                            System.out.println("Go clicked");
                                            button10ClickSandbox.fire();
                                        } catch (Exception e1) {
                                            e1.printStackTrace();
                                        }
                                    }
                                }
        );

        inputField2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    System.out.println("Go clicked");
                    button10ClickSandbox.fire();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

            }
        });

        button01OpenSession.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                //statusText.setFill(Color.BLUE);
                //statusText.setText("Processing... " + counter ++);
                try {
                    System.out.println("button01OpenSession clicked");
                    //seleniumInstance1.startSeleniumConnection();//groovy test
                    //                    browserInstance1.startSeleniumConnection();//groovy test
                    //browserInstance1.startSeleniumConnection(urlInputField.getText());
                    groovybrowser.startSeleniumConnection(urlInputField.getText());
                    //BrowserDaoETS2.startSeleniumConnection();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        button02CloseSession.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    System.out.println("button02CloseSession clicked");
                    FunctionsDaoETS2 funcs = new FunctionsDaoETS2();
                    System.out.println(funcs.getDateString());
                    //BrowserDaoETS2.stopSeleniumConnection();
                    //browserInstance1.stopSeleniumConnection();
                    groovybrowser.stopSeleniumConnection();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });


        button03Information.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    System.out.println("button03Information clicked");
                    //System.out.println(groovybrowser.getSelectorText(inputField1.getText()));
                    System.out.println(groovybrowser.getSelectorText(inputField1.getText(),inputField2.getText()));
                    scenetitle2.setText((groovybrowser.getSelectorText(inputField1.getText(),inputField2.getText())));
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        button04MouseOver.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    System.out.println("button04MouseOver clicked");
                    //seleniumInstance1.mouseOver(inputField1.getText());
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
//button05InfoAttribute
        button05InfoAttribute.setOnAction(new EventHandler<ActionEvent>() {
                                           public void handle(ActionEvent e) {
                                               try {
                                                   System.out.println("button05InfoAttribute clicked");
                                                   //String temp = groovybrowser.getThis(inputField1.getText(),"getProperties()");
                                                   //System.out.println("temp = " + temp);
                                                   scenetitle2.setText(groovybrowser.getThis(inputField1.getText(),"getProperties()"));
                                               } catch (Exception e1) {
                                                   e1.printStackTrace();
                                               }
                                           }
                                       }
        );


        button06MouseClick.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    System.out.println("button06MouseClick clicked");
                    groovybrowser.mouseClick(inputField1.getText());
                    //seleniumInstance1.mouseClick(inputField1.getText());
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        }
        );


        button09Report.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    System.out.println("button09Report clicked");
                    scenetitle1.setText(groovybrowser.makeReport(checkbox1.isSelected(),checkbox2.isSelected()));
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        button10ClickSandbox.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {

                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

/**
 * Setting content of grids
 *
 */
        grid1.add(hBox1, 0, 0);
        grid1.add(hBox2, 0, 1);
        grid1.add(hBox3, 0, 3);
        grid1.add(scenetitle1,0,4);
        //grid1.add(hBox4, 0, 4);
        grid1.add(vBox1, 0, 2);
        grid1.add(vBox2, 1, 0,1,30);
        //grid1.add(sepHor1,0,1);
        //GridPane grid2 = new GridPane();
        //Label userName = new Label("FROM valuta:");
        primaryStage.setScene(new Scene(grid1, 900, 700));
        //todo add stuff to scene ofzo  https://community.oracle.com/thread/2587213?start=0&tstart=0
        primaryStage.getScene().fillProperty();
        primaryStage.alwaysOnTopProperty();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
