package ETS2
/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import geb.spock.GebReportingSpec
import org.openqa.selenium.By

//import pageobjects.afspraak.AfspraakOverlaysPage
//import ETS2.GettyPage;

import spock.lang.Stepwise

@Stepwise
class eSuite_MP_AFS_04_Maak_afspraak_Spec extends GebReportingSpec {

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    def "Ga naar inlogpagina van het mp"() {

        when: "Ga naar de inlogpagina van het mp"
        to GettyPage
        go("http://gebish.org")
        sleep(2000)

        then: "inlogpagina van het mp is geopend"
        //go("http://www.wikipedia.org")

        at GettyPage
        //waitFor { at GettyPage }
    }

/*
    def "Log in op het mp"() {
        when: "Inloggen met testuser"
        page.Login()

        then: "Succesvolle login"
        waitFor { at KCCPage }
    }

    def "Zoeken op bsn"() {
        when: "Zoeken op bsn"
        bsnOfKvkOfVestigingsnummer = "764334670"
        zoekButton.click()

        then: "persoon met bsn gevonden"
        waitFor(20, 0.5) { at AfspraakOverlaysPage }
        //driver.findElement(By.cssSelector("h2.pag-sec-hdr")).text == "Test van der Regressiepersoon - 8495 59 480 | Personal details"
    }

    def "Openen modal dialog afspraak maken"() {
        when: "Klikken op afspraak"
        //waitFor(20, 0.5){hyperlinkAfsprakenNiew.displayed}
        sleep(8000)
        hyperlinkAfsprakenNiew.click();

        then: "Modal dialog afspraak maken is geopend"
        //titel.text()=="Afspraak maken"
        //waitFor(20, 0.5){selectLand.present}
        sleep(5000)
        driver.findElement(By.id("land-field")).text == "- Select a country -\n" +
                "Algeria\n" +
                "Australia\n" +
                "Belgium\n" +
                "Brasil\n" +
                "Canada\n" +
                "France\n" +
                "Germany\n" +
                "India\n" +
                "Italy\n" +
                "Mexico\n" +
                "Netherlands\n" +
                "Portugal\n" +
                "South Africa\n" +
                "Spain"
    }

    def "Afspraak maken"() {
        when: "selecteren land"
        waitFor(20, 0.5) { selectLand.enabled }
        selectLand = "Netherlands"

        then:
        waitFor(20, 0.5) { selectVestiging.enabled }
        driver.findElement(By.id("vestiging-field")).text == "- Select a unit -\nAmsterdam\nEindhoven\nRotterdam"

        when: "selecteren vestiging"
        selectVestiging = "Amsterdam"

        then:
        waitFor(20, 0.5) { selectReden.enabled }
        selectReden.text() == "- Select a reason -\nEchtscheiding\nNederlands paspoort"
        //assert waitFor(20,0.5){reden}.text() == "- Select a reason -\nEchtscheiding\nNederlands paspoort"
        //driver.findElement(By.id("reden-field")).text == "- Select a reason -\nEchtscheiding\nNederlands paspoort"

        when: "selecteren reden"
        selectReden = "Nederlands paspoort"

        then:
        waitFor(20, 0.5) { selectAantalaanvragers.enabled }
        driver.findElement(By.id("aanvrager-field")).text == "1\n2\n3\n4"

        when: "selecteren aantal aanvragers"
        selectAantalaanvragers = "4"
        sleep(5000)
        driver.findElement(By.cssSelector("span.input-group-btn > button.btn.btn-default")).click();

        then:
        waitFor(20, 0.5) { buttonVolgende.enabled }

        when:
        buttonVolgende.click();
        buttonVolgende.click();

        //then:
        //waitFor(20, 0.5){datepicker.enabled}

        //when:
        //datepicker.click();
        driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();

        then:
        waitFor(20, 0.5) { selectTijdslot.enabled }

        when:
        selectTijdslot = "08:00-09:20"

        then:
        waitFor(20, 0.5) { knopBevestigen.enabled }

        when:
        knopBevestigen.click();
        //driver.findElement(By.xpath("//body[@id='mp']/div[11]/div/div/div[2]/div/div/button")).click();

        then: "afspraak is gemaakt"
        waitFor(20, 0.5) { at AfspraakPage }
        waitFor(20, 0.5) { spanLand.displayed }
        spanLand.text() == "Netherlands"
        spanVestiging.text() == "Amsterdam"
        spanRedenafspraak.text() == "Nederlands paspoort"
        spanAantalaanvragers.text() == "4"
        spanAfspraak_op.text() == "2 March 2015"
        spanTijdstip.text() == "08:00 - 09:20"
        spanStatus.text() == "Made"
    }

    def "Annuleren afspraak"() {
        when: "annuleren afspraak"
        waitFor { openAfspraakAnnulerenLink.displayed }
        openAfspraakAnnulerenLink.click();
        waitFor { redenannuleren.displayed }
        redenannuleren = "test"
        waitFor { jaKnop.enabled }
        jaKnop.click();

        then: "afspraak geannuleerd"
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("span.rf-msgs-sum"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
        driver.findElement(By.cssSelector("span.rf-msgs-sum")).text == "The appointment has been cancelled."
    }
    */
}