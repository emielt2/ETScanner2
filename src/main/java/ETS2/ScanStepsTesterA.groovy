package ETS2

import geb.Browser
import geb.report.ReportState
import geb.report.ScreenshotReporter
import geb.spock.GebReportingSpec
import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver

/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import org.openqa.selenium.chrome.ChromeOptions
import spock.lang.Stepwise

//import pageobjects.afspraak.AfspraakOverlaysPage
//import ETS2.GettyPage;
@Stepwise
class ScanStepsTesterA extends GebReportingSpec {
   
    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    /*def "Step 01 Go To Getty"() {

        when: "Go To Getty"
        to GettyPage
        then: "Getty is opened"
        waitFor { at GettyPage }
    }*/
    def "Step 01 Go To Google"() {

        when: "Go To Google"
        println "Go To Google"
        to GooglePage

        then: "Google is opened"
        println "Google is opened"
        at GooglePage
    }

    def "Step 02 Make one screenshot"(){
        when:
        print "step02 startwhen"
        sleep(50)
        //to GettyPage

        then:
        for(int i=0;i<1;i++){
            ScreenshotReporter screenshotReporter1 = new ScreenshotReporter();
            String dateText = new FunctionsDaoETS2().getDateString()
            ReportState reportstate1 = new ReportState(browser,"label"+dateText,new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2"));
            println(dateText + ".png created")
            screenshotReporter1.writeReport(reportstate1);
            //sleep(200)
        }

    }

    //def "Click on something"(){

    public static void geefX(){
        print "XXXX"
    }

    public static boolean geefTrue(){
        return true
    }

    def String customConcat(def string1, def string2) {
        println "this is customConcat"
        return string1.concat(string2)
    }
    def setupSpecxx() {
/*
        if (null == ((RemoteWebDriver)driver).sessionId) {
            println "null ja"
            // current window is closed, switch to another or quit
        } else {
            println "null nee"
            // current window is open, send commands or close
        }
*/      //driver.close()
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("user-data-dir=Y:\\Browser_profile2");
        driver = new ChromeDriver(chromeoptions)
//todo hoe krijg ik toch user-data-dir en dat ScanStepsTesterB toch het oppakt
        //driver.get("http://www.nu.nl")
    }

    def setup() {

    }
    def cleanup() {
    }
    def cleanupSpec() {
//driver.close()
        //resetBrowser()?
    }

    /*void resetBrowser() {

        def driver = browser.driver
        super.resetBrowser()
        println "this is resetbrowser"
       // println System.getProperty("geb.env")
       // println System.getProperties()
        if (System.getProperty('geb.env')?.contains('sauce')) {
            driver.quit()
        }
        //driver.quit()//verzet
        driver.close()//verzet

    }
*/
    /*def after() {
        println "closing"
        browser.close()
    }*/
}