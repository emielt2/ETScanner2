package ETS2

import geb.spock.GebReportingSpec

/**
 * Created by E on 19/01/2016.
 */

//Hello()
//run twee woorden()

class GroovyScript01xxx extends GebReportingSpec{

    public static void main(String...args){
        hello();
        println returnX()

       // REPORT_DIR
      //  getBrowser().setDriver(reportGroupDir
    }
    /*
    def "step1"(){
        when:
        print "some TEXT groovyscript01 WHEN"
        then:
        print "some TEXT groovyscript01 THEN"
    }
*/
    def "Ga naar inlogpagina van het mp"() {

        when: "Ga naar de inlogpagina van het mp"
        to LoginPage

        then: "inlogpagina van het mp is geopend"
        waitFor { at LoginPage }
    }
    def static hello(){
        println "Hello Called"
    }

    def static  "returnX"(){
        return "groovyscript01 returnx returned"
    }

    def "twee woorden"(){
        println "dit zijn geen twee woorden"
    }
}
