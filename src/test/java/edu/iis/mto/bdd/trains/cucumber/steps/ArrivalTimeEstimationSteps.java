package edu.iis.mto.bdd.trains.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;
import org.joda.time.LocalTime;

/**
 * Created by Konrad Gos on 30.05.2017.
 */
public class ArrivalTimeEstimationSteps {
    @Zakładając("^chcę się dostać z \"(.*)\" do \"(.*)\"")
    public void chce_się_dostać_z_do(String startStation, String stopStation) {
        throw new PendingException();
    }

    @I("^następny pociąg odjeżdża o (.*) na linii \"(.*)\"")
    public void następny_pociąg_odjeżdża_o_na_linii(@Transform(JodaLocalTimeConverter.class) LocalTime departureTime, String line) {
        throw new PendingException();
    }

    @Gdy("^zapytam o godzinę przyjazdu")
    public void zapytam_o_godzinę_przyjazdu() {
        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu:(.*)$")
    public void powinienem_uzyskać_natępujący_czas_przyjazdu(@Transform(JodaLocalTimeConverter.class) LocalTime estimationArrivalTime) {
        throw new PendingException();
    }
}
