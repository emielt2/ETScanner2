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
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.openqa.selenium.WebDriver;

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
    Stage primStage;
    Scene sceneManualDrive;
    Scene sceneShellBrowser;
    String choiceShellOrManual ="Shell";//or "Manual"
    WebDriver storedWebDriver;
    @Override
    public void start(Stage primaryStage){
        primStage = primaryStage;
        System.out.println("STARTED");

        //primaryStage.setTitle("ETScanner2.0");
        primStage.setTitle("ETScanner2.0");
        GridPane grid1 = new GridPane();
        grid1.setAlignment(Pos.TOP_LEFT);
        grid1.setHgap(5);
        grid1.setVgap(5);
        grid1.setPadding(new Insets(1, 25, 25, 25));
//--experiment new scenes
        final Scene sceneManualDrive = new Scene(grid1, 1000, 950);
        GridPane grid2 = new GridPane();
        /*Scene*/ sceneShellBrowser = new Scene(grid2, 1000, 800);
//---------------------------------


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
        final Button button99ClickSandbox = new Button("ClickSandbox");
        Button button11SpockGet = new Button("SpockGet");
        Button button12GebGet = new Button("GebGet");
        Button button13MakeCopyableItem = new Button("Make item");
        final Button button14GroovyShellRun = new Button("Run scripts groovyshell");
        final Button button15ProcessBuilderRun = new Button("Run scripts ProcessBuilder");
//-------------------------------
        final CheckBox checkbox1 = new CheckBox("PNG");//.setselected?
        checkbox1.setSelected(true);
        final CheckBox checkbox2 = new CheckBox("HTML");//.setselected?
        checkbox2.setSelected(true);
        //final RadioButton togglebutton01Shell= new RadioButton("ManualDrive or ShellBrowser?");

        final RadioButton togglebutton01Shell= new RadioButton("ShellBrowser");
        final RadioButton togglebutton02Manual= new RadioButton("ManualDrive");
        togglebutton01Shell.setTextFill(new Color(0,0,1,1.0));
        togglebutton02Manual.setTextFill(new Color(0,0,0,1.0));
        ToggleGroup toggleGroup1 = new ToggleGroup();
        togglebutton01Shell.setToggleGroup(toggleGroup1);
        togglebutton01Shell.setSelected(true);
        togglebutton02Manual.setToggleGroup(toggleGroup1);
        togglebutton01Shell.setFont(new Font(15));
//        toggleGroup1.
//        toggleGroup1

//-------------------------------
        final HBox hBox1 = new HBox(40);//for Connectionactions

        HBox hBox2 = new HBox(40);//voor input1
        HBox hBox3 = new HBox(40);//voor gebspock
        HBox hBox4 = new HBox(40);//voor reports
        final VBox vBox5 = new VBox(40);//voor groovyshell
        HBox hBox6 = new HBox(40);//voor reports

        //HBox hBox4 = new HBox(40);
        hBox1.setSpacing(3);
        vBox5.setSpacing(3);
        VBox vBox1 = new VBox(40);//voor knoppen Driver
        vBox1.setSpacing(5);
        VBox vBox2 = new VBox(40);//voor outText2
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
        /*BackgroundFill bgf1 = new BackgroundFill(Paint.valueOf("123"), CornerRadii.EMPTY, Insets.EMPTY);
        sepHor1.setBackground(new Background(bgf1));
        sepHor2.setBackground(new Background(bgf1));
        sepHor3.setBackground(new Background(bgf1));
        sepHor4.setBackground(new Background(bgf1));
        sepHor5.setBackground(new Background(bgf1));*/
//--------------------------------
        final Text statusText = new Text();
        final Text outText1 = new Text("Welcome Citizen47281");
        //final Text outText2 = new Text("Last results:");
        final TextArea outText2 = new TextArea("Last results:");
        final Text textMakeChoice = new Text("MaualDrive or ShellBrowser?");
        final Text textDrivFindElAtt = new Text("Driver FindElement/Attributes:");
        //final TextField urlInputField = new TextField("http://www.google.nl");//switch
        final TextField urlInputField = new TextField("http://gebish.org/");//switch
        final TextField inputField01css1 = new TextField("li.crossbrowser");
        final TextField inputField02css2 = new TextField("innerHTML");//innerHTML was mooi.  getProperties niet goed. //displayed werkt als $(x).getproperty
        final TextField inputField03AgebElement = new TextField("div");
        final TextField inputField03gebBy = new TextField("name");
        final TextField inputField04gebString = new TextField("btnI");//li.crossbrowser
        final TextField inputField05gebAction = new TextField("getProperties()");
        final TextField inputField06gebContentName = new TextField("ChooseVariableName!");
        final TextField inputField07GroovyFile = new TextField("F:/Users/E/ETScanner2/src/main/java/ETS2/ScanStepsTester4A.groovy");

        final TextField outputField1ActionText = new TextField("click button to get new result");
        final TextField outputField1ContentItem = new TextField("click button to get new result");

        urlInputField.setAlignment(Pos.TOP_LEFT);
        outText1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        //outText2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 13));
       // outText2.setWrappingWidth(500);
        outText2.setMinHeight(790);
        outText2.setMaxHeight(790);
        outText2.setWrapText(true);
        inputField07GroovyFile.setMinWidth(400);
//--------------------------------
        hBox1.getChildren().addAll(urlInputField,button01OpenSession,button02CloseSession);
        hBox2.getChildren().addAll(inputField01css1,inputField02css2);
        vBox1.getChildren().addAll(button03Information,button04MouseOver,button05InfoAttribute,button06MouseClick,button07InfoGebSpockForms,button08SaveToSql);
        hBox3.getChildren().addAll(inputField03gebBy,inputField04gebString,inputField05gebAction);
        hBox4.getChildren().addAll(checkbox1,checkbox2,button09Report);

        vBox5.getChildren().addAll(inputField07GroovyFile,button14GroovyShellRun,button15ProcessBuilderRun);
        //hBox6.getChildren().addAll();
        vBox2.getChildren().add(outText2);
        vBox3.getChildren().addAll(button11SpockGet,button12GebGet,inputField06gebContentName,button13MakeCopyableItem,outputField1ActionText,outputField1ContentItem);
        //vBox2.setStyle("-fx-border-color: black;");
        hBox2.setStyle("-fx-border-color: black;");
        vBox1.setStyle("-fx-border-color: black;");
        vBox2.setMaxWidth(800);
        vBox2.setMinWidth(500);
        vBox2.setMaxHeight(800);
        vBox2.setMinHeight(800);

        vBox2.setFillWidth(true);
        hBox1.setDisable(true);//begins disabled due to radiobuttons, starting ShellBrower

//--------------------------------
        Arrays.fill(outputs, "---");
        for(int i=0;i<5;i++){
            outText2.setText(outText2.getText().concat(outputs[i]).concat("\n"));
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
                    //groovybrowser.startSeleniumConnection(urlInputField.getText());
           // seleniumInstance1.startSeleniumConnection();
                    //outText2.setText(groovybrowser.RunGroovyShell("F:/Users/E/ETScanner2/src/main/java/ETS2/ScanStepsTester3A.groovy"));
                  //  outText2.setText(groovybrowser.RunGroovyShell("F:/Users/E/ETScanner2/src/main/java/ETS2/ScanStepsTester3B.groovy"));
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
                                            button99ClickSandbox.fire();
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
                    button99ClickSandbox.fire();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

            }
        });


        togglebutton01Shell.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    System.out.println("R1 clicked");
                    //button99ClickSandbox.fire();
                    choiceShellOrManual = "Shell";
                    togglebutton02Manual.setTextFill(new Color(0,0,0,1.0));
                    togglebutton01Shell.setTextFill(new Color(0,0,1,1.0));
                    togglebutton02Manual.setFont(new Font(12));
                    togglebutton01Shell.setFont(new Font(16));
                    hBox1.setDisable(true);
                    vBox5.setDisable(false);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

            }
        });

        togglebutton02Manual.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    System.out.println("R1 clicked");
                    //button99ClickSandbox.fire();
                    choiceShellOrManual = "Manual";
                    togglebutton02Manual.setTextFill(new Color(0,0,1,1.0));
                    togglebutton01Shell.setTextFill(new Color(0,0,0,1.0));
                    togglebutton02Manual.setFont(new Font(16));
                    togglebutton01Shell.setFont(new Font(12));
                    hBox1.setDisable(false);
                    vBox5.setDisable(true);
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
                    System.out.println("choiceShellOrManual=" + choiceShellOrManual);
                    char choiceShellOrManualCHAR='S';
                    if(choiceShellOrManual.equals("Shell"))choiceShellOrManualCHAR='S';
                    if(choiceShellOrManual.equals("Manual"))choiceShellOrManualCHAR='M';


                    switch(choiceShellOrManualCHAR){
                        case 'S':outText2.setText("ShellBrowser");
                            System.out.println("case shell");
                                            break;
                        case 'M': outText2.setText((groovybrowser.getSelectorText(inputField01css1.getText(),inputField02css2.getText())));
                            System.out.println("case manual");
                                            break;


                    }
                 /*todo if selectbox==x then:*/ //  outText2.setText((groovybrowser.getSelectorText(inputField01css1.getText(),inputField02css2.getText())));
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        button04MouseOver.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    System.out.println("button04MouseOver clicked");
                    groovybrowser.mouseOver(inputField01css1.getText(),choiceShellOrManual);
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
                                                   outText2.setText(groovybrowser.getThis(inputField01css1.getText(),"getProperties()"));
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
                    groovybrowser.mouseClick(inputField01css1.getText(),choiceShellOrManual);

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
                    outText1.setText(groovybrowser.makeReport(checkbox1.isSelected(),checkbox2.isSelected()));
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });


        button11SpockGet.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    //outputField1ActionText.setText(groovybrowser.doGebSpockAction(inputField03gebBy.getText(),inputField04gebString.getText(),inputField05gebAction.getText()));//werkt prima
                    String[] result = groovybrowser.doGebSpockActionOnShell(inputField03AgebElement.getText(),inputField03gebBy.getText(),inputField04gebString.getText(),inputField05gebAction.getText(),inputField06gebContentName.getText(),choiceShellOrManual);
                    //outputField1ActionText.setText(groovybrowser.doGebSpockActionOnShell(inputField03gebBy.getText(),inputField04gebString.getText(),inputField05gebAction.getText()));
                    //outputField1ActionText.setText(groovybrowser.doGebSpockActionOnShell(inputField03gebBy.getText(),inputField04gebString.getText(),inputField05gebAction.getText()));//werkte voor string
                    outputField1ActionText.setText(result[0]);
                    outputField1ContentItem.setText(inputField06gebContentName.getText() + " " + result[1]);
                    /**
                     *  result[0] is
                     *  result[1] is
                     *  result[2] is
                     *  result[3] is
                     */


                    outText2.setText(result[2]);
                    //outText2.setText(GroovyBrowserDaoETS2.shellReturnString01);
                    //outText2.setText(ShellRet);
                } catch (Exception e1) {

                    e1.printStackTrace();
                }
            }
        });

        button14GroovyShellRun.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
