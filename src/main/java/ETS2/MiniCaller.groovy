package ETS2

import geb.report.ReportState
import geb.report.ScreenshotReporter
import geb.spock.GebReportingSpec

/**
 * Created by E on 12/01/2016.
 */
class MiniCaller extends GebReportingSpec{
    //@Shared Browser browser = createBrowser();
//    @Shared Browser browser = getBrowser();

    //@Shared
    //Browser browser

    public void Mini1(){
        when:
        ScreenshotReporter sr = new ScreenshotReporter()
        println sr.toString()
        println "mini1 When"
        println "getbrowser geeft " +  getBrowser();
        then:
        at ScanPage
        println "mini1 Then"
        //new GebSpec().Mini2()
        Mini2()
    }

    public void Mini2(){
        //when:

        browser.drive {//HIER VERDER zoeken naar browser.drive voorbeelden
            when:
            ScreenshotReporter sr = new ScreenshotReporter()
            println "Mini2 TEXT when"
            browser.go("http://www.gebish.org")
            then:
            sr.writeReport(new ReportState(browser,"label1234MiniCaller",new File("F:\\Users\\E\\ETScanner2\\reports\\ETS2")))
            System.out.println("writereport done");
        }
        //then:
        println "Mini2 TEXT then"

    }
    def "Ga naar inlogpagina van het mp"() {

        when:"Ga naar de inlogpagina van het mp"
        to ScanPage

        then:"inlogpagina van het mp is geopend"
        at ScanPage
        println "end inlogpagina"
    }
}
