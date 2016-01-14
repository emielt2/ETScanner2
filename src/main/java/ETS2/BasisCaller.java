package ETS2;

import geb.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import spock.lang.Shared;

/**
 * Created by E on 10/01/2016.
 */

public class BasisCaller {
    @Shared
    Browser browser = new Browser();
    public static void main(String args[]){
        Basis b1=new Basis();
        b1.printNONstatic2();
        b1.printstatic1();
        ScanTest1 st1 = new ScanTest1();
        String baseUrl= "http://gister.com";

        //final Browser browser = new Browser(driver= new ChromeDriver(chromeoptions), baseUrl= "http://gebish.org" );

        final Browser browser = new Browser();
        System.out.println(st1.get$spock_sharedField__browser());
        st1.set$spock_sharedField__browser(new BasisCaller().browser);

        st1.setGebConfScript("F:\\Users\\E\\ETScanner2\\src\\test\\resources\\GebConfig.groovy");
        st1.createBrowser();
        System.out.println(st1.get$spock_sharedField__browser());

        st1.MakeScreenshot("Geb - Very Groovy Browser Automation");




        //b1.basisExtraClass().printbasisExtraClass();
    }
}
