/**
 * Created by E on 07/01/2016.
 */
public class ScanTest1 {

    def "Step1"(){
        when:
        to ScanPage

        then:
        at ScanPage
        print "ja Stepxx end"
    }

}