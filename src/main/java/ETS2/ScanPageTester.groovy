package ETS2

import geb.spock.GebReportingSpec
import spock.lang.Stepwise

/**
 * Created by E on 14/01/2016.
 */

@Stepwise
class ScanPageTester extends GebReportingSpec {
    def "test01"(){
//hierverder
        when:
        println "whentext"
        browser.go("http://news.google.nl")
        print browser.getProperties()
        to ScanPage
        //browser.go("http://news.google.nl")

        /*browser.drive{
            browser.go("http://cnn.com")
        }*/

        then:
        at ScanPage
        //sleep(5000)
        println "thentext"
    }

    /*
    def "probeer ScanPage test"(){

        when:
        println "whentext"

        to ScanPage
        //browser.go("http://news.google.nl")
        Browser.browser.go("http://news.google.nl")
        //browser.drive{
         //   browser.go("http://cnn.com")
        //

        then:
        at ScanPage
        //sleep(5000)
        println "thentext"
    }
    */
}
