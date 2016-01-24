package ETS2

import geb.Browser
import geb.spock.GebReportingSpec
import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

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
import spock.lang.Stepwise

//import pageobjects.afspraak.AfspraakOverlaysPage
//import ETS2.GettyPage;
@Stepwise
class ScanStepsTesterB2 extends GebReportingSpec {
   /*
    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
*/
    //def "Click on something"(){
    def "Step 03 Click on something"(){
        when:
        //at GooglePage
        to GebishPage

        sleep(100)
        //cartbutton.click()
        //page.homelogo2.click();

        then:
        sleep(100)
        //homelogo.click();
        at GebishPage


        //when:

        /*when:  println "click when"
        then:  println "click then"*/
    }

    def "Step 04 Go to Gebish"(){
        when:
        sleep(100)
        to GettyPage
        sleep(100)
        then:
        at GettyPage
    }

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
    def setupSpec() {

        //def browser = new Browser(driver);
/*
        if (null == ((RemoteWebDriver)driver).sessionId) {
            println "null ja"
            // current window is closed, switch to another or quit
        } else {
            println "null nee"
            // current window is open, send commands or close
        }
*/
      // ChromeOptions chromeoptions = new ChromeOptions();
       // chromeoptions.addArguments("user-data-dir=Y:\\Browser_profile2");
        //driver = new ChromeDriver(chromeoptions)
      //  driver = new Browser()
        //driver = new ChromeDriver()

        //driver.get("http://www.nu.nl")
    }
    def startbrowser(String a,String b){
        //when:
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("user-data-dir=Y:\\Browser_profile2");
        driver = new ChromeDriver(chromeoptions)
        def browser = new Browser(driver: new ChromeDriver(), baseUrl: 'http://gebish.org')
       // when:
        browser.drive{
            when:
            println "this is drive"
            then:
            sleep(1000)
        }
        println "when1"
     //   then:
        //then:
        println "then1"
    }
    def setup() {

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