package ETS2

import geb.spock.GebReportingSpec

//--
import geb.spock.GebReportingSpec

//--
//import pageobjects.algemeen.ESuitePage
import geb.*;
import spock.*

//public class TestGroovy2 extends GebSpec{
public class TestGroovy2 extends GebReportingSpec{

    void printX() {
        System.out.println( "x");
    }
    public def "Step1"(){
        println "TestGroovy1__Step1TEXT"
        println printX()
    }

    def void3(){
        when:
        //evaluate(new File("src/main//java/ETS2/GroovyClassTest.groovy"))
        //to ScanPage
        println "void3--"
        then:
        //at ScanPage
        def script1 = new GroovyScriptEngine( '' ).with {
            //loadScriptByName( 'target/classes/ETS2/GroovyClassTest.class/GroovyTestClass.groovy' )
            /*DEZE WERKT*/ loadScriptByName( 'src/main//java/ETS2/GroovyClassTest.groovy' )
            // loadScriptByName( '\\Users\\E\\ETScanner2\\target\\classes\\ETS2/GroovyClassTest.class' )

            //DEZE WERKT loadScriptByName( 'src/main//java/ETS2/ScanPage.groovy' )
            /*DEZE WERKT*///loadScriptByName( 'src/java/ScanPage.groovy' )
            //F:\Users\E\ETScanner2\src\main\java\ETS2
            //F:\Users\E\ETScanner2\src\main\java\ETS2
        }
        def script2 = new GroovyScriptEngine( '' ).with {
            loadScriptByName( 'src/main//java/ETS2/ScanPage.groovy' )
        }



        //methodx()
        //main();
        //startStep1();
       // script1.printEE1("script1 ");//extends GebReportingSpec{
        //script.startStep1()
       // script.Step1gct()
        //script2.printEE();
       // script1.invokeMethod(null,"Step1gct")
        String string1

        GroovyShell shell = new GroovyShell()
        def script3 = shell.parse(new File('src/main//java/ETS2/GroovyClassTest.groovy'))
       // script3.invokeMethod("a","")

        def script4 = new GroovyScriptEngine( '' ).with {
            loadScriptByName( 'src/main//java/ETS2/GroovyClassTest.groovy' )
        }
        this.metaClass.mixin script4
        //script4.printEE1();
        GroovyClassTest gg = new GroovyClassTest();
        //script4.GroovyClassTest().Step1gct();
        //gg.printEE1("gg ");
        //gg.startStep1();
        //gg.Step1gct();
        println "number1= "+ gg.number1;
        println "number2= "+ gg.number2;
        gg.createX()
        //println gg.createX().getClass()
       // print gg.createX().printEE1()
        //print gg.createX().Step1gct()
        //println gg.geefObj().getClass();
       //gg.geefObj().Step1gct();///todo waarom waarom  groovy.lang.MissingFieldException: No such field: $spock_sharedField__browser for class: org.codehaus.groovy.runtime.NullObject
        GroovyClassTest hh = gg.geefObj();
        //hh.printEE1("123")
        //gg.geefObj().printEE1("gg2");

        /*
        Binding binding = new Binding();
        binding.setVariable("foo", gg.geefObj());
        GroovyShell shell3 = new GroovyShell(binding);
        Object value = shell3.evaluate(GroovyClassTest);*/
       // gg.geefObj().startStep1();



//        gg.Step2();

//HMM        gg.Step1gct();

        File sourceFile = new File("F://Users//E//ETScanner2//src//main//java/ETS2//GroovyClassTest.groovy");
        Class groovyClass = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceFile);
        GroovyObject myObject = (GroovyObject) groovyClass.newInstance();
        //myObject gct1 = new GroovyClassTest();
//        groovyClass gct2 = new GroovyClassTest();
        //groovyClass gct1 = new GroovyClassTest();
       // gct1.printEE1();
       // gct1.startStep1();
        //------------
            //def a = new A()
        def gct2 = new GroovyClassTest()
            //A.B.newInstance(a, "foo")
        //gct2.tempClass.newInstance();
        ///-------------
        Basis b1=new Basis();
        b1.printNONstatic2();
        b1.printstatic1();
        GroovyClassTest.tempClass.newInstance().printTempClass();
        GroovyClassTest.newInstance().Step1gct()//todo hier was ik ook
        //GroovyClassTest.newInstance().Step1gct() //todo niet zo zoomen op losse nonstatic methods. probeer full scripts, alhoewel probleem ligt bij spock/browser

        GroovyClassTest.newInstance().printEE1("newinstancetext ");
        GroovyClassTest.newInstance().step3();
        //GroovyClassTest.newInstance().Step1gct()

        //---

        SpecGroovyTest sgtA = SpecGroovyTest.newInstance();
        sgtA.stepSGT1();
        when:
        println "sgtAxx startWHEN"
        //SpecGroovyTest.newInstance().invokeMethod("stepSGT2()",null)//.evaluate
        //SpecGroovyTest.newInstance().stepSGT2()
//        SpecGroovyTest.newInstance().stepSGT3()
        then:
        println "sgtAxx endTHEN-------"
        //sleep(5000)
        //ScanTest1.newInstance().Step1()
        ScanTest1.newInstance().StepHurray()//BEST!!


        //sgtA.new
        //sgtA.stepSGT2();
//        SpecGroovyTest.newInstance().stepSGT2()//todo hier was ik
        def sgtBB=new SpecGroovyTest()
        //sgtBB.stepSGT2()
//        sgtBB.browser.$augmentedDriver

        //---
        def shell2 = new GroovyShell()
        def result = shell.evaluate '3*5'
        def result2 = shell.evaluate(new StringReader('3*5'))
        assert result == result2
        def script = shell2.parse '3*5'
        assert script instanceof groovy.lang.Script
        assert script.run() == 15
        //println result
        //println result2
        //---

        //---

//        GroovyObject myObject = new GroovyClassTest();;

//        new GroovyClassTest().Step1gct();
        //gg.printEE();
        //gg.Step1gct();

//        startStep1();

       // script1().GroovyTestClass();//todo maak callable full testcase
        //myObject.getProperty()
       // myObject.printEE();
//        evaluate(new File("src/main//java/ETS2/GroovyClassTest.groovy"))
        //println script3.getClass()
        //script1.invokeMethod("Step1gct","")
        //script3.Step1gct()
        //script.invokeMethod("Step1gct()","hallo")
        //script2.metaClass("Step1gct")
        // extends Page
        //sleep(3000)

        //"F://Users//E//ETScanner2//src//main//java/ETS2//GroovyClassTest.groovy".execute().Step1gct
        //"F:\\SeleniumDownloadFolder\\apache-groovy-binary-2.4.5\\groovy-2.4.5\\bin\\groovy F://Users//E//ETScanner2//src//main//java/ETS2//GroovyClassTest.groovy".execute().text

/*DEZE WERKEN
        new GroovyShell().parse( new File( 'src/main//java/ETS2/ScanPage.groovy' ) ).with {

            printEE1()
        }
        new GroovyShell().parse( new File( 'src/main//java/ETS2/GroovyClassTest.groovy' ) ).with {
            printEE1()
        }
        new GroovyShell().parse( new File( 'src/main//java/ETS2/GroovyClassTest.groovy') ).with {
            Step1gct()
        }
*/

        println "End of TestGroovy2"

        //Step2();
    }
}


