package edu.iis.mto.bdd.trains.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;
import org.joda.time.LocalTime;

/**
 * Created by Patryk on 2017-05-30.
 */
public class EstimateTimeTravelSteps {
        @Zakładając("^chcę się dostać z \"(.*)\" do \"(.*)\"$")
        public void givenFromTo(String fromCity, String toCity) {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        }

    @I("^następny pociąg odjeżdża o \"([^\"]*)\" na linii \"([^\"]*)\"$")
    public void nextTrainIsLiving(@Transform(JodaLocalTimeConverter.class) LocalTime departingTime, String line) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Gdy("^zapytam o godzinę przyjazdu$")
    public void askAboutArrivalTime() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu: \"([^\"]*)\"$")
    public void shouldBeInformedAboutTimeTravel(@Transform(JodaLocalTimeConverter.class) LocalTime expectedArrivalTime) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
