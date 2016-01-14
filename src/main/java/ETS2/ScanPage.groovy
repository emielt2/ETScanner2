package ETS2

import geb.Page


//println "This is ScanPage.groovy starttext outside a method"
class ScanPage extends Page {

    static url = "http://gettyimages.nl";
    //static url = "http://gebish.org";

    static at = {
        title == "Stockfotografie, royalty free foto's en de meest recente nieuwsfoto's | Getty Images"
        //title == "Getty Images"
    }

    static content = {
        manualsMenu { module MenuModule, $("#header-content ul li", 0) }
    }
    def static printEE(){
        println "Dit is EE van ETS2\\ScanPage"
        return true
    }
}

/*
def "Say your pagename"(){
    println "This is ScanPage.groovy starttext INSIDE method"
}*/