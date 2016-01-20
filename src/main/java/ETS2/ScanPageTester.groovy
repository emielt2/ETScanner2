package ETS2

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
import org.openqa.selenium.chrome.ChromeOptions
import spock.lang.Stepwise

//import pageobjects.afspraak.AfspraakOverlaysPage
//import ETS2.GettyPage;
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
        //to GettyPage
        //go("http://www.wikipedia.org")
        //sleep(2000)
        //browser.go("http://www.samsung.com")
        //sleep(200)
        then: "inlogpagina van het mp is geopend"
        sleep(50)
//        waitFor { at GettyPage }
    }
    def "make one screenshot"(){
        when:
        sleep(50)
        //to GettyPage

        then:
        for(int i=0;i<1;i++){
            ScreenshotReporter screenshotReporter1 = new ScreenshotReporter();
            String dateText = new FunctionsDaoETS2().getDateString()
            ReportState reportstate1 = new ReportState(browser,"label"+dateText,new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2"));
            println(dateText + ".png created")
            screenshotReporter1.writeReport(reportstate1);
            sleep(200)
        }

    }
    def "Click on something"(){
        when:
        to GettyPage

        sleep(200)
        creativebutton.click()
        //page.homelogo2.click();

        then:
        sleep(200)
        homelogo.click();
        at GettyPage


        //when:

        /*when:  println "click when"
        then:  println "click then"*/
    }
    def setupSpec() {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("user-data-dir=Y:\\Browser_profile2");
        driver = new ChromeDriver(chromeoptions)
        driver.get("http://www.nu.nl")
    }
    def cleanup() {
    }
    def cleanupSpec() {
driver.close()
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