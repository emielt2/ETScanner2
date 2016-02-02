package ETS2
import geb.spock.GebReportingSpec
import spock.lang.Stepwise

@Stepwise
class ScanStepsTester3B extends GebReportingSpec {

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

        println "this is setupSpec B2!!!"
        driver = GroovyBrowserDaoETS2.giveDriver();

    }

    def cleanupSpec() {
        browser.driver.close()
    }

}