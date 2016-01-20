package ETS2;
//import geb.Browser;
import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
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
        Button button11SpockGet = new Button("SpockGet");
        Button button12GebGet = new Button("GebGet");
        Button button13MakeCopyableItem = new Button("Make item");
        Button button14GroovyShellRun = new Button("Make item");
//-------------------------------
        final CheckBox checkbox1 = new CheckBox("PNG");//.setselected?
        checkbox1.setSelected(true);
        final CheckBox checkbox2 = new CheckBox("HTML");//.setselected?
        checkbox2.setSelected(true);
//-------------------------------
        HBox hBox1 = new HBox(40);//for Connectionactions

        HBox hBox2 = new HBox(40);//voor input1
        HBox hBox3 = new HBox(40);//voor gebspock
        HBox hBox4 = new HBox(40);//voor reports
        VBox vBox5 = new VBox(40);//voor groovyshell
        HBox hBox6 = new HBox(40);//voor reports

        //HBox hBox4 = new HBox(40);
        hBox1.setSpacing(3);
        vBox5.setSpacing(3);
        VBox vBox1 = new VBox(40);//voor knoppen Driver
        vBox1.setSpacing(5);
        VBox vBox2 = new VBox(40);//voor scenetitle2
        VBox vBox3 = new VBox(40);//voor knoppen GebSpock
        vBox3.setSpacing(5);
//-------------------------------
        /*alles is standaard topleft //hBox1.setAlignment(Pos.TOP_LEFT);
        hBox2.setAlignment(Pos.TOP_LEFT);
        hBox4.setAlignment(Pos.TOP_LEFT);
        //hBox4.setAlignment(Pos.TOP_LEFT);
        vBox1.setAlignment(Pos.TOP_LEFT);
        vBox2.setAlignment(Pos.TOP_RIGHT);
*/
//--------------------------------

//--------------------------------
        Separator sepHor1 = new Separator();
        Separator sepHor2 = new Separator();
        Separator sepHor3 = new Separator();
        Separator sepHor4 = new Separator();
        Separator sepHor5 = new Separator();
        Separator sepVer = new Separator();//Vertical separator
        sepHor1.setMinWidth(360);
        sepHor2.setMinWidth(360);
        sepHor3.setMinWidth(360);
        sepHor4.setMinWidth(360);
        sepHor5.setMinWidth(360);
        sepVer.setOrientation(Orientation.VERTICAL);//Vertical separator
        BackgroundFill bgf1 = new BackgroundFill(Paint.valueOf("123"), CornerRadii.EMPTY, Insets.EMPTY);
        sepHor1.setBackground(new Background(bgf1));
        sepHor2.setBackground(new Background(bgf1));
        sepHor3.setBackground(new Background(bgf1));
        sepHor4.setBackground(new Background(bgf1));
        sepHor5.setBackground(new Background(bgf1));
//--------------------------------
        final Text statusText = new Text();
        final Text scenetitle1 = new Text("Welcome Citizen47281");
        final Text scenetitle2 = new Text("Last results:");
        final Text textConnection = new Text("Connection:");
        final Text textDrivFindElAtt = new Text("Driver FindElement/Attributes:");
        final TextField urlInputField = new TextField("http://gebish.org/");
        final TextField inputField01css1 = new TextField("crossbrowser");
        final TextField inputField02css2 = new TextField("innerHTML");//innerHTML was mooi.  getProperties niet goed. //displayed werkt als $(x).getproperty
        final TextField inputField03gebId = new TextField("id");
        final TextField inputField04gebString = new TextField("li.crossbrowser");
        final TextField inputField05gebAction = new TextField("click()");
        final TextField inputField06GroovyFile = new TextField("F:\\Users\\E\\ETScanner2\\src\\main\\java\\ETS2\\ScanPageTester.groovy");
        final TextField outputField1CopyItem = new TextField("click button to get new result");

        urlInputField.setAlignment(Pos.TOP_LEFT);
        scenetitle1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        scenetitle2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 13));
        scenetitle2.setText(""+scenetitle2.getWrappingWidth());
        scenetitle2.setWrappingWidth(500);
        inputField06GroovyFile.setMinWidth(400);
        //scenetitle2.scroll in grid ipv text?
