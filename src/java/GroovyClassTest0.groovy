import geb.spock.GebReportingSpec



/**
 * Created by E on 07/01/2016.
 */

public class GroovyClassTest0 extends GebReportingSpec{




   // def "Step1"(){
    public def "Step1x"(){
        //to ScanPage
        //to GebishOrgHomePage
        when:
        println "to1"
        to ScanPage

        then:
        println "at1"
       // at ScanPage
       // sleep(5000)
        println "at2"
        at CookieClickerPage
        page.printDD();
        print "ja StepBB end"
    }

    def Step1gctx(){
        // public def "Step1"(){
        //to ScanPage
        //to GebishOrgHomePage
        when:
        println "to1"
        //to ScanPage

        then:
        println "at1"
        //at ScanPage
        // sleep(5000)
        println "at2"
        //at CookieClickerPage2
        //page.printEE(); hoorde bij at page ScanPage
        println "ja Step1gct end"
    }
}
