package ETS2

import geb.report.ReportState
import geb.report.ScreenshotReporter
import geb.spock.GebReportingSpec
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import spock.lang.Stepwise

@Stepwise
class ScanStepsTester4A extends GebReportingSpec {

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    def "Step 01 Go To Googlexx"() {
        when: "Go To Google"
        println "Go To Google"
        //to GooglePage
        to GebishPage

        then: "Google is opened"
        println "Google is opened"
        //at GooglePage
        at GebishPage
    }

    def "Step 02 Make one screenshot"(){
        when:
        println "step02 startwhen"
        then:
            ScreenshotReporter screenshotReporter1 = new ScreenshotReporter();
            String dateText = new FunctionsDaoETS2().getDateString()
            ReportState reportstate1 = new ReportState(browser,"label"+dateText,new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2"));
            screenshotReporter1.writeReport(reportstate1);
            println(dateText + ".png created")
    }

    def setupSpec() {
        println "setupSpec 4A"
        browser.driver = new GebConfigExtraETS2().getDriver("chrome", "nl")
    }

    def cleanupSpec() {
        //GroovyBrowserDaoETS2.storeDriver( driver);
        //GroovyBrowserDaoETS2 gbd = new GroovyBrowserDaoETS2()
        //gbd.storeDriver( driver);
        GroovyBrowserDaoETS2.storeDriver(driver);
        new ETS2_GUI().storedWebDriver = driver;
        //gebconfDriver = driver;
        GebConfigExtraETS2 gcf = new GebConfigExtraETS2();
        gcf.extraDriver=driver;
        println "driver info1 =" + driver.getTitle()
        sleep(500)
        WebDriver driverx = new GroovyBrowserDaoETS2().giveDriver()
        println "driver info2 =" + driverx.getTitle()
        sleep(1000)
        System.exit(0)
        return
    }
}