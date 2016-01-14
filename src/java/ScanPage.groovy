import geb.Page


//println "This is ScanPage.groovy starttext outside a method"
class ScanPage extends Page {

    static at = { title == "Geb - Very Groovy Browser Automation" }

    static content = {
        manualsMenu { module MenuModule, $("#header-content ul li", 0) }
    }
    def printEE(){
        println "Dit is EE van java\\ScanPage"
        return true
    }
}

/*
def "Say your pagename"(){
    println "This is ScanPage.groovy starttext INSIDE method"
}*/