//--------------------------------
        hBox1.getChildren().addAll(urlInputField,button01OpenSession,button02CloseSession);
        hBox2.getChildren().addAll(inputField01css1,inputField02css2);
        vBox1.getChildren().addAll(button03Information,button04MouseOver,button05InfoAttribute,button06MouseClick,button07InfoGebSpockForms,button08SaveToSql);
        hBox3.getChildren().addAll(inputField03gebId,inputField04gebString,inputField05gebAction);
        hBox4.getChildren().addAll(checkbox1,checkbox2,button09Report);
        vBox5.getChildren().addAll(inputField06GroovyFile,button14GroovyShellRun);
        //hBox6.getChildren().addAll();
        vBox2.getChildren().add(scenetitle2);
        vBox3.getChildren().addAll(button11SpockGet,button12GebGet,button13MakeCopyableItem,outputField1CopyItem);
        vBox2.setStyle("-fx-border-color: black;");
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
        //final GroovyBrowserDaoETS2 groovybrowser = new GroovyBrowserDaoETS2(urlInputField.getText());
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


        inputField01css1.setOnAction(new EventHandler<ActionEvent>() {
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

        inputField02css2.setOnAction(new EventHandler<ActionEvent>() {
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
                    //System.out.println(groovybrowser.getSelectorText(inputField01css1.getText()));
                    //System.out.println(groovybrowser.getSelectorText(inputField01css1.getText(),inputField02css2.getText()));
                    scenetitle2.setText((groovybrowser.getSelectorText(inputField01css1.getText(),inputField02css2.getText())));
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        button04MouseOver.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    System.out.println("button04MouseOver clicked");
                    //seleniumInstance1.mouseOver(inputField01css1.getText());
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
                                                   //String temp = groovybrowser.getThis(inputField01css1.getText(),"getProperties()");
                                                   //System.out.println("temp = " + temp);
                                                   scenetitle2.setText(groovybrowser.getThis(inputField01css1.getText(),"getProperties()"));
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
                    groovybrowser.mouseClick(inputField01css1.getText());
                    //seleniumInstance1.mouseClick(inputField01css1.getText());
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
                    //System.out.println(groovybrowser.SandBox(inputField01css1.getText()));

                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        button11SpockGet.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    outputField1CopyItem.setText(groovybrowser.doGebSpockAction(inputField03gebId.getText(),inputField04gebString.getText(),inputField05gebAction.getText()));

                } catch (Exception e1) {

                    e1.printStackTrace();
                }
            }
        });

        button14GroovyShellRun.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    System.out.println(groovybrowser.SandBox(inputField01css1.getText()));

                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });


/**
 * Setting content of grids
 *
 */
        int grid1leftcounter=0;
        grid1.add(textConnection, 0, grid1leftcounter++);
        grid1.add(hBox1, 0, grid1leftcounter++);
        grid1.add(sepHor1,0,grid1leftcounter++);
        grid1.add(textDrivFindElAtt, 0, grid1leftcounter++);
        grid1.add(hBox2, 0, grid1leftcounter++);
        grid1.add(vBox1, 0, grid1leftcounter++);
        grid1.add(sepHor2,0,grid1leftcounter++);
        grid1.add(hBox3,0,grid1leftcounter++);
        grid1.add(vBox3,0,grid1leftcounter++);
        grid1.add(sepHor3,0,grid1leftcounter++);
        grid1.add(hBox4, 0, grid1leftcounter++);
        grid1.add(sepHor4,0,grid1leftcounter++);
        grid1.add(vBox5, 0, grid1leftcounter++);
        grid1.add(sepHor5,0,grid1leftcounter++);
        grid1.add(button10ClickSandbox,0,grid1leftcounter++);
        grid1.add(scenetitle1,0,grid1leftcounter++);

        //grid1.add(hBox4, 0, grid1leftcounter++);

        grid1.add(vBox2, 1, 0,1,30);

        //GridPane grid2 = new GridPane();
        //Label userName = new Label("FROM valuta:");
        primaryStage.setScene(new Scene(grid1, 900, 900));
        //todo add stuff to scene ofzo  https://community.oracle.com/thread/2587213?start=0&tstart=0
        primaryStage.getScene().fillProperty();
        primaryStage.alwaysOnTopProperty();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
