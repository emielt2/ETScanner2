package ETS2;

import org.junit.Test;

/**
 * Created by E on 10/01/2016.
 */
public class Basis {
    //void Basis(){}
    public static void printstatic1(){
        System.out.println("printstatic1");
    }
    public void printNONstatic2(){
        System.out.println("printNONstatic2");
    }
    @Test
    public void basisExtraClass(){
        System.out.println("This is printTempClass() text");
    }
}
