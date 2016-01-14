package ETS2

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import geb.spock.GebReportingSpec
import geb.spock.*;
import org.junit.Test
import spock.lang.Stepwise
import spock.lang.Stepwise

@Stepwise
//class SpecGroovyTest extends Specification{ //geeft geen broswer
class SpecGroovyTest extends GebReportingSpec{ //geeft wel browser
//class SpecGroovyTest extends GebSpec{ //geeft geen broswer

    //GebReportingSpec
public call(){
    when:
    println "Call Text"
    then:
    println "Call End"

    return

}
    @Test
    public void teststepSGT1(){
        /*when:
        println "This is stepSGT1 WHEN"
        then:
        println "This is stepSGT1 THEN"*/
        println "stepSGT1 Text"
    }
    public void stepSGT2(){
        /*when:
        println "This is stepSGT2 WHEN"
        then:
        println "This is stepSGT2 THEN"
        println "stepSGT2 Text"*/
        return
    }
    public void stepSGT3(){
        //when:
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("user-data-dir=Y:\\Browser_profile");
        def browser = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://gebish.org')
        browser.drive{
            browser.go("http://gebish.org")
        }
        /*when:
        println "This is stepSGT3 WHEN"
        then:
        println "This is stepSGT3 THEN"*/
        println "stepSGT3 Text----------------------"
        assert 1==1 //dit is spock? mag wel in non static call
        //expect: //dit is geb mag niet in non static call
       // 1==1
        //assert ${}
        //ScanTest1 stA = new ScanTest1();
        //stA.Step1()
        //then:
        assert  1==1
        return
    }
}
