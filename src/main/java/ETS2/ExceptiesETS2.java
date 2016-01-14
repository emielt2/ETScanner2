package ETS2;

/**
 * Created by E on 13/01/2016.
 */
public class ExceptiesETS2 {

    static void geefException1() throws Exception {
        throw new Exception();
    }
    public static void main(String args[]){
        try {
            geefException1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
