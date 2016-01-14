import geb.Page


//println "This is ScanPage.groovy starttext outside a method"
class CookieClickerPage extends Page {

    static at = { title == "Geb - Very Groovy Browser Automation" }

    static content = {
        manualsMenu { module MenuModule, $("#header-content ul li", 0) }
    }

    void printDD(){
        print "DD"
    }
}

/*
def "Say your pagename"(){
    println "This is ScanPage.groovy starttext INSIDE method"
}*/