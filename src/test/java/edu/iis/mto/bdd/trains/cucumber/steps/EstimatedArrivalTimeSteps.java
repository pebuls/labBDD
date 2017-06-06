package edu.iis.mto.bdd.trains.cucumber.steps;

import org.joda.time.LocalTime;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;

public class EstimatedArrivalTimeSteps {

	

	@Zakładając("^chcę się dostać z \"(.*)\" do \"(.*)\"")
	public void fromAtoB(String cityA, String cityB){
		throw new PendingException();
	}
	
	@I("^następny pociąg odjeżdża o (.*) na linii \"(.*)\"")
	public void nextTrainAt(@Transform(JodaLocalTimeConverter.class) LocalTime time, String line){
		throw new PendingException();
	}
	
	@Gdy("^zapytam o godzinę przyjazdu ")
	public void askAboutArrivalTime(){
		throw new PendingException();
	}
	
	@Wtedy("powinienem uzyskać następujący szacowany czas przyjazdu o: (.*)")
	public void getEstimatedArrivalTime(@Transform(JodaLocalTimeConverter.class) LocalTime time){
		throw new PendingException();
	}
	
	
}

