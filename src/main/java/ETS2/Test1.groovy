package ETS2

import geb.spock.GebReportingSpec
import spock.lang.Stepwise

/**
 * Created by E on 25/01/2017.
 */


@Stepwise
class Test1 extends GebReportingSpec {
    def "Step1"(){
        when: "tekst"
        sleep(100)
        go("http:/google.com")
        sleep(1000)
        then: "tekst"
        sleep(100)

    }
}
