package ETS2

import geb.Page


//println "This is GettyPage.groovy starttext outside a method"
class GettyPage extends Page {

    static url = "http://gettyimages.nl";
    //static url = "http://gebish.org";

    static at = {
        title == "Stockfotografie, royalty free foto's en de meest recente nieuwsfoto's | Getty Images"
        //title == "Getty Images"
    }

    static content = {
        //manualsMenu { module MenuModule, $("#header-content ul li", 0) }
        //homelogo { $("h1", id: "logo")}
        homelogo { $("a", class: "site_logo")}//WORKS!!
        //creativebutton { $("input", partialLinkText: "Creatief")}
        //creativebutton { $("li>a", linkText: "Creatief")}
        creativebutton { $("a", title: "Vraag prijzen op en doe aankopen.")}//WORKS!!

        //creativebutton { $("input", id: "creative_toggle")}


       // homelogo2 { $("h1", id: contains("logo"))}

    }
    def static printEE(){
        println "Dit is EE van ETS2\\GettyPage"
        return true
    }
}

/*
def "Say your pagename"(){
    println "This is GettyPage.groovy starttext INSIDE method"
}*/