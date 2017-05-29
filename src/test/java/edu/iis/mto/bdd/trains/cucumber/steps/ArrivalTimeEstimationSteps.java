package edu.iis.mto.bdd.trains.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;

import java.time.LocalTime;

public class ArrivalTimeEstimationSteps {
    @Zakładając("^chcę się dostać z \"(.*)\" do \"(.*)\"")
    public void chcęSięDostaćZParramattaDoTownHall(String departure, String destination) throws Throwable {
        throw new PendingException();
    }

    @I("^następny pociąg odjeżdża o (.*) na linii \"(.*)\"")
    public void następnyPociągOdjeżdżaONaLiniiWestern(@Transform(JodaLocalTimeConverter.class) LocalTime startTime, String line) throws Throwable {
        throw new PendingException();
    }


    @Gdy("^zapytam o godzinę przyjazdu$")
    public void zapytamOGodzinęPrzyjazdu() throws Throwable {

        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu: (.*)$")
    public void powinienemUzyskaćNastępującySzacowanyCzasPrzyjazdu(@Transform(JodaLocalTimeConverter.class) LocalTime arrivalTime) throws Throwable {
        throw new PendingException();
    }


}
