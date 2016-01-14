package ETS2

import geb.Browser
import geb.spock.GebReportingSpec
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import geb.spock.GebSpec.*

/**
 * Created by E on 07/01/2016.
 */
public class ScanTest1 extends GebReportingSpec {
    def setup() {


    }

    public def Step1() {
        //when:
        //to ScanPage
//--
        //def browser = new Browser(driver: new ChromeDriver(), baseUrl: 'http://myhost:8080/myapp')
        def browser = new Browser(driver: new ChromeDriver(), baseUrl: 'http://gebish.org')

        browser.drive {
            when:
            go "/testing"
            then:
            assert title == "Geb - Very Groovy Browser Automation"
            println "HURRAY!!!!!!!!!!!!!!!!!!!"
        }
        println "ja Stepxx end"
        return true
    }

    public def StepHurray() {
        System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDownloadFolder\\chromedriver_win32\\chromedriver.exe");
//todo setproperty bekijken

        browser.drive {
            when:
            browser.go("http://gebish.org")
            //go "http://gebish.org/testing"
            then:
            assert browser.title == "Geb - Very Groovy Browser Automation"
            println "HURRAY!!!!!!!!!!!!!!!!!!!2222"
            browser.quit()
        }
        println "ja Stepxx end"
        return true
    }

    public def StepAssertOne() {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("user-data-dir=Y:\\Browser_profile");
        def browser = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://gebish.org')
        browser.drive {

            when:
            browser.go("http://gebish.org")
            //go "http://gebish.org/testing"
            then:
            assert browser.title == "Geb - Very Groovy Browser Automation"
            println "HURRAY!!!!!!!!!!!!!!!!!!!2222"
            browser.quit()
        }
        println "ja Stepxx end"
        return true
    }

    public void MakeScreenshot(String input) {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("user-data-dir=Y:\\Browser_profile");
        def browser = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://gebish.org')
        assert 1 == 1
        browser.drive {

            when:
            browser.go("http://gebish.org")
            to ScanPage
            //go "http://gebish.org/testing"
            then:
            at ScanPage
            //assert browser.title == "Geb - Very Groovy Browser Automation"
            assert browser.title == input
            assert 1 == 1
            println "HURRAY!!!!!!!!!!!!!!!!!!!2222"
            //new ScanTest1().
            MakeScreenshot2();
            browser.quit()
        }
        println "MakeScreenshot end"
        //JUnit4Utils.inject {MakeScreenshot2()}
        return
    }

  //  def browser = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://gebish.org')
    public void MakeScreenshot2(){
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("user-data-dir=Y:\\Browser_profile");
        final def browser = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://gebish.org')
        assert 1 == 1
        browser.drive {
//todo hier was ik
            when:
            browser.go("http://gebish.org")
            to ScanPage
            //go "http://gebish.org/testing"
            then:
            at ScanPage
            //assert browser.title == "Geb - Very Groovy Browser Automation"
            assert browser.title == input
            assert 1 == 1
            println "HURRAY!!!!!!!!!!!!!!!!!!!2222"
            //new ScanTest1().
            //MakeScreenshot2();
            browser.quit()
        }
        println "MakeScreenshot2 end"
browser.go()
        when:
        println("--1")
        then:
        println("--2")


    }
}