package edu.iis.mto.bdd.trains.cucumber.steps;

import org.joda.time.LocalTime;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;

public class ArrivalTimeEstimationSteps {

	@Zakładając("^chcę się dostać z \"(.*)\" do \"(.*)\"")
    public void givenIWantToTravel(String departure, String destination) {
        throw new PendingException();
    }
	
	@I("następny pociąg odjeżdża o (.*)$ na linii \"(.*)\"")
	public void andNextTrainLeavesAt(@Transform(JodaLocalTimeConverter.class) LocalTime startTime, String line) {
		throw new PendingException();
	}
	
	@Gdy("zapytam o godzinę przyjazdu")
	public void whenIAskForArrivalTime() {
		throw new PendingException();
	}
	
	@Wtedy("powinienem uzyskać następujący szacowany czas przyjazdu: (.*)$")
	public void thenArrivalTimeShouldBe(@Transform(JodaLocalTimeConverter.class) LocalTime arrivalTime) {
		throw new PendingException();
	}
	
}
