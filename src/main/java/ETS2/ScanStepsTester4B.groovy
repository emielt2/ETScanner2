package ETS2
import geb.spock.GebReportingSpec
import org.openqa.selenium.WebDriver
import spock.lang.Stepwise

@Stepwise
class ScanStepsTester4B extends GebReportingSpec {

    def "Step 03 Click on something"(){
        when:
        to GebishPage
        then:
//        1==2//at GettyPage
        at GebishPage
    }

    def "Step 04 Go to Gebish"(){
        when:
        to GettyPage
        then:
        at GettyPage
    }

    def setupSpec() {

        //println "this is setupSpec 4B!!!"
        //WebDriver driver = new GroovyBrowserDaoETS2().giveDriver();
        browser.driver = new GroovyBrowserDaoETS2().giveDriver();
        browser.driver = new ETS2_GUI().storedWebDriver;
        /TODO waarom geen overname browser
        //driver = new ETS2_GUI().storedWebDriver;
        //driver = gebconfDriver;
        //GebConfigExtraETS2 gcf = new GebConfigExtraETS2();
       // browser.driver = gcf.extraDriver;
        //driver = new GroovyBrowserDaoETS2().driver;

        println "driver info3 =" + driver.getProperties()
       /* GroovyBrowserDaoETS2 gbd = new GroovyBrowserDaoETS2()
        gbd.storeDriver( driver);*/
    }

    def cleanupSpec() {
        browser.driver.close()
    }

}