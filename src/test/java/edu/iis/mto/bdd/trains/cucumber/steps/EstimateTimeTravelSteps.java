package edu.iis.mto.bdd.trains.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;

/**
 * Created by Patryk on 2017-05-30.
 */
public class EstimateTimeTravelSteps {
        @Zakładając("^chcę się dostać z \"(.*)\" do \"(.*)\"$")
        public void givenFromTo(String from, String to) {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        }

    @I("^następny pociąg odjeżdża o \"([^\"]*)\" na linii \"([^\"]*)\"$")
    public void nextTrainIsLiving(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Gdy("^zapytam o godzinę przyjazdu$")
    public void askAboutArrivalTime() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu: \"([^\"]*)\"$")
    public void shouldBeInformedAboutTimeTravel(String time) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
