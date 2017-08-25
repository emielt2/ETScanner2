package ETS2;
//import geb.Browser;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.Arrays;
//---
//import ETS2.ScanTest1;
//import pageobjects.afspraak.AfspraakOverlaysPage
/*import pageobjects.afspraak.AfspraakPage
import pageobjects.algemeen.KCCPage
import pageobjects.algemeen.LoginPage
import spock.lang.Stepwise*/

///--
public class ETS2_GUI_Atos extends Application {
    static int counter = 0;
    static int tryCounter = 0;
    static String outputs[] = new String[5];
    Stage primStage;
    Scene sceneManualDrive;
    Scene sceneShellBrowser;
    //String choiceShellOrManual ="Shell";//or "Manual"
    String choiceShellOrManual = "Manual";//or"Shell"
    WebDriver storedWebDriver;

    @Override
    public void start(Stage primaryStage) {
        primStage = primaryStage;
        System.out.println("STARTED");

        //primaryStage.setTitle("ETScanner2.0");
        primStage.setTitle("ETScanner2.0");
        GridPane grid1 = new GridPane();
        grid1.setAlignment(Pos.TOP_LEFT);
        grid1.setHgap(5);
        grid1.setVgap(5);
        grid1.setMaxHeight(800);
        grid1.setMinHeight(800);
        grid1.setPadding(new Insets(1, 25, 25, 25));
//--experiment new scenes
        final Scene sceneManualDrive = new Scene(grid1, 1000, 950);
        GridPane grid2 = new GridPane();
        /*Scene*/
        sceneShellBrowser = new Scene(grid2, 1000, 800);
//---------------------------------
        int valueWidth = 450;

//---------------------------------
        Button button01OpenSession = new Button("Open session URL");//button01OpenSession
        Button button02CloseSession = new Button("Close session");
        Button button03Information = new Button("Information");
        Button button04MouseOver = new Button("MouseOver");
        Button button05InfoAttribute = new Button("Attribute info");
        Button button06MouseClick = new Button("MouseClick");
        //Button button07InfoGebSpockForms = new Button("InfoGebSpockForms");
        //Button button08SaveToSql = new Button("SaveToSql");
        Button button09Report = new Button("Report");
        //final Button button99ClickSandbox = new Button("ClickSandbox");
        Button button11SpockGet = new Button("TRY!");
        Button button12GebGet = new Button("GebGet");
        //Button button13MakeCopyableItem = new Button("Regenerate");
        //final Button button14GroovyShellRun = new Button("Run scripts groovyshell");
        //final Button button15ProcessBuilderRun = new Button("Run scripts ProcessBuilder");
//-------------------------------
        final CheckBox checkbox1 = new CheckBox("PNG");//.setselected?
        checkbox1.setSelected(true);
        final CheckBox checkbox2 = new CheckBox("HTML");//.setselected?
        checkbox2.setSelected(true);
        //final RadioButton togglebutton01Shell= new RadioButton("ManualDrive or ShellBrowser?");

        //final RadioButton togglebutton01Shell= new RadioButton("ShellBrowser");
        //final RadioButton togglebutton02Manual= new RadioButton("ManualDrive");
        //togglebutton01Shell.setTextFill(new Color(0,0,1,1.0));
//        togglebutton02Manual.setTextFill(new Color(0,0,0,1.0));
//        ToggleGroup toggleGroup1 = new ToggleGroup();
//        togglebutton01Shell.setToggleGroup(toggleGroup1);
//        togglebutton01Shell.setSelected(true);
//        togglebutton02Manual.setToggleGroup(toggleGroup1);
//        togglebutton02Manual.setToggleGroup(toggleGroup1);
//        togglebutton01Shell.setFont(new Font(15));
//        toggleGroup1.
//        toggleGroup1

//-------------------------------
        final HBox hBox1 = new HBox(40);//for Connectionactions
        hBox1.setMaxHeight(25);
        hBox1.setMinHeight(25);
        HBox hBox2 = new HBox(40);//voor input1
        hBox2.setMaxHeight(25);
        hBox2.setMinHeight(25);
        //HBox hBox3 = new HBox(40);//voor gebspock  hBox3becameVBox
        VBox hBox3becameVBox = new VBox(2);//voor gebspock
        hBox3becameVBox.setMinHeight(100);
        hBox3becameVBox.setMaxHeight(100);
        //HBox hBox4 = new HBox(40);//voor reports
        final VBox vBox5 = new VBox(40);//voor groovyshell
        //HBox hBox6 = new HBox(40);//voor reports
final HBox hBox5Try = new HBox(40);
        hBox5Try.setMaxHeight(25);
        hBox5Try.setMinHeight(25);
        //HBox hBox4 = new HBox(40);
        hBox1.setSpacing(3);
        vBox5.setSpacing(3);
        //hBox1.setMaxWidth(400);
        hBox1.setMinWidth(valueWidth);
        VBox vBox1 = new VBox(40);//voor knoppen Driver
        vBox1.setMinHeight(350);
        vBox1.setMaxHeight(350);
        vBox1.setMaxWidth(valueWidth);
        vBox1.setMinWidth(valueWidth);
        vBox1.setSpacing(5);
        VBox vBox2 = new VBox(40);//voor outText2
        VBox vBox3 = new VBox(40);//voor knoppen GebSpock
        vBox3.setSpacing(5);
        vBox3.setMinHeight(160);
        vBox3.setMaxHeight(160);
        vBox3.setMaxWidth(valueWidth);
        vBox3.setMinWidth(valueWidth);

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
        sepHor1.setMinWidth(valueWidth);
        sepHor2.setMinWidth(valueWidth);
        sepHor3.setMinWidth(valueWidth);
        sepHor4.setMinWidth(valueWidth);
        sepHor5.setMinWidth(valueWidth);
        sepHor1.setMaxWidth(valueWidth);
        sepHor2.setMaxWidth(valueWidth);
        sepHor3.setMaxWidth(valueWidth);
        sepHor4.setMaxWidth(valueWidth);
        sepHor5.setMaxWidth(valueWidth);
        sepVer.setOrientation(Orientation.VERTICAL);//Vertical separator
        /*BackgroundFill bgf1 = new BackgroundFill(Paint.valueOf("123"), CornerRadii.EMPTY, Insets.EMPTY);
        sepHor1.setBackground(new Background(bgf1));
        sepHor2.setBackground(new Background(bgf1));
        sepHor3.setBackground(new Background(bgf1));
        sepHor4.setBackground(new Background(bgf1));
        sepHor5.setBackground(new Background(bgf1));*/
        sepHor1.setMinHeight(10);
        sepHor1.setMaxHeight(10);

        sepHor2.setMinHeight(10);
        sepHor2.setMaxHeight(10);
        sepHor3.setMinHeight(10);
        sepHor3.setMaxHeight(10);
        sepHor4.setMinHeight(10);
        sepHor4.setMaxHeight(10);
        sepHor5.setMinHeight(10);
        sepHor5.setMaxHeight(10);
        sepHor1.setStyle("-fx-background-color: grey");
        sepHor2.setStyle("-fx-background-color: grey");
        sepHor3.setStyle("-fx-background-color: grey");
        sepHor4.setStyle("-fx-background-color: grey");
        sepHor5.setStyle("-fx-background-color: grey");

//--------------------------------
        final Text statusText = new Text();
        //final Text outText1 = new Text("Welcome Citizen47281");
        //final Text outText2 = new Text("Last results:");
        final TextArea outText2 = new TextArea("Last results:");
        //final Text textMakeChoice = new Text("ManualDrive or ShellBrowser?");
        final Text textDrivFindElAtt = new Text("CSS tester below:");
        textDrivFindElAtt.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        //final TextField urlInputField = new TextField("http://www.google.nl");//switch
        //final TextField urlInputField = new TextField("https://dmidoffice8.sdmc.ao-srv.com/mp");//switch
        final TextField urlInputField = new TextField("https://maven.apache.org/guides/introduction/introduction-to-the-pom.html");//switch
        final TextField inputField01css1 = new TextField("img[ class=\"logo\"]");
        final TextField inputField02css2 = new TextField("outerHTML");//innerHTML was mooi.  getProperties niet goed. //displayed werkt als $(x).getproperty
        final TextField inputField03AgebElement = new TextField("");
        final TextField inputField03gebBy = new TextField("BySelector");
        final TextField inputField04gebString = new TextField("nummer");//li.crossbrowser
        inputField04gebString.setMaxWidth(450);
        inputField04gebString.setMinWidth(450);
        final TextField inputField05gebAction = new TextField("getProperties()");
        final TextField inputField06gebContentName = new TextField("giveNiceVarNameHere");
        //final TextField inputField07GroovyFile = new TextField("F:/Users/E/ETScanner2/src/main/java/ETS2/ScanStepsTester4A.groovy");
        final TextField inputFieldExtraString = new TextField("");
        inputFieldExtraString.setDisable(true);
        inputFieldExtraString.setMaxWidth(450);
        inputFieldExtraString.setMinWidth(450);
        final TextArea outputField1ContentItem = new TextArea("click button to get new result");
        final TextField outputField1ActionText = new TextField("click button to get new result");
        outputField1ContentItem.setMaxHeight(55);
        outputField1ContentItem.setMinHeight(55);
        urlInputField.setAlignment(Pos.TOP_LEFT);
        urlInputField.setMaxWidth(240);
        urlInputField.setMinWidth(240);
        outText2.setMinHeight(750);
        outText2.setMaxHeight(750);
        outText2.setWrapText(true);
        //inputField07GroovyFile.setMinWidth(400);
        final javafx.scene.control.TextField outputFieldResultTry = new TextField("------");
        outputFieldResultTry.setStyle("-fx-background-color: grey;");
        outputFieldResultTry.setMaxWidth(150);
        outputFieldResultTry.setMinWidth(150);

//--------------------------------

        ObservableList<String> optionsSelectors =
                FXCollections.observableArrayList(
                        "className",
                        "cssSelector",
                        "id",
                        "linkText",
                        "name",
                        "partialLinkText",
                        "tagName",
                        "xpath"
                );
        final ComboBox comboBoxSelectors = new ComboBox(optionsSelectors);
        comboBoxSelectors.setMaxWidth(150);
        comboBoxSelectors.setMinWidth(150);

        comboBoxSelectors.setValue(optionsSelectors.get(2));


        ObservableList<String> optionsActions =
                FXCollections.observableArrayList(
                        "clear()",
                        "click()",
                        //"getAttribute(STRING)",
                        "getAttribute(\"STRING\")",
                        "getCssValue(\"STRING\")",
//                        "getCssValue(\"font-size\")",

                        "getLocation()",
                        "getProperties()",
                        "getSize()",
                        "getTagName()",
                        "getText()",
                        "isDisplayed()",
                        "isEnabled()",
                        "isSelected()",
                        "sendKeys(\"STRING\")",
                        "submit()",
                        "attributes",
                        "attributes()",
                        "get_property('attributes')[0].keys()",
                        "get_property('attributes')[0]",
                        "getProperty(\"STRING\")"
                );
        final ComboBox comboBoxActions = new ComboBox(optionsActions);
        comboBoxActions.setMaxWidth(150);
        comboBoxActions.setMinWidth(150);

        comboBoxActions.setValue(optionsActions.get(5));


//--------------------------------
        hBox1.getChildren().addAll(urlInputField, button01OpenSession, button02CloseSession);
        hBox2.getChildren().addAll(inputField01css1, inputField02css2);
        vBox1.getChildren().addAll(button03Information, button04MouseOver, button05InfoAttribute, button06MouseClick);
        //hBox3.getChildren().addAll(comboBoxSelectors,inputField04gebString,/*inputField05gebAction,*/comboBoxActions);
        hBox3becameVBox.getChildren().addAll(comboBoxSelectors, inputField04gebString,/*inputField05gebAction,*/comboBoxActions, inputFieldExtraString);
        //hBox4.getChildren().addAll(checkbox1,checkbox2,button09Report);

        //vBox5.getChildren().addAll(inputField07GroovyFile);
        //hBox6.getChildren().addAll();
        vBox2.getChildren().add(outText2);
        //vBox3.getChildren().addAll(button11SpockGet,button12GebGet,inputField06gebContentName,button13MakeCopyableItem,outputField1ActionText,outputField1ContentItem);
        hBox5Try.getChildren().addAll(button11SpockGet,outputFieldResultTry);
        vBox3.getChildren().addAll(hBox5Try,/*button11SpockGet, outputFieldResultTry,*/ sepHor2, inputField06gebContentName, outputField1ContentItem, outputField1ActionText);
        //vBox2.setStyle("-fx-border-color: black;");
        //hBox2.setStyle("-fx-border-color: black;");
        //vBox1.setStyle("-fx-border-color: black;");
        vBox2.setMaxWidth(800);
        vBox2.setMinWidth(500);
        vBox2.setMaxHeight(800);
        vBox2.setMinHeight(800);

        vBox2.setFillWidth(true);
        //hBox1.setDisable(true);//begins disabled due to radiobuttons, starting ShellBrower

//--------------------------------
        Arrays.fill(outputs, "---");
        for (int i = 0; i < 5; i++) {
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

        inputField04gebString.setOnKeyPressed((event) -> { if(event.getCode() == KeyCode.ENTER) { button11SpockGet.fire(); } });
        inputField01css1.setOnKeyPressed((event) -> { if(event.getCode() == KeyCode.ENTER) { button03Information.fire(); } });

        inputField01css1.setOnAction(new EventHandler<ActionEvent>() {
                                         public void handle(ActionEvent e) {
                                             try {
                                                 System.out.println("Go clicked");
                                                 // button99ClickSandbox.fire();
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
                    // button99ClickSandbox.fire();
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

                    groovybrowser.doGebSpockActionOnShell("", "id", "username", "sendKeys(\"Testbeheerder\")", inputField06gebContentName.getText(), choiceShellOrManual);
                    groovybrowser.doGebSpockActionOnShell("", "id", "password", "sendKeys(\"June@2017\")", inputField06gebContentName.getText(), choiceShellOrManual);
                    groovybrowser.doGebSpockActionOnShell("", "id", "loginBtn", "click()", inputField06gebContentName.getText(), choiceShellOrManual);


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
                    char choiceShellOrManualCHAR = 'S';
                    if (choiceShellOrManual.equals("Shell")) choiceShellOrManualCHAR = 'S';
                    if (choiceShellOrManual.equals("Manual")) choiceShellOrManualCHAR = 'M';


                    switch (choiceShellOrManualCHAR) {
                        case 'S':
                            outText2.setText("ShellBrowser");
                            System.out.println("case shell");
                            break;
                        case 'M':
                            outText2.setText((groovybrowser.getSelectorText(inputField01css1.getText(), inputField02css2.getText())));
                            System.out.println("case manual");
                            break;


                    }
                 /*todo if selectbox==x then:*/ //  outText2.setText((groovybrowser.getSelectorText(inputField01css1.getText(),inputField02css2.getText())));
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        comboBoxActions.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    if (comboBoxActions.getValue().toString().contains("STRING")) {
                        inputFieldExtraString.setDisable(false);
                    } else {
                        inputFieldExtraString.setDisable(true);
                    }

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
                    groovybrowser.mouseOver(inputField01css1.getText(), choiceShellOrManual);
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
                                                      outText2.setText(groovybrowser.getThis(inputField01css1.getText(), "getProperties()"));
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
                                                   groovybrowser.mouseClick(inputField01css1.getText(), choiceShellOrManual);

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
                    //outText1.setText(groovybrowser.makeReport(checkbox1.isSelected(),checkbox2.isSelected()));
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });


        button11SpockGet.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    outputFieldResultTry.setStyle("-fx-background-color: grey;");
                    outputFieldResultTry.setText("------");

                    //outputField1ActionText.setText(groovybrowser.doGebSpockAction(inputField03gebBy.getText(),inputField04gebString.getText(),inputField05gebAction.getText()));//werkt prima
                    String requestedAction = comboBoxActions.getValue().toString();
                    if (comboBoxActions.getValue().toString().contains("STRING")) {
                        requestedAction = requestedAction.replace("STRING", inputFieldExtraString.getText());
                    }
                    if (comboBoxSelectors.getValue().toString().contains("cssSelector")|comboBoxSelectors.getValue().toString().contains("xpath")) {
                        inputField04gebString.setText(inputField04gebString.getText().replaceAll("\"", "'"));
                        System.out.println("XX");
                        //requestedAction = requestedAction.replaceAll("\"","'");
                    }
                    System.out.println("CHECK01 = " + requestedAction);
                    //String[] result = groovybrowser.doGebSpockActionOnShell(inputField03AgebElement.getText(),comboBoxSelectors.getValue().toString(),inputField04gebString.getText(),comboBoxActions.getValue().toString(),inputField06gebContentName.getText(),choiceShellOrManual);
                    String[] result = groovybrowser.doGebSpockActionOnShell(inputField03AgebElement.getText(), comboBoxSelectors.getValue().toString(), inputField04gebString.getText(), requestedAction, inputField06gebContentName.getText(), choiceShellOrManual);

                    outputField1ActionText.setText(result[1]);
                    //outputField1ContentItem.setText(inputField06gebContentName.getText() + " " + result[0]);
                    outputField1ContentItem.setText(result[0]);


                    /**
                     *  result[0] is complete text for creating the locator
                     *  result[1] is XXX now part of script
                     *  result[2] is result of the execution, can contain returnvalues of the actions or exceptions
                     *  result[3] is Action Successful, Exception occurred, Failed to locate
                     */


                    switch (result[3]) {
                        case "Action successful":
                            outputFieldResultTry.setStyle("-fx-background-color: green;");
                            outputFieldResultTry.setText("Action successful");
                            System.out.println("SUCCCESS!!!"+result[3]);
                            break;
                        case "Exception occurred":
                            outputFieldResultTry.setStyle("-fx-background-color: red;");
                            outputFieldResultTry.setText("Exception occurred");
                            System.out.println("EXCEPTION!!!"+result[3]);
                            break;
                        case "Failed to locate":
                            outputFieldResultTry.setStyle("-fx-background-color: orange;");
                            outputFieldResultTry.setText("Failed to locate");
                            System.out.println("FAILED!!!"+result[3]);
                            break;
                    }

                    outText2.setText(result[2]);
                    //outText2.setText(GroovyBrowserDaoETS2.shellReturnString01);
                    //outText2.setText(ShellRet);
                } catch (Exception e1) {

                    e1.printStackTrace();
                }
            }
        });


/**
 * Setting content of grids
 *
 */
        int grid1leftcounter = 0;
        //grid1.add(textMakeChoice, 0, grid1leftcounter++);


