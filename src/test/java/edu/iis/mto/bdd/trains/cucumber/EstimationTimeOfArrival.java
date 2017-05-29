package edu.iis.mto.bdd.trains.cucumber;

import java.util.List;

import org.joda.time.LocalTime;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;
import edu.iis.mto.bdd.trains.cucumber.steps.JodaLocalTimeConverter;

public class EstimationTimeOfArrival {
	
	@Zakładając("^chcę się dostać z \"(.*)\" do \"(.*)\"")
    public void givenArrivingTrains(String departure, String destination
            ) {
        throw new PendingException();

    }
	
	@I("^następny pociąg odjeżdża o (.*) na linii \"(.*)\"")
	public void givenTimeOfTrainsAndLines(@Transform(JodaLocalTimeConverter.class) LocalTime expectedTrainDeparture,
			String line) {
        throw new PendingException();

    }

    @Gdy("^zapytam o godzinę przyjazdu")
    public void askForHourOfArrival(
            ) {
        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu:(.*)$")
    public void shouldBeInformedAboutTimeArrival(@Transform(JodaLocalTimeConverter.class) LocalTime expectedTrainArrival) {
        throw new PendingException();
    }
}
