package ETS2


import geb.report.ReportState
import geb.report.ScreenshotReporter
import geb.spock.GebReportingSpec
import org.openqa.selenium.By
import spock.lang.Stepwise

@Stepwise
class SimpleTest extends GebReportingSpec {

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
        go("http:/google.com")
        sleep(1000)
        //to GooglePage
        //to GebishPage

        then: "Google is opened"
        println "Google is opened"
        //at GooglePage
        //at GebishPage
    }

}