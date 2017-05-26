package edu.iis.mto.bdd.trains.services;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalTime;

import cucumber.api.Transform;
import edu.iis.mto.bdd.trains.cucumber.steps.JodaLocalTimeConverter;

public class IntineraryService {
	
	public List<LocalTime> findNextDepartures(String departure, String destination,
            @Transform(JodaLocalTimeConverter.class) LocalTime startTime) {
		
		List<LocalTime> nextDepartures = new ArrayList<LocalTime>();
		
		return nextDepartures;
	}
}