//                    System.out.println(groovybrowser.RunGroovyShell(inputField07GroovyFile.getText()));
                    outText2.setText(groovybrowser.RunGroovyShell(inputField07GroovyFile.getText()));
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        button15ProcessBuilderRun.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    outText2.setText(groovybrowser.RunProcessBuilder(inputField07GroovyFile.getText()));
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });


        button99ClickSandbox.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    System.out.println("Sandbox clicked");

                    //groovybrowser.SandBox(inputField01css1.getText());
                    outText2.setText(groovybrowser.SandBox("F:\\Users\\E\\ETScanner2\\src\\main\\java\\ETS2\\SimpleSixTester.groovy"));


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
        grid1.add(textMakeChoice, 0, grid1leftcounter++);
        grid1.add(togglebutton01Shell, 0, grid1leftcounter++);
        grid1.add(togglebutton02Manual, 0, grid1leftcounter++);


        //grid1.add(toggleGroup1, 0, grid1leftcounter++);
        grid1.add(sepHor2,0,grid1leftcounter++);

        grid1.add(vBox5, 0, grid1leftcounter++);//groovyshell
        grid1.add(hBox1, 0, grid1leftcounter++);//url conn


        grid1.add(sepHor1,0,grid1leftcounter++);
        grid1.add(textDrivFindElAtt, 0, grid1leftcounter++);
        grid1.add(hBox2, 0, grid1leftcounter++);
        grid1.add(vBox1, 0, grid1leftcounter++);

        grid1.add(sepHor3,0,grid1leftcounter++);
        grid1.add(inputField03AgebElement,0,grid1leftcounter++);
        grid1.add(hBox3,0,grid1leftcounter++);
        grid1.add(vBox3,0,grid1leftcounter++);

        grid1.add(sepHor4,0,grid1leftcounter++);
        grid1.add(hBox4, 0, grid1leftcounter++);

