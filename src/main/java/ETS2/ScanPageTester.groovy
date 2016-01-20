package ETS2

import geb.Browser
import geb.report.PageSourceReporter
import geb.report.ReportState
import geb.report.ScreenshotReporter
import geb.spock.GebReportingSpec

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
import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import spock.lang.Stepwise

//import pageobjects.afspraak.AfspraakOverlaysPage
//import ETS2.ScanPage;
@Stepwise
class ScanPageTester extends GebReportingSpec {
   
    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    def "Ga naar inlogpagina van het mp"() {

        when: "Ga naar de inlogpagina van het mp"
        to ScanPage
        //go("http://www.wikipedia.org")
        //sleep(2000)
        //browser.go("http://www.samsung.com")
        //sleep(200)
        then: "inlogpagina van het mp is geopend"
        sleep(50)
//        waitFor { at ScanPage }
    }
    def "make three screenshots"(){
        when:
        sleep(50)
        //to ScanPage

        then:
        for(int i=0;i<3;i++){
            ScreenshotReporter screenshotReporter1 = new ScreenshotReporter();
            String dateText = new FunctionsDaoETS2().getDateString()
            ReportState reportstate1 = new ReportState(browser,"label"+dateText,new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2"));
            println(dateText + ".png created")
            screenshotReporter1.writeReport(reportstate1);
            sleep(200)
        }

    }
    def "Click on something"(){
        /*when:  println "click when"
        then:  println "click then"*/
    }
    def setupSpec() {
        //browser = new ChromeDriver()
       // resetBrowser()
    }
    def cleanup() {
        println "cleanup"
       // browser.close()
    }
    def cleanupSpec() {
        println "cleanup"
        //resetBrowser()
        browser.go("about:blank")
        //browser.close()
        //sleep(1000)
        //browser.quit()
    }
    /*def after() {
        println "closing"
        browser.close()
    }*/
}