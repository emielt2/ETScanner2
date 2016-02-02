package ETS2
import geb.spock.GebReportingSpec
import ETS2.GettyPage
import spock.lang.Stepwise
@Stepwise
class SimpleSixTester extends GebReportingSpec {

    def "Step 01 Go To Getty"() {

        when: "Go To Getty"
        to GettyPage
        then: "Getty is opened"
        at GettyPage
    }

    def "Step 02 ShortSleep"(){
        when:
        sleep(10);
        then:
        sleep(10);
    }

    def "Step 03 Go to Gebish"(){
        when:
        to GebishPage
        then:
        at GebishPage
    }

    def "Step 04 ShortSleep"(){
        when:
        sleep(10);
        then:
        sleep(10);
    }

    def "Step 05 Go to Google"(){
        when:
        to GooglePage
        then:
        to GooglePage
    }

    def "Step 06 ShortSleep"(){
        when:
        sleep(10);
        then:
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System DURING SCRIPT:" +currentDir);
        sleep(10);
    }

    def cleanupSpec() {
        browser.driver.quit()

        println "end"
    }
}