//        grid1.add(vBox5, 0, grid1leftcounter++);
        grid1.add(sepHor5,0,grid1leftcounter++);
        grid1.add(button99ClickSandbox,0,grid1leftcounter++);
        grid1.add(outText1,0,grid1leftcounter++);

        //grid1.add(hBox4, 0, grid1leftcounter++);

        grid1.add(vBox2, 1, 0,1,30);
        //grid2.add(vBox2, 1, 0,1,30);//verdwijnt hierdoor bij grid1, mag maar 1 node hebben
        //grid2.add(button99ClickSandbox,0,grid1leftcounter++);

        //GridPane grid2 = new GridPane();
        //Label userName = new Label("FROM valuta:");

        //DIT WERKTE PRIMA primaryStage.setScene(new Scene(grid1, 1000, 800));
        //todo add stuff to scene ofzo  https://community.oracle.com/thread/2587213?start=0&tstart=0
/*        primaryStage.setScene(sceneManualDrive);
        primaryStage.getScene().fillProperty();
        primaryStage.alwaysOnTopProperty();
        primaryStage.show();
*/
        primStage.setScene(sceneManualDrive);
        primStage.getScene().fillProperty();
        //primStage.alwaysOnTopProperty();
        primStage.show();

        //togglebutton01Shell.fire();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
