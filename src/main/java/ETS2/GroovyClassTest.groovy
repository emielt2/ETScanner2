package ETS2

import geb.Browser
import geb.Browser.*;
import geb.report.PageSourceReporter
import geb.report.ReportState
import geb.report.ScreenshotReporter
import geb.spock.GebReportingSpec
import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import spock.lang.Stepwise
import spock.lang.Stepwise

@Stepwise
public class GroovyClassTest extends GebReportingSpec{
    int number1 =1;
    static int number2 =2;
    public class tempClass{
        void printTempClass(){
            println "This is printTempClass() text"
            when:
            println "This is printTempClass WHEN"
            then:
            println "This is printTempClass THEN"
        }
    }
    public void step3(){
        /*when:
        println "This is step3 WHEN"
        then:
        println "This is step3 THEN"*/
        println "step3 Text"
    }

    public void Step2(){
        when:
        println "to1"
        to ScanPage

        then:
        println "at Step222"
        //Step1() //zou mooi zijn
        //at ScanPage
        println "at Step222"
        at ScanPage
        //page.printEE1();
        when:
        printEE1("Step2 van GCT");
        then:
        println "ja GroovyTestClassStep2 end"
    }
    public void Step2b(){
        when:
        println "22bb"
        to ScanPage
//todo meer pagina urls enzo, meer pages
        then:
        println "at Step222bbb"
        //Step1() //zou mooi zijn
        //at ScanPage
        println "at Step222bbb"
        at ScanPage
        //page.printEE1();
        when:
        printEE1("Step2 van GCT");
        then:
        println "ja GroovyTestClassStep2bbb end"
    }

    public static void main(){
        System.out.println("THIS IS MAIN() MAN");
        //Step2();
       // GeefX();
        //startStep1();
      //  when:
      //  println "main2"

    }

    def static startStep1(){
        //when:
        print "startStep1WHEN text"
        //to
        printEE1()
        Step1gct();
        //Step1gct("hallo");
        //GroovyClassTest.Step1gct();
        //printEE1()
        //Step1gct();
        //then:
        print "startStep1TEXT_THEN"
        return true;
    }

    //@Shared


