package ETS2;

import geb.Browser;
import geb.spock.GebReportingSpec;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * Created by E on 11/01/2016.
 */
public class basisExtraClassTest {
    @Test
        public void geefIets(){
        when:
            System.out.println("geeIetsTEXT");
        then:
        //new geefIetsClass.xx1();
        System.out.println(geefIetsClass.class.getClass());
        }


/*
    public static class geefIetsClass extends GebReportingSpec{
*/
    public class geefIetsClass{
        public void xx1() {
            when:
            System.out.println("when xx1");
            //----------------
            String baseUrl="http://cnn.com";
            System.out.println("Check1 " + baseUrl);
            //driver = new FirefoxDriver();
            System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDownloadFolder\\chromedriver_win32\\chromedriver.exe");//todo setproperty bekijken
            ChromeOptions chromeoptions = new ChromeOptions();
            //chromeoptions.addArguments("start-maximized");
            //options.addArguments("user-data-dir=/path/to/your/custom/profile");
            chromeoptions.addArguments("user-data-dir=Y:\\Browser_profile");
            WebDriver driver = new ChromeDriver(chromeoptions);

            //File file = new File("C:/EmielUserDATA/H-DISK/ALL_JAVA_SELENIUM/JAR_LIB/IEDriverServer_x64_2.45.0/IEDriverServer.exe");
            //System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
            //WebDriver driver = new InternetExplorerDriver();
            //driver = new InternetExplorerDriver();

            // baseUrl = "https://www.google.nl/";
            driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
            System.out.println("Check3");
            //driver.get(baseUrl + "/?gws_rd=ssl");
            driver.get(baseUrl /*+ inputURL*/);
            ///---------------


            then:
            System.out.println("when xx1");
driver.quit();

        }


    }
}