        //grid1.add(toggleGroup1, 0, grid1leftcounter++);
        //grid1.add(sepHor2,0,grid1leftcounter++);
        //grid1.add(sepHor3,0,grid1leftcounter++);
        grid1.add(vBox5, 0, grid1leftcounter++);//groovyshell
        grid1.add(hBox1, 0, grid1leftcounter++);//url conn


        grid1.add(sepHor1, 0, grid1leftcounter++);


        //grid1.add(inputField03AgebElement,0,grid1leftcounter++);
        //grid1.add(hBox3,0,grid1leftcounter++);TODO THIS WAS/Is hBox3becameVBox
        grid1.add(hBox3becameVBox, 0, grid1leftcounter++);

        grid1.add(vBox3, 0, grid1leftcounter++);

        //grid1.add(sepHor4,0,grid1leftcounter++);
        //grid1.add(hBox4, 0, grid1leftcounter++);

//        grid1.add(vBox5, 0, grid1leftcounter++);

        // grid1.add(button99ClickSandbox,0,grid1leftcounter++);
        //grid1.add(outText1,0,grid1leftcounter++);
        grid1.add(sepHor5, 0, grid1leftcounter++);
        grid1.add(textDrivFindElAtt, 0, grid1leftcounter++);
        //grid1.add(hBox4, 0, grid1leftcounter++);
        grid1.add(hBox2, 0, grid1leftcounter++);
        grid1.add(vBox2, 1, 0, 1, 25);

        grid1.add(vBox1, 0, grid1leftcounter++);

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
        //button01OpenSession.fire();//auto start open url browser

    }


    public static void main(String[] args) {
        launch(args);
    }
}
