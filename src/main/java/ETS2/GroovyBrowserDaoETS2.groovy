package ETS2;
/*WAS import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.fail;
*/

import geb.Browser
import geb.navigator.CssSelector;
import geb.report.PageSourceReporter;
import geb.report.ReportState;
import geb.report.ScreenshotReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.NoSuchElementException


import javax.lang.model.element.Element;
import java.io.File
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

//import org.openga.selenium.

/**
 * Created by E on 17/01/2016.
 */

/**kan misschien weg?*/
public class GroovyBrowserDaoETS2 {
    //static ChromeOptions chromeoptions = new ChromeOptions();
    //WebDriver driver = new ChromeDriver(chromeoptions.addArguments("start-maximized"));
    public GroovyBrowserDaoETS2(String input) {
        baseUrl = input;

        // chromeoptions.addArguments("start-maximized");
        //  chromeoptions.addArguments("user-data-dir=Y:\\Browser_profile");
//        browser1.setBaseUrl(input);
        // idee voor global
        //    browser1.setDriver(driver);

    }


    static String baseUrl; //idee voor global
    public static WebDriver driver;//was driver
    public static String shellReturnString01
    public static String shellReturnString02
    //private static String baseUrl;
    private boolean acceptNextAlert = true;
    private static StringBuffer verificationErrors = new StringBuffer();

    //final static Browser browser1 = new Browser();//(new ChromeDriver());
    //final static Browser browser1 = new Browser();//(new ChromeDriver());
    //static def browser2; = new Browser(driver: new ChromeDriver(), baseUrl: 'http://nu.nl')//(new ChromeDriver());
    //static def browser2;
    static Browser browser2;

    public static void startSeleniumConnection(String inputUrl) throws Exception {
        System.out.println("Check1 " + baseUrl);
        //driver = new FirefoxDriver();
        //System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDownloadFolder\\chromedriver_win32\\chromedriver.exe");//todo setproperty bekijken
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");//todo setproperty bekijken
        ChromeOptions chromeoptions = new ChromeOptions();
        //chromeoptions.addArguments("start-maximized");
        //chromeoptions.addArguments("user-data-dir=/path/to/your/custom/profile");
        chromeoptions.addArguments("user-data-dir=Y:\\Browser_profileManual");
        browser2 = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: inputUrl)//(new ChromeDriver());
        //driver = new ChromeDriver(chromeoptions);
//        driver = new Browser();
        //Browser browserx = new ChromeDriver();
        //browser2.go(inputUrl)
        browser2.go()
        //driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        //Browser browser2 = new Browser(driver:)

        //browser1.setDriver(new ChromeDriver());

        //browser1.setBaseUrl(inputUrl);
        //browser1.go();
//        driver.get(inputUrl);


        System.out.println("Check3");
        //driver.get(baseUrl + "/?gws_rd=ssl");
        //driver.get(baseUrl /*+ inputURL*/);
    }

    public static void stopSeleniumConnection() throws Exception {
        //Thread.sleep(1000);
        //browser1.close();-----
        browser2.close()
        //driver.close();
        //Thread.sleep(500);
//        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public boolean trigIsSelected() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        try {
            if (driver.findElement(By.id("menu")).isDisplayed()) return true;
            if (driver.findElement(By.id("menu")).getText() != "Statistics") return false;
        }
        catch (Exception e) {
            System.out.println("#menu not found");
            // e.printStackTrace();
            return false;
        }
        return true;
    }

    public String getSelectorText(String stringcss1, String stringcss2) {
        try {
            String returnvalue = "startvaluex"
            //return driver.findElement(new By.ByCssSelector(stringcss)).getText();
            //browser2.drive{//etchanged
            browser2.drive {
                try {
                    /* println "01--" + browser2.$("head")
                println "02--" + browser2.$(By.linkText("microsoft")).getClass()
                println "03--" + browser2.$("div").find()
                println "04--" + browser2.navigator.$(By.linkText("microsoft"))
                println "05--" + browser2.navigator.getClass()
                println "06--" + $("head").getProperties()
                println "06b-" + browser2.$("head").getProperties()
                //println "07--" + $("head", name: "q" ).getProperties() geeft Empty Navigator
               // println "08--" + $(id:"srv_shellHeaderMicrosoftLogo").click()
               // println "09--" + $("#srv_shellHeaderMicrosoftLogo").click()

                //$("#srv_shellHeaderMicrosoftLogo").click()
                //browser2.$(id:"srv_shellHeaderMicrosoftLogo").click()
                //CssSelector c1 = new CssSelector("#srv_shellHeaderMicrosoftLogo");

                String x = "#srv_shellHeaderMicrosoftLogo"
                x="[id=srv_shellHeaderMicrosoftLogo]"//WERKT
                x="[.next]"
                x="li.crossbrowser"
                //println "11--" + browser2.$(x).text
                //println "10--" + getBrowser2().getProperties()
                println "11--" + getBrowser2().$(x).getProperties()
                println "12--" + browser2.$(x).getClass()
                //println "13--" + browser2.$(x).getAttribute()
                //println "13--" + browser2.$(x).getProperty("innerHTML")
                println "14--" + browser2.$(x).getProperty("displayed")
                //browser2.$(x).getAt("body")
//                println "15--" + browser2.$(x).getProperty(stringcss2)
                browser2.$(x).getMetaClass()
//                println "16--" + browser2.$(stringcss1).getProperty(stringcss2)
//
//                returnvalue=browser2.$(stringcss1).getProperty(stringcss2)
                //browser2.$(x).click() //PRIMA VOOR KLIK
//                println "16--" + browser2.$(stringcss1).getProperty(stringcss2)
*/
                    // driver.findElement(new By.ByCssSelector(stringcss1)).getAttribute("innerHTML")
                    //browser2.findElement(new By.ByCssSelector(stringcss1)).getAttribute("innerHTML")
                    /**NICE FINDELEMENT: browser2.getDriver().findElement(By.className(stringcss1)).click();*/
//                browser2.getDriver().findElement(By.className(stringcss1)).click();
                    //returnvalue = browser2.getDriver().findElement(By.className(stringcss1)).getAttribute(stringcss2);
                    println "HIER1"
                    returnvalue = browser2.getDriver().findElement(new By.ByCssSelector(stringcss1)).getAttribute(stringcss2);
                    print browser2.getDriver().findElement(new By.ByCssSelector(stringcss1)).getAttribute(stringcss2);
                    //print returnvalue
                    //returnvalue = browser2.getDriver().findElement(By.className(stringcss1)).getAttribute("innerHTML");
                    /**NICE FINDELEMENT innerHTML returnvalue = browser2.getDriver().findElement(By.className(stringcss1)).getAttribute("innerHTML");*/

                    //  browser.getDrive
                    //Browser.getDriver().findElement();

                    //CssSelector cssSelector1 = new CssSelector();
                    //By myby1 = new By("a");

                    //println "09b--" + browser2.$(x).getText()
                    //browser2.$("#srv_shellHeaderMicrosoftLogo").click()
                    //CssSelector
                    //stringcss = "title:"Zoeken in-/uitschakelen""
                    //CssSelector c1 = "title=Zoeken in-/uitschakelen"

                    //browser2.$(title:"Zoeken in-/uitschakelen").click()// DEZE WERKT PRIMA als browser al in static wordt aangemaakt
                    //$(title:"Zoeken in-/uitschakelen").click()
                    //println "10--" + browser2.$(title:"Zoeken in-/uitschakelen").toString()

//                CssSelector c1 = new CssSelector("Zoeken inuitschakelen")
                    //  browser2.$(c1).click()
                    //browser2.$(c1).click()
                    //browser2.$(By.title("Zoeken in-/uitschakelen"))
                    //title="Zoeken in-/uitschakelen"
                    println "HIER2"
                }
                catch (Exception e) {
                    println "HIER3"
                    returnvalue = e.message.toString();
                }
            }
            println "HIER4"
            return returnvalue
            //return browser1.findElement(new By.ByCssSelector(stringcss)).getText();
        }
        catch (NoSuchElementException e) {
            //e.printStackTrace();

            println "Exception not found"
            //return "NOT FOUND";
            return e.message.toString();
        }
    }

    public static String getThis(String stringcss1, String stringcss2) {
        String returnvalue
        browser2.drive {
            try {
                returnvalue = browser2.$(stringcss1).getProperties()
            }
            catch (Exception e) {
                return e.message.toString();
            }
        }
        return returnvalue
    }

    String[] doGebSpockActionOnShell(String elementString, String bystring, String selectorString, String actionstring, String contentNameString, String choiceBrowser) {

        String[] returnvalue = ["Error!", "Error!", "Error!", "Error!"]



        if (choiceBrowser == "Shell") { //driver.findElement(By.cssSelector(cssstring1)).click();
            try {
                println "StartX"
                String scriptBegin;
                String scriptMid;
                String scriptEnd;
                if (elementString == "") {
                    println "ja"
                    scriptBegin = new String("import ETS2.GroovyBrowserDaoETS2;import org.openqa.selenium.By;public class test{public static void main(String...args){GroovyBrowserDaoETS2 gb = new GroovyBrowserDaoETS2();gb.shellReturnString01 = gb.driver.");
                    scriptMid = new String("findElement(By." + bystring + "(\"" + selectorString + "\"))." + actionstring + ".toString();System.out.println(gb.shellReturnString01);");
                    scriptEnd = new String("}}");
                } else {//make:  overlayToevoegenNotitieAnoniem { $("div", id: contains("SUB008_1"))}
                    println "nee"
                    scriptBegin = new String("import ETS2.GroovyBrowserDaoETS2;import org.openqa.selenium.By;public class test{public static void main(String...args){GroovyBrowserDaoETS2 gb = new GroovyBrowserDaoETS2();gb.shellReturnString01 = gb.driver.");
                    scriptMid = new String("findElement(By." + bystring + "(\"" + selectorString + "\"))." + actionstring + ".toString();System.out.println(gb.shellReturnString01);");
                    scriptEnd = new String("}}");
                }
                String scriptTotal = scriptBegin + scriptMid + scriptEnd;
                returnvalue[0] = scriptMid //real scrtiptmid, is real code

                returnvalue[1] = scriptMid //india style
                returnvalue[2] = shellReturnString01 //voor scenetitle2
                returnvalue[3] = "hallo" //voor scenetitle2
                println "shellReturnString01====" + shellReturnString01
                println scriptTotal
                Binding binding = new Binding();
                GroovyShell shell = new GroovyShell(binding);
                Object value = shell.evaluate(scriptTotal);
            }
            catch (Exception e) {
                returnvalue[2] = e.message.toString();
                return returnvalue

            }
        }

        if (choiceBrowser == "Manual") { //driver.findElement(By.cssSelector(cssstring1)).click();
            try {
                println "StartManual"
                String scriptBegin;
                String scriptMid;
                String scriptEnd;
                if (elementString == "") {
                    println "ja"
                    scriptBegin = new String("import ETS2.GroovyBrowserDaoETS2;import org.openqa.selenium.By;public class test{public static void main(String...args){GroovyBrowserDaoETS2 gb = new GroovyBrowserDaoETS2();gb.shellReturnString01 = gb.browser2.getDriver().");
                    scriptMid = new String("findElement(By." + bystring + "(\"" + selectorString + "\"))." + actionstring + ".toString();System.out.println(gb.shellReturnString01);");
                    scriptEnd = new String("}}");
                } else {//make:  overlayToevoegenNotitieAnoniem { $("div", id: contains("SUB008_1"))}
                    println "nee"
                    scriptBegin = new String("import ETS2.GroovyBrowserDaoETS2;import org.openqa.selenium.By;public class test{public static void main(String...args){GroovyBrowserDaoETS2 gb = new GroovyBrowserDaoETS2();gb.shellReturnString01 = gb.browser2.getDriver().");
                    scriptMid = new String("findElement(By." + bystring + "(\"" + selectorString + "\"))." + actionstring + ".toString();System.out.println(gb.shellReturnString01);");
                    scriptEnd = new String("}}");
                }
                String scriptTotal = scriptBegin + scriptMid + scriptEnd;
                //returnvalue[0] = scriptMid //real scrtiptmid, is real code
//                returnvalue[0] = "@FindBy("+bystring+" = \"vrijeTekst2\")\n" +
//                        "public WebElement "+contentNameString+";"
                returnvalue[0] = "@FindBy(" + bystring + " = \"" + selectorString + "\")\n" +
                        "public WebElement " + contentNameString + ";"
                returnvalue[1] = scriptMid //india style
                returnvalue[1] = "xPage." + contentNameString + "." + actionstring
                returnvalue[2] = shellReturnString01 //for scenetitle2 like information or exceptions
                returnvalue[3] = "hallo" //voor scenetitle2
                println "shellReturnString01====" + shellReturnString01
                println scriptTotal
                Binding binding = new Binding();
                GroovyShell shell = new GroovyShell(binding);
                Object value = shell.evaluate(scriptTotal);
            }
            catch (Exception e) {
                returnvalue[2] = e.message.toString();

                if (returnvalue[2].contains("no such element: Unable to locate element")) {
                    returnvalue[3] = "Failed to locate"
                } else returnvalue[3] = "Exception occurred"

                if (returnvalue[2].contains("Cannot invoke method getDriver() on null object")) {
                    returnvalue[2] = returnvalue[2] + " (Browser session is not started!)."
                }
                return returnvalue

            }
        }



        returnvalue[2] = GroovyBrowserDaoETS2.shellReturnString01;
        returnvalue[3] = "Action successful"
        return returnvalue

    }

    String preparedMethod(String actionstringvar,WebElement webElementvar) {
        Class<?> webClass = Class.forName("org.openqa.selenium.WebElement");
        Method webMethod;
        println ("actionstring="+actionstringvar)

        try{
            if (actionstringvar.contains("getAttribute") | actionstringvar.contains("getCssValue") | actionstringvar.contains("sendKeys")) {
                //getAttribute("abc")
                String userInputString = actionstringvar.substring(actionstringvar.indexOf("\"") + 1, actionstringvar.lastIndexOf("\"") )
                println "userInputString="+userInputString
                actionstringvar = actionstringvar.substring(0, actionstringvar.indexOf("("))
                println ("actionstring="+actionstringvar)
                webMethod = webClass.getDeclaredMethod(actionstringvar, String.class);
                return webMethod.invoke(webElementvar,userInputString).toString()
            }
            else{
                actionstringvar = actionstringvar.substring(0,actionstringvar.length()-2)
                println ("actionstringvar="+actionstringvar)
                webMethod = webClass.getDeclaredMethod(actionstringvar);
                return webMethod.invoke(webElementvar).toString()
            }
        }
        catch (Exception e){
            println e.message.toString()
        }

    }

    String[] doActionJava(String elementString, String bystring, String selectorString, String actionstring, String contentNameString, String choiceBrowser) {
        /**
         * elementString not use
         * bystring = By Id/Name/etc
         * selectorString = the value given by user like a written xpath or identifier
         * actionstring = the action to perform like click or sendkeys(x)
         * contentNameString = the new name for a cucumbercase
         * choicebrowser = not used, was for manual or auto drive
         */
        String[] returnvalue = ["Error!", "Error!", "Error!", "Error!"]





        if (choiceBrowser == "Manual") { //driver.findElement(By.cssSelector(cssstring1)).click();
            try {

                println "StartManual2"
                String scriptBegin;
                String scriptMid;
                String scriptEnd;

                //By.ById byIdvar = new By.ById("bannerLeft")


                //webMethod.invoke(webElement);


                switch (bystring) {
                    case "className":

                        WebElement webElement = browser2.getDriver().findElement(By.className(selectorString))
                        returnvalue[2] = webElement.getProperties().toString();
                        break
                    case "cssSelector":
                        returnvalue[2] = browser2.getDriver().findElement(By.cssSelector(selectorString)).getProperties().toString();
                        break
                    case "id":
                        println "ID IS CALLED HERE"

                        WebElement webElement = browser2.getDriver().findElement(By.id(selectorString))
                        //returnvalue[2] = webElement.getProperties().toString();
                        returnvalue[2] = preparedMethod(actionstring,webElement);
                        break
                    case "linkText":
                        returnvalue[2] = browser2.getDriver().findElement(By.linkText(selectorString)).getProperties().toString();
                        break
                    case "name":
                        returnvalue[2] = browser2.getDriver().findElement(By.name(selectorString)).getProperties().toString();
                        break
                    case "partialLinkText":
                        returnvalue[2] = browser2.getDriver().findElement(By.partialLinkText(selectorString)).getProperties().toString();
                        break;
                    case "tagName":
                        returnvalue[2] = browser2.getDriver().findElement(By.tagName(selectorString)).getProperties().toString();
                        break
                    case "xpath":
                        returnvalue[2] = browser2.getDriver().findElement(By.xpath(selectorString)).getProperties().toString();
                        break
                }
                //returnvalue[2] = browser2.getDriver().findElement(byIdvar).getProperties().toString();

//                if (elementString == "") {
//                    println "ja"
//                    scriptBegin = new String("import ETS2.GroovyBrowserDaoETS2;import org.openqa.selenium.By;public class test{public static void main(String...args){GroovyBrowserDaoETS2 gb = new GroovyBrowserDaoETS2();gb.shellReturnString01 = gb.browser2.getDriver().");
//                    scriptMid = new String("findElement(By." + bystring + "(\"" + selectorString + "\"))." + actionstring + ".toString();System.out.println(gb.shellReturnString01);");
//                    scriptEnd = new String("}}");
//                } else {//make:  overlayToevoegenNotitieAnoniem { $("div", id: contains("SUB008_1"))}
//                    println "nee"
//                    scriptBegin = new String("import ETS2.GroovyBrowserDaoETS2;import org.openqa.selenium.By;public class test{public static void main(String...args){GroovyBrowserDaoETS2 gb = new GroovyBrowserDaoETS2();gb.shellReturnString01 = gb.browser2.getDriver().");
//                    scriptMid = new String("findElement(By." + bystring + "(\"" + selectorString + "\"))." + actionstring + ".toString();System.out.println(gb.shellReturnString01);");
//                    scriptEnd = new String("}}");
//                }
//                String scriptTotal = scriptBegin + scriptMid + scriptEnd;
//                //returnvalue[0] = scriptMid //real scrtiptmid, is real code
////                returnvalue[0] = "@FindBy("+bystring+" = \"vrijeTekst2\")\n" +
////                        "public WebElement "+contentNameString+";"
//                returnvalue[0] = "@FindBy(" + bystring + " = \"" + selectorString + "\")\n" +
//                        "public WebElement " + contentNameString + ";"
//                returnvalue[1] = scriptMid //india style
//                returnvalue[1] = "xPage." + contentNameString + "." + actionstring
//                returnvalue[2] = shellReturnString01 //for scenetitle2 like information or exceptions
//                returnvalue[3] = "hallo" //voor scenetitle2
//                println "shellReturnString01====" + shellReturnString01
//                println scriptTotal
//                Binding binding = new Binding();
//                GroovyShell shell = new GroovyShell(binding);
//                Object value = shell.evaluate(scriptTotal);
            }
            catch (Exception e) {
                println "Handling Exceptions"
                //e.printStackTrace()
                returnvalue[2] = e.stackTrace.toString();
                System.out.println("Printing returnvalue2:"+returnvalue[2]);
                //returnvalue[2] = e.localizedMessage.toString()
                if (returnvalue[2].contains("no such element: Unable to locate element")) {
                    returnvalue[3] = "Failed to locate"
                } else returnvalue[3] = "Exception occurred"

                if (returnvalue[2].contains("Cannot invoke method getDriver() on null object")) {
                    returnvalue[2] = returnvalue[2] + " (Browser session is not started!)."
                }
                return returnvalue

            }
        }

        //returnvalue[2] = GroovyBrowserDaoETS2.shellReturnString01;
        returnvalue[3] = "Action successful"
        return returnvalue

    }


    String doGebSpockAction(String bystring, String selectorString, String actionstring) {

        String returnvalue = "returnvalue not changed something went wrong"

        browser2.drive {
            //driver.navigate()??{

            if (actionstring == "click()") {
                // browser2.getDriver().findElement(By.id(selectorString)).click();
                //browser2.getDriver().findElement(By.cssSelector(selectorString)).click();
                // GroovyBrowserDaoETS2.browser2.getDriver().findElement(By.cssSelector(selectorString)).click();
                //findElement(By.cssSelector(selectorString)).click();
                //returnvalue="browser2.getDriver().findElement(By.cssSelector("+selectorString+")).click();"//werkt niet want geen browser2 zichtbaar
                //returnvalue= new String("Label1:{GroovyBrowserDaoETS2.browser2.getDriver().findElement(By.cssSelector("+selectorString+")).click();}")
                returnvalue = new String("import ETS2.GroovyBrowserDaoETS2;import org.openqa.selenium.By;public class test{public static void main(String...args){new GroovyBrowserDaoETS2().browser2.getDriver().findElement(By.cssSelector(\"" + selectorString + "\")).click();}}")
                println returnvalue
                //returnvalue= new String("browser2.getDriver().findElement(By.cssSelector("+selectorString+")).click();")

                //  StringBuilder eval = new StringBuilder("");
                //  eval.append("Label1:")
                //   println "Eval = " + eval
//                returnvalue="println \"Hello22222\"";

                Binding binding = new Binding();
                GroovyShell shell = new GroovyShell(binding);
                int y = 0;
                print "yyy = " + y
                //Object value1 = shell.evaluate("for (x=0; x<5; x++){println \"Hello\";y++}; return x"); //prints 5 times hello
                print "yyy = " + y
                Object value = shell.evaluate(returnvalue);
                //todo medewerkers-it heeft oa  static content { overlayAanmakenNieuweZaak { $("div", id: contains("ZKN004_1"))} }
            }

        }
        return returnvalue

    }

    public String getSelectorX(String stringcss) {
        try {
            return driver.findElement(new By.ByCssSelector(stringcss)).getTagName();

            //return driver.findElement(new By.ByCssSelector(stringcss)).getText();
        }
        catch (NoSuchElementException e) {
            e.printStackTrace();
            return "NOT FOUND";
        }
    }

    public void printAllSelectorX(String stringcss1, String stringcss2) {
        System.out.println("stringcss1=    " + stringcss1);
        System.out.println("stringcss2=    " + stringcss2);
        try {
            System.out.println(
                    "getTagName() gives: " +
                            driver.findElement(new By.ByCssSelector(stringcss1)).getTagName()
                    //browser1.findElement(new By.ByCssSelector(stringcss1)).getTagName()
            );
            System.out.println(
                    "getText() gives: " +
                            //driver.findElement(new By.ByCssSelector(stringcss)).getAttribute()
                            driver.findElement(new By.ByCssSelector(stringcss1)).getText()
            );
            System.out.println(
                    "getAtrribute(\"class\") gives: " +
                            //todo attribute uit nieuw tekstveld;
                            //driver.findElement(new By.ByCssSelector(stringcss)).getAttribute()
                            driver.findElement(new By.ByCssSelector(stringcss1)).getAttribute(stringcss2)
            );

        }
        catch (NoSuchElementException e) {
            System.out.println("Not found:   " + stringcss1 + "    " + stringcss2);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        //return driver.findElement(new By.ByCssSelector(stringcss)).getText();
    }

    public String[] getAllSelectorX(String stringcss1, String stringcss2) {
        System.out.println("stringcss1=    " + stringcss1);
        System.out.println("stringcss2=    " + stringcss2);
        String[] outputArray = new String[5];
        try {
            outputArray[0] = (
                    "getTagName() gives: " +
                            driver.findElement(new By.ByCssSelector(stringcss1)).getTagName()
            );
            outputArray[1] = (
                    "getText() gives: " +
                            //driver.findElement(new By.ByCssSelector(stringcss)).getAttribute()
                            driver.findElement(new By.ByCssSelector(stringcss1)).getText()
            );
            outputArray[2] = (
                    "getAtrribute(" + stringcss2 + ") gives: " +
                            //todo attribute uit nieuw tekstveld;
                            //driver.findElement(new By.ByCssSelector(stringcss)).getAttribute()
                            driver.findElement(new By.ByCssSelector(stringcss1)).getAttribute(stringcss2)
            );
            System.out.println("[2] =" + outputArray[2]);
            outputArray[3] = (
                    "//hasChildNodes() gives: " +
                            //todo attribute uit nieuw tekstveld;
                            //driver.findElement(new By.ByCssSelector(stringcss)).getAttribute()
                            driver.findElement(new By.ByCssSelector(stringcss1)).getAttribute(stringcss2)
            );
            outputArray[4] = (
                    "//getAtrribute(\"class\") gives: " +
                            //todo attribute uit nieuw tekstveld;
                            //driver.findElement(new By.ByCssSelector(stringcss)).getAttribute()
                            driver.findElement(new By.ByCssSelector(stringcss1)).getAttribute(stringcss2)
            );
            outputArray[3] = ("-----");
            outputArray[4] = ("-----");
        }
        catch (NoSuchElementException e) {
            System.out.println("Not found:   " + stringcss1 + "    " + stringcss2);
            String[] notfound = new String()[];
            notfound[0] = { "Not Found" };
            notfound[1] = { "Not Found" };
            notfound[2] = { "Not Found" };
            notfound[3] = { "Not Found" };
            notfound[4] = { "Not Found" };
            return notfound;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return outputArray;
        //return driver.findElement(new By.ByCssSelector(stringcss)).getText();
    }

    public /*NamedNodeMap*/ void getNNM(String stringcss1, String stringcss2) {
        System.out.println(driver.findElement(new By.ByCssSelector(stringcss1)).getCssValue(stringcss2));
        //driver.findElement(new By.ByCssSelector(stringcss1)).getCssValue(stringcss2);
    }

    public void mouseOver(String cssstring1, String choiceBrowser) {
        Actions builder = new Actions(driver);
        //builder.moveToElement(hoverElement).perform();
        try {
            builder.moveToElement(driver.findElement(new By.ByCssSelector(cssstring1))).perform();
            //driver.findElement(new By.ByCssSelector("#tooltip > div > div.data > b:nth-child(1)"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void mouseClick(String cssstring1, String choiceBrowser) {
        try {

            //if(choiceBrowser=="Shell") driver.findElement(By.cssSelector(""+cssstring1+"")).click();//WORKS FOR SHELL BROWSER
            //if(choiceBrowser=="Manual") browser2.getDriver().findElement(By.cssSelector(""+cssstring1+"")).click();//WORKS FOR MANUAL BROWSER

            if (choiceBrowser == "Shell") driver.findElement(By.cssSelector(cssstring1)).click();
            if (choiceBrowser == "Manual") browser2.getDriver().findElement(By.cssSelector("" + cssstring1 + "")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String makeReport(boolean pngCheck, boolean HTMLCheck) {
        System.out.println("makeReport() called");
/*
        Browser b = new Browser();
        Browser b1 = new Browser();//(new ChromeDriver());
        b1.setDriver(new ChromeDriver());
        b1.go("http://www.liveleak.com");
*/

//TODO
        /*
        ScreenshotReporter screenshotReporter1 = new ScreenshotReporter();
        //ReportState reportstate1 = new ReportState(browser1,"label"+new FunctionsDaoETS2().getDateString(),new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2"));
        ReportState reportstate1 = new ReportState(browser2,"label"+new FunctionsDaoETS2().getDateString(),new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2"));
        //browser1 komt van bovenaan DAOets
        screenshotReporter1.writeReport(reportstate1);
  */
        //ScreenshotReporter sr = new ScreenshotReporter();
        ScreenshotReporter screenshotReporter1 = new ScreenshotReporter();
        PageSourceReporter pageSourceReporter1 = new PageSourceReporter();
        String dateText = new FunctionsDaoETS2().getDateString()
        ReportState reportstate1 = new ReportState(browser2, "label" + dateText, new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2"));
        //sr.writeReport(new ReportState(browser1,"label123",new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2")));
        if (pngCheck) screenshotReporter1.writeReport(reportstate1);
        if (HTMLCheck) pageSourceReporter1.writeReport(reportstate1);
        //ReportState reportstate1 = new ReportState(browser1,"label"+new FunctionsDaoETS1().getDateString(),new File("F:\\Users\\E\\ETScanner1\\reports\\ETS1"));

        //ReportState reportstate1 = new ReportState(browser1,"label123",new File("F:\\Users\\E\\ETScanner1\\reports\\ETS1"));
        //reportstate.setProperty("class",geb.report.Base64);
        //reportstate.setProperty();


        return dateText;
    }


    String RunGroovyShell(String string1) {
        //String returnvalue = "println \"Hello22222\"";
        String returnvalue = "startvalue returnvalue";

        //String

        // browser2.getDriver().findElement(By.id(selectorString)).click();
        //browser2.getDriver().findElement(By.cssSelector(selectorString)).click();
        //returnvalue="browser2.getDriver().findElement(By.cssSelector("+selectorString+")).click();"//werkt niet want geen browser2 zichtbaar
        //GOODTRYNOTWORKING returnvalue= new String("Label1:{browser2.getDriver().findElement(By.cssSelector("+string1+")).click();}")

//                returnvalue="println \"Hello22222\"";

        //Binding binding = new Binding();
        GroovyShell shell = new GroovyShell();
        //shell.run(new File("F:/Users/E/ETScanner2/src/main/java/ETS2/GroovyScript01.groovy"));
        //shell.run(new File("F:\\Users\\E\\ETScanner2\\src\\main\\java\\ETS2\\eSuite_MP_AFS_04_Maak_afspraak_Spec.groovy"));

/*
    shell.run(new File("F:\\Users\\E\\ETScanner2\\src\\main\\java\\ETS2\\ScanStepsTesterA.groovy"));
    println("ScanStepsTesterA.groovy")
    shell.run(new File("F:\\Users\\E\\ETScanner2\\src\\main\\java\\ETS2\\ScanStepsTesterB.groovy"));
    println("ScanStepsTesterB.groovy")
*/

        //driver = new GebConfigExtraETS2().getDriver("chrome", "nl")
        shell.run(new File(string1));//WORKS!!
        //shell.run(new File(string1),"Click on something()");//dit werkt niet, pakt gewoon string1 zonder rest te checken.??
        String x = new File(string1).toString();
        returnvalue = x;
        //Object value = shell.evaluate("for (x=0; x<5; x++){println \"Hello\"}; return x"); //prints 5 times hello
        //Object value = shell.evaluate(returnvalue);


        return returnvalue
    }

    String RunProcessBuilder(String string1) {
        String returnvalue = "startvalue returnvalue";
        //Binding binding = new Binding();
/*        GroovyShell shell = new GroovyShell();
        shell.run(new File(string1));//WORKS!!
        String x = new File(string1).toString();
        returnvalue =x;*/
        println "textAlt"
        //executeOnShell(string1, new File("F:/Users/E/medewerkers-it/src"));
        //executeOnShell(string1, new File("F:/Users/E/ETScanner2/src"));
        // executeOnShell(string1, new File("F:/Users/E/ETScanner2/"));
        //driver = new GebConfigExtraETS2().getDriver("chrome", "nl")

        //executeOnShell(string1, new File("F:/Users/E/ETScanner2/src"));
        executeOnShell(string1, new File("F:\\Users\\E\\medewerkers-it"));

        String current = new java.io.File(".").getCanonicalPath();
        System.out.println("Current dir1:" + current);
        println "XX22"
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System1:" + currentDir);
        //todo twee keer currentdit
        // print System.getProperties()
        //F:\Users\E\ETScanner2\src\ETS2
        //F:\Users\E\ETScanner2\target\classes\ETS2


        return returnvalue
    }

//-----------below is experiment with processbuilder

    String executeOnShell(String fileNameScript, File workingDir) {

        println "Commandx = " + fileNameScript
        println "WORKING DIRx = " + workingDir
        println "XX22"
        def process = new ProcessBuilder(addShellPrefix(fileNameScript))
                .directory(workingDir)
                .redirectErrorStream(true)
                .start()

        //process.waitFor();
        println "XX3"
        process.inputStream.eachLine { println it }
        println "XX4"
        println "TextExecuteOnShell\n"
        return //process.exitValue()
    }

    private def addShellPrefix(String fileNameScript) {
        String[] commandArray = new String[4]
        //commandArray[0] = "C:\\cygwin64\\bin\\sh"
        commandArray[0] = "F:/SeleniumDownloadFolder/apache-groovy-binary-2.4.5/groovy-2.4.5/bin/groovy.bat"
        //CCCCC OF   GEEEEN CCCC
        commandArray[1] = "-cp"
        commandArray[2] = "\"F:/SeleniumDownloadFolder;F:/SeleniumDownloadFolder/geb-spock-0.12.2;C:/Users/E/.m2/repository/org/spockframework/spock-core/1.0-groovy-2.4;F:/SeleniumDownloadFolder/Test_JAR_uitpakken/spock-core-1.0-groovy-2.4;C:/Users/E/.m2/repository/org/gebish/geb-core/0.12.2;F:/SeleniumDownloadFolder/Test_JAR_uitpakken/geb-core-0.12.2;F:/SeleniumDownloadFolder/Test_JAR_uitpakken/geb-core-0.12.2/geb/error;C:/Users/E/.m2/repository/org/gebish/geb-core/0.12.2/geb-core-0.12.2.jar;F:/SeleniumDownloadFolder/geb-spock-0.12.2/geb/spock;.;F:\\SeleniumDownloadFolder\\Test_JAR_uitpakken\\geb-exceptions-0.12.2;F:\\SeleniumDownloadFolder\\Test_JAR_uitpakken\\selenium-api-2.45.0;F:\\SeleniumDownloadFolder\\Test_JAR_uitpakken\\selenium-server-2.45.0;F:\\SeleniumDownloadFolder\\Test_JAR_uitpakken\\geb-waiting-0.12.2;F:\\Users\\E\\ETScanner2\\src\\main\\java;F:\\SeleniumDownloadFolder\\Test_JAR_uitpakken\\selenium-server-standalone-2.45.0;F:\\Users\\E\\ETScanner2\\src\\main\\java\\ETS2;F:\\Users\\E\\ETScanner2\\target\\classes;F:\\Users\\E\\medewerkers-it\\src\\test\\groovy\\pageobjects\\contact;F:\\Users\\E\\medewerkers-it\\target\\test-classes\\pageobjects\\contact;F:\\Users\\E\\medewerkers-it\\target\\test-classes\""

        //commandArray[2] = commandArray[2]+"xxxxx"
        commandArray[3] = fileNameScript
        println commandArray[0] + " " + commandArray[1] + " " + commandArray[2] + " " + commandArray[3]
        return commandArray
    }

    public static void storeDriver(WebDriver wd) {
        driver = wd;
    }

    public static WebDriver giveDriver() {
        return driver;
    }

    String SandBox(String string1) {
        String returnvalue = "startvalue returnvalue";
        StringBuilder builderFileA;
        String FileB;
        String FileC;

        try {
            //String x = new File(string1).toString();
            //File file1 = new File(string1);
            //returnvalue = new File(string1).text
            int number = 5
            int deffoundindex1 = 0;
            builderFileA = new StringBuilder(new File(string1).text);

            for (int i = 0; i < number; i++) {


                Integer statementstart = 0
                int statementend = 0
                int nextopenbracket = 0
                int nextclosebracket = 0
                String defname
                deffoundindex1 = builderFileA.indexOf("def \"", deffoundindex1);
                println "deffoundindex1 =====================" + deffoundindex1

                nextopenbracket = builderFileA.indexOf("{", deffoundindex1);
                statementstart = nextopenbracket
                defname = builderFileA.toString().substring(deffoundindex1, nextopenbracket)
                int amountOpenBrackets = 1;
                nextclosebracket = deffoundindex1;
                while (amountOpenBrackets > 0) {
                    nextopenbracket = builderFileA.indexOf("{", ++nextopenbracket);
                    nextclosebracket = builderFileA.indexOf("}", ++nextclosebracket);
                    if (nextopenbracket == -1 || nextclosebracket < nextopenbracket) {
                        statementend = nextclosebracket
                        amountOpenBrackets--;
                        println("nextopenbracket is:" + nextopenbracket)
                        println("nextclosebracket is:" + nextclosebracket)
                        println("Start is:" + statementstart)
                        println("End is  :" + statementend)
                    }
                }
                println "deffoundindex1 =====================" + deffoundindex1
                println("Start result is:" + statementstart)
                println("End result  is  :" + statementend)
                //builderFileA.delete(deffoundindex1,statementend+1)
                builderFileA.replace(deffoundindex1, statementend + 1, ("/*" + defname + " REMOVED*/"))
                deffoundindex1 = statementstart
                println "statementstart =x=x==" + statementstart + " \n"
            }

/*            for(int i = 0 ; ;i++){
                deffoundindex1 = builderFileA.indexOf("def \"",deffoundindex1);
                System.out.println("indexof: " + deffoundindex1);

                deffoundindex2 = builderFileA.indexOf("def \"",deffoundindex1+1);
                System.out.println("indexof: " + deffoundindex2);

                builderFileA = new StringBuilder(builderFileA);
                if(deffoundindex2==-1)break;
                builderFileA.delete(deffoundindex1,deffoundindex2)
            }
*/


            returnvalue = builderFileA

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return returnvalue
    }


}
