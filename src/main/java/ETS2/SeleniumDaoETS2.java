package ETS2;
/*WAS import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.fail;
*/

import geb.report.ReportState;
import geb.report.ScreenshotReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

//import org.openga.selenium.

/**
 * Created by E on 29/12/2015.
 */
public class SeleniumDaoETS2 {
    public SeleniumDaoETS2(String input){
        baseUrl = input;
    }
    static WebDriver driver;// idee voor global
    static String baseUrl; //idee voor global
    //private static WebDriver driver;
   // private static String baseUrl;
    private boolean acceptNextAlert = true;
    private static StringBuffer verificationErrors = new StringBuffer();



    public static void startSeleniumConnection() throws Exception {
        System.out.println("Check1 " + baseUrl);
        //driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDownloadFolder\\chromedriver_win32\\chromedriver.exe");//todo setproperty bekijken
        ChromeOptions chromeoptions = new ChromeOptions();
        //chromeoptions.addArguments("start-maximized");
        //options.addArguments("user-data-dir=/path/to/your/custom/profile");
        chromeoptions.addArguments("user-data-dir=Y:\\Browser_profile");
        driver = new ChromeDriver(chromeoptions);

        //File file = new File("C:/EmielUserDATA/H-DISK/ALL_JAVA_SELENIUM/JAR_LIB/IEDriverServer_x64_2.45.0/IEDriverServer.exe");
        //System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
        //WebDriver driver = new InternetExplorerDriver();
        //driver = new InternetExplorerDriver();

       // baseUrl = "https://www.google.nl/";
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        System.out.println("Check3");
        //driver.get(baseUrl + "/?gws_rd=ssl");
        driver.get(baseUrl /*+ inputURL*/);
    }
    public static void stopSeleniumConnection() throws Exception {
        //Thread.sleep(1000);
        driver.close();
        //Thread.sleep(500);
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

   public boolean trigIsSelected() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        try{
            if(driver.findElement(By.id("menu")).isDisplayed())return true;
            if(driver.findElement(By.id("menu")).getText()!="Statistics")return false;
        }
        catch(Exception e){
        System.out.println("#menu not found");
           // e.printStackTrace();
            return false;
        }
        return true;
    }

    public String getSelectorText(String stringcss) {
        try {
            return driver.findElement(new By.ByCssSelector(stringcss)).getText();
        }
        catch(NoSuchElementException e){
            e.printStackTrace();
            return "NOT FOUND";
        }
    }
    public String getSelectorX(String stringcss) {
        try {
            return driver.findElement(new By.ByCssSelector(stringcss)).getTagName();

            //return driver.findElement(new By.ByCssSelector(stringcss)).getText();
        }
        catch(NoSuchElementException e){
            e.printStackTrace();
            return "NOT FOUND";
        }
    }
    public void printAllSelectorX(String stringcss1,String stringcss2) {
        System.out.println("stringcss1=    " + stringcss1);
        System.out.println("stringcss2=    " + stringcss2);
        try {
            System.out.println(
                    "getTagName() gives: " +
                            driver.findElement(new By.ByCssSelector(stringcss1)).getTagName()
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
        catch (NoSuchElementException e){
            System.out.println("Not found:   " + stringcss1 + "    " + stringcss2);
        }
        catch (Exception e) {
            e.printStackTrace();
        }


        //return driver.findElement(new By.ByCssSelector(stringcss)).getText();
    }
    public String[] getAllSelectorX(String stringcss1,String stringcss2) {
        System.out.println("stringcss1=    " + stringcss1);
        System.out.println("stringcss2=    " + stringcss2);
        String outputArray[] = new String[5];
        try {
            outputArray[0]= (
                    "getTagName() gives: " +
                            driver.findElement(new By.ByCssSelector(stringcss1)).getTagName()
            );
            outputArray[1]= (
                    "getText() gives: " +
                            //driver.findElement(new By.ByCssSelector(stringcss)).getAttribute()
                            driver.findElement(new By.ByCssSelector(stringcss1)).getText()
            );
            outputArray[2]= (
                    "getAtrribute("+stringcss2 +") gives: " +
                            //todo attribute uit nieuw tekstveld;
                            //driver.findElement(new By.ByCssSelector(stringcss)).getAttribute()
                            driver.findElement(new By.ByCssSelector(stringcss1)).getAttribute(stringcss2)
            );
            System.out.println("[2] ="+outputArray[2]);
            outputArray[3]= (
                    "//hasChildNodes() gives: " +
                            //todo attribute uit nieuw tekstveld;
                            //driver.findElement(new By.ByCssSelector(stringcss)).getAttribute()
                            driver.findElement(new By.ByCssSelector(stringcss1)).getAttribute(stringcss2)
            );
            outputArray[4]= (
                    "//getAtrribute(\"class\") gives: " +
                            //todo attribute uit nieuw tekstveld;
                            //driver.findElement(new By.ByCssSelector(stringcss)).getAttribute()
                            driver.findElement(new By.ByCssSelector(stringcss1)).getAttribute(stringcss2)
            );
            outputArray[3]= ("-----");
            outputArray[4]= ("-----");
        }
        catch (NoSuchElementException e){
            System.out.println("Not found:   " + stringcss1 + "    " + stringcss2);
            return new String[]{"Not Found","Not Found","Not Found","Not Found","Not Found"};
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return outputArray;
        //return driver.findElement(new By.ByCssSelector(stringcss)).getText();
    }

    public /*NamedNodeMap*/ void getNNM(String stringcss1,String stringcss2) {
        System.out.println(driver.findElement(new By.ByCssSelector(stringcss1)).getCssValue(stringcss2));
        //driver.findElement(new By.ByCssSelector(stringcss1)).getCssValue(stringcss2);
    }

    public void mouseOver(String cssstring1) {
        Actions builder = new Actions(driver);
        //builder.moveToElement(hoverElement).perform();
        try {
            builder.moveToElement(driver.findElement(new By.ByCssSelector(cssstring1))).perform();
            //driver.findElement(new By.ByCssSelector("#tooltip > div > div.data > b:nth-child(1)"));
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void mouseClick(String cssstring1) {
        try {
           //good sometimes driver.findElement(new By.ByCssSelector(cssstring1)).click();
           // driver.findElement(By.cssSelector(cssstring1)).click();
            //driver.findElement(new By.ByPartialLinkText("TEXTS")).click();
            driver.findElement(new By.ByPartialLinkText(cssstring1)).click();
//todo meerdere opties teruggeven (alle By.By varianten die Rashmi/Geb wil. Optie voor gebruiker om toe te voegen aan database for later use;
            //driver.findElement(By.linkText("Texts")).click();
           // driver.findElement(new By.ByLinkText("Texts")).click();
            //driver.findElement(new By.ByCssSelector("#tooltip > div > div.data > b:nth-child(1)"));
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void MakeScreenshot(){
        /*ScreenshotReporter sr = new ScreenshotReporter();
        browser.go("http://www.nrc.nl");
        sr.writeReport(new ReportState(browser,"label123",new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2")));
        */
    }
}
/*
class ResultObj{
    String name;
    double results
}
*/