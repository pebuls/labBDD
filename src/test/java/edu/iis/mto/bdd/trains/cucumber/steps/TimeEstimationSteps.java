package edu.iis.mto.bdd.trains.cucumber.steps;

import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;
import sun.security.util.PendingException;

import java.time.LocalTime;

/**
 * Created by test on 06.06.2017.
 */
public class TimeEstimationSteps {
    @Zakładając("^chcę się dostać z \"(.*)\" do \"(.*)\"")
    public void giveStartAndStopLine(String from, String to) throws Throwable {
        throw new PendingException();

    }

    @I("^następny pociąg odjeżdża o (.*) na linii \"(.*)\"")
    public void giveLineAndTime(@Transform(JodaLocalTimeConverter.class) LocalTime startTime, String line) throws Throwable {
        throw new PendingException();
    }

    @Gdy("^zapytam o godzinę przyjazdu$")
    public void askForArrivalTime() throws Throwable {
        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu: (.*)$")
    public void shouldBeInformedAboutArrivalTime(@Transform(JodaLocalTimeConverter.class) LocalTime expectedTime) throws Throwable {
        throw new PendingException();
    }
}
