package ETS2

import geb.Page


//println "This is GettyPage.groovy starttext outside a method"
class GebishPage extends Page {

    static url = "http://gebish.org";


    static at = {
        title == "Geb - Very Groovy Browser Automation"
        //title == "Getty Images"
    }

    static content = {
        //manualsMenu { module MenuModule, $("#header-content ul li", 0) }
        //homelogo { $("h1", id: "logo")}
        homelogo { $("a", class: "site_logo")}//WORKS!!
        //creativebutton { $("input", partialLinkText: "Creatief")}
        //creativebutton { $("li>a", linkText: "Creatief")}
        cartbutton { $("a", title: "Vraag prijzen op en doe aankopen.")}//WORKS!!

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