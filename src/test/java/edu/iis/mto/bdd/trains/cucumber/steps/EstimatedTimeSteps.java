package edu.iis.mto.bdd.trains.cucumber.steps;

import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;
import org.joda.time.LocalTime;

/**
 * Created by 195035 on 23.05.2017.
 */
public class EstimatedTimeSteps {

    @Zakładając("^chcę się dostać z \"(.*)\" do \"(.*)\"$")
    public void given(String from, String to) {

    }

    @I("^następny pociąg odjeżdża o \"(.*)\" z linii \"(.*)\"$")
    public void and(@Transform(JodaLocalTimeConverter.class) LocalTime departureTime, String startStation) {

    }

    @Gdy("^zapytam o godzinę przyjazdu$")
    public void when() {

    }

    @Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu: \"(.*)\"$")
    public void then(@Transform(JodaLocalTimeConverter.class) LocalTime arriveTime) {

    }
}
