package edu.iis.mto.bdd.trains.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;
import org.joda.time.LocalTime;

/**
 * Created by Piotr on 18.06.2017.
 */
public class EstimatedTimeOfTravel {

    @Zakładając("^chcę się dostać z \"(.*)\" do \"(.*)\"$")
    public void fromStationAToB(String start, String stop) {
        throw new PendingException();
    }

    @I("^następny pociąg odjeżdża o (.*) na linii \"([^\"]*)\"$")
    public void nextTrainDeparture(@Transform(JodaLocalTimeConverter.class) LocalTime leavingTime, String line) {
        throw new PendingException();
    }

    @Gdy("zapytam o godzinę przyjazdu")
    public void askAboutArrivalTime() {
        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu:$")
    public void getEstimatedArrivalTime(@Transform(JodaLocalTimeConverter.class) LocalTime expectedTrainTime) {
        throw new PendingException();
    }

}