    public void Step1gct(){

        //Step1gct(){}
   // public def "Step1"(){
        //to ScanPage
        //to GebishOrgHomePage
        def browser = new Browser(driver: new ChromeDriver(), baseUrl: 'http://gebish.org')

        browser.drive {
            when:
            //NICE MAAKT SCREENSHOTS
            println "Step1gct START"
            to ScanPage
            browser.go("http://www.nrc.nl")
            println "check1";//sleep(5000);
            ScreenshotReporter sr = new ScreenshotReporter()
            sr.writeReport(new ReportState(browser,"labelStep1gct TRY03",new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2")))
            println "Step1gct sr.writeRport"
            browser.close()

//todo            sr.writeReport()
            //print a


//todo meer pagina urls enzo, meer pages
            then:
            println "at1"
             at ScanPage
            // sleep(5000)
            println "at2"
            //at CookieClickerPage2
            //page.printEE(); hoorde bij at page ScanPage
        }
        println "ja Step1gct end"
       // return;
    }

    public void Step2gctAlmostHurray(){



        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("user-data-dir=Y:\\Browser_profile");
        chromeoptions.addArguments("start-maximized");
        //def browser = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://nu.nl')
        def browser = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://nu.nl')

        browser.drive {
            //to ScanPage
            when:"Ga naar de inlogpagina van het mp"
            //NICE MAAKT SCREENSHOTS
            println "Step2gctAlmostHurray START WHEN"
//            println driver.getProperties()
            //browser.setProperty("user.dir","Y:\\Browser_profile")
            //browser.setDriver(new ChromeDriver(chromeoptions))
            //cd = new ChromeDriver(chromeoptions)
            //browser.set$augmentedDriver(cd)
//            println "getprop = "+ browser.getProperties()//("user-data-dir")
            //WebDriver driver2 = new ChromeDriver(chromeoptions);
            //Browser browser2 = new Browser(driver2: new ChromeDriver(chromeoptions), baseUrl: 'http://ad.nl')
            //driver.
            //driver2.manage().window().size = new Dimension(640, 960);
            //sleep(2000)
            //driver2.manage().window().size = new Dimension(340, 360);


            //browser2.go()
            browser.go("http://www.weeknummer.nl")
           // browser.go("/economie")

            println "check1";//sleep(5000);
            ScreenshotReporter sr = new ScreenshotReporter()
            //browser2=browser;
            //browser2.driver = new ChromeDriver(chromeoptions)
            sr.writeReport(new ReportState(browser,"label"+new FunctionsDaoETS2().getDateString(),new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2")))
            //sr.writeReport(new ReportState($spock_sharedField__browser,"label"+new FunctionsDaoETS2().getDateString(),new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2")))
//            sr.writeReport(new ReportState(driver2,"label"+new FunctionsDaoETS2().getDateString(),new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2")))
            println "Step1gct sr.writeRport"

            //then:
            println "Step2gctAlmostHurray doing at ScanPage"
            //at ScanPage
            println "Step2gctAlmostHurray THEN"
            browser.close()//-------------------------
            println "Browser Closed"
        }
        println "ja Step1gct end"
        // return;
    }

    //static ChromeOptions chromeoptions = new ChromeOptions().addArguments("user-data-dir=Y:\\Browser_profile");
    //@Shared ChromeOptions chromeoptions = new ChromeOptions();

    //@Shared Browser browser = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://nu.nl')
    //@Shared Browser browser = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://nu.nl')
    public void Step3gctHurray(){

//getBrowser()


/*dit werkte*/
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("user-data-dir=Y:\\Browser_profile");
        //chromeoptions.addArguments("start-maximized");
        def browser1 = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://nu.nl')
        //def browser = new Browser(driver: new InternetExplorerDriver(), baseUrl: 'http://nu.nl')


        //new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://nu.nl').drive {
        //browser1.drive{
        browser1.drive{
            //Browser.browser.go("http://news.google.nl")
            when:"Ga naar de inlogpagina van het mp"
            //browser = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://nu.nl')
            //set$spock_sharedField__browser(browser)
            //this.browser = browser;
//            Browser browser2 = get$spock_sharedField__browser(browser)
            to ScanPage //todo geen beeld
            println "Step2gctAlmostHurray START WHEN"
            //browser1.go("http://www.weeknummer.nl")
            /*browser.*/   go("http://www.gebish.org/")
            //browser = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://nu.nl')

            println "check1";//sleep(5000);
            ScreenshotReporter screenshotReporter1 = new ScreenshotReporter()
            ReportState reportstate1 = new ReportState(browser1,"label"+new FunctionsDaoETS2().getDateString(),new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2"));
            //reportstate.setProperty("class",geb.report.Base64)
            //reportstate.setProperty()
            screenshotReporter1.writeReport(reportstate1)
            PageSourceReporter pageSourceReporter1 = new PageSourceReporter();
            pageSourceReporter1.writeReport(reportstate1)
//DEZE WERKT            sr.writeReport(new ReportState(browser,"label"+new FunctionsDaoETS2().getDateString(),new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2")))
            println "Step1gct sr.writeReport222 PageSourceReporter"

            print reportstate1.getProperties()

            //geb.report.Base64
            println "Step1gct sr.writeReport2"
            println "Step2gctHurray doing at ScanPage"
            println "Step2gctHurray THEN"
            sleep(2000)
            //page.find(By.cssSelector("li.crossbrowser")).click();

            println page.find(By.cssSelector("li.crossbrowser")).toString()
            println page.find(By.cssSelector("li.crossbrowser")).getProperties()
            println "GO CLICK DAMIT"
            page.find(By.cssSelector("li.crossbrowser")).click();
            browser1.find(By.cssSelector("li.crossbrowser")).click();

           //??? browser.find(navigator($("a", href: contains("/crossbrowser")))).click()
            //$("a", href: contains("/crossbrowser")).click()
          //  $("a", href: contains("/crossbrowser"))
            //driver.findElement(By.cssSelector("li.crossbrowser")).click();
            //find(By.cssSelector("li.crossbrowser")).click();
            sleep(2000)

            /**reset de reportstate1 met nieuwe date!
             */
            reportstate1 = new ReportState(browser1,"label"+new FunctionsDaoETS2().getDateString(),new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2"));

            screenshotReporter1.writeReport(reportstate1)
            pageSourceReporter1.writeReport(reportstate1)
            //css gebish.org linkje=    li.crossbrowser
            at ScanPage
            browser.close()//-------------------------
            println "Browser Closed"
        }
        println "ja Step1gct end"
    }

//    public void Step4gctKeepLooking(){
    def Step4gctKeepLooking(){
//getBrowser()
//when:
/*dit werkte*/
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("user-data-dir=Y:\\Browser_profile");
        //chromeoptions.addArguments("start-maximized");
        def browser = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://kpn.com')
        //def browser1 = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://telegraaf.nl')
        //sleep(7000)
        //def browser1 = new Browser(driver: new InternetExplorerDriver(), baseUrl: 'http://nu.nl')
       //browser1.go("http://www.gebish.org/")

        //new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://nu.nl').drive {
//        browser1.drive(){
        //browser.drive{
        browser.drive{
        //getBrowser().drive{
            when:"Ga naar de inlogpagina van het mp"
            //browser = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://nu.nl')
            //set$spock_sharedField__browser(browser)
            //this.browser = browser;
//            Browser browser2 = get$spock_sharedField__browser(browser)
            //Browser.browser.go("http://news.google.nl")

            //to ScanPage //todo geen beeld
            println "Step2gctAlmostHurray START WHEN"
            //browser1.go("http://www.weeknummer.nl")
            /*browser.*/
            //go("http://www.gebish.org/")
            //browser.go("http://dumpert.nl")
            browser.go("http://www.gebish.org/")
            //browser = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://nu.nl')
            //page.
                    println "check1";//sleep(5000);
            ScreenshotReporter screenshotReporter1 = new ScreenshotReporter()
            //ReportState reportstate1 = new ReportState(browser1,"label"+new FunctionsDaoETS2().getDateString(),new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2"));
            ReportState reportstate1 = new ReportState(browser,"label"+new FunctionsDaoETS2().getDateString(),new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2"));
            //reportstate.setProperty("class",geb.report.Base64)
            //reportstate.setProperty()
            screenshotReporter1.writeReport(reportstate1)
            PageSourceReporter pageSourceReporter1 = new PageSourceReporter();
            pageSourceReporter1.writeReport(reportstate1)
//DEZE WERKT            sr.writeReport(new ReportState(browser,"label"+new FunctionsDaoETS2().getDateString(),new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2")))
            println "Step1gct sr.writeReport222 PageSourceReporter"

            print reportstate1.getProperties()

            //geb.report.Base64
            println "Step1gct sr.writeReport2"
            println "Step2gctHurray doing at ScanPage"
            then:"THEN de inlogpagina van het mp"
            println "Step2gctHurray THEN"
            sleep(2000)
            //page.find(By.cssSelector("li.crossbrowser")).click();

            println page.find(By.cssSelector("li.crossbrowser")).toString()
            println page.find(By.cssSelector("title")).toString()
            println page.find(By.cssSelector("li.crossbrowser")).getProperties()
            println "GO CLICK !!"

            page.find(By.cssSelector("li.crossbrowser")).click();
            browser.find(By.cssSelector("li.crossbrowser")).click();

            //??? browser.find(navigator($("a", href: contains("/crossbrowser")))).click()
            //$("a", href: contains("/crossbrowser")).click()
            //  $("a", href: contains("/crossbrowser"))
            //driver.findElement(By.cssSelector("li.crossbrowser")).click();
            //find(By.cssSelector("li.crossbrowser")).click();
            sleep(2000)

            /**reset de reportstate1 met nieuwe date!
             */
            //reportstate1 = new ReportState(browser1,"label"+new FunctionsDaoETS2().getDateString(),new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2"));
            reportstate1 = new ReportState(browser,"label"+new FunctionsDaoETS2().getDateString(),new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2"));

            screenshotReporter1.writeReport(reportstate1)
            pageSourceReporter1.writeReport(reportstate1)
           // screenshotReporter1.writeReport(reportstate1)
          //  pageSourceReporter1.writeReport(reportstate1)
            //css gebish.org linkje=    li.crossbrowser
            //at ScanPage
            browser.close()//-------------------------
            println "Browser Closed"
        }
//then:
        println "ja Step1gct end"
    }
    //maybe not allowed in gebpeport
    def static printEE1(String input){

        println input + " - Dit is EE van ETS2\\GroovyClassTest"

        return true
    }

/*
    public static String createX(String y) {
        println "createX text"
        return new String(y)
    }
*/
    public class X {}

  /*  public X foo1() {   when:
    println "to1"
    //to ScanPage
//todo meer pagina urls enzo, meer pages
        then:
        println "at Step222"
        //return new Step1gct()
        return new X()
    }*/
    public static X createX(GroovyClassTest y) {
        println "createX text"
        return new X(y)
    }
    public static GroovyClassTest geefObj() {
        println "geefObj text"
        return new GroovyClassTest()
    }


}