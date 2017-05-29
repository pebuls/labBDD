package edu.iis.mto.bdd.trains.cucumber.steps;

import org.joda.time.LocalTime;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;

public class EstimatedTravelTime {
    @Zakładając("^chcę się dostać z \"(.*)\" do \"(.*)\"$")
    public void givenStartAndStopLine(String lineStart, String lineStop) {
        throw new PendingException();
    }

    @I("^następny pociąg odjeżdża o (.*) na linii \"([^\"]*)\"$")
    public void givenLeavingTimeAndLine(@Transform(JodaLocalTimeConverter.class) LocalTime leavingTime, String line) {
    	throw new PendingException();
    }
    
    @Gdy("^zapytam o (.*)$")
    public void whenIAskForLeavingTime(@Transform(JodaLocalTimeConverter.class) LocalTime startTime) {
        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu:$")
    public void shouldGet(@Transform(JodaLocalTimeConverter.class) LocalTime expectedTrainTime) {
        throw new PendingException();
    }
}