package ETS2

import geb.spock.GebReportingSpec

//println "This is ScanPage.groovy starttext outside a method"
public class CookieClickerPage2 extends GebReportingSpec {

    static at = { title == "Geb - Very Groovy Browser Automation" }

    static content = {
        manualsMenu { module MenuModule, $("#header-content ul li", 0) }
    }

    void printDD(){
        println "DD"
    }
}

/*
def "Say your pagename"(){
    println "This is ScanPage.groovy starttext INSIDE method"
}*/