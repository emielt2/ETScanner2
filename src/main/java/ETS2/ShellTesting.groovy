package ETS2


import geb.spock.GebReportingSpec
import geb.error.UnableToLoadException;
import geb.error.GebException;
import org.openqa.selenium.WebDriver;
import geb.waiting.Wait;
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import com.gargoylesoftware.htmlunit.WebWindowListener

//import geb.error.*;
//import spock.lang.Stepwise

//@Stepwise
class ShellTesting extends GebReportingSpec {
/*
    public static void main(String...args) {
        System.out.println("hello");
                String current = new java.io.File( "." ).getCanonicalPath();
        System.out.println("Current dir1:"+current);
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System1:" +currentDir);
                //String workingDir = System.getProperty("user.dir");
                //println workingDir
    }
*/

    def "Ga naar inlogpagina van het mp"() {

        when: "Ga naar de inlogpagina van het mp"
        to GettyPage
        //sleep(1000)
        println "ShellTesting step01 WHEN"
        then: "inlogpagina van het mp is geopend"
       // sleep(1000)

        at GettyPage
        println "ShellTesting step01 THEN"
    }

    def "setupSpec"(){
        println "This is setupSpec"
    }
    def cleanupSpec(){
        //driver.close()
       // return
    }

}