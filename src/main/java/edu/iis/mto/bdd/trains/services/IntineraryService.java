package edu.iis.mto.bdd.trains.services;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalTime;

import cucumber.api.Transform;
import edu.iis.mto.bdd.trains.cucumber.steps.JodaLocalTimeConverter;
import edu.iis.mto.bdd.trains.model.Line;

public class IntineraryService {
	
	private TimetableService timetableService;
	
	private final int DEFAULT_NEXT_DEPARTURES_SIZE = 3;
	
	public IntineraryService(TimetableService timetableService) {
		this.timetableService = timetableService;
	}
	
	public List<LocalTime> findNextDepartures(String departure, String destination,
            @Transform(JodaLocalTimeConverter.class) LocalTime startTime) {
		
		int numberOfDepartures = 0;
		List<Line> lines = timetableService.findLinesThrough(departure, destination);
		List<LocalTime> allDepartures = timetableService.findArrivalTimes(lines.get(0), destination);
		
		List<LocalTime> nextDepartures = new ArrayList<LocalTime>();
		for (LocalTime time : allDepartures) {
			if (numberOfDepartures == DEFAULT_NEXT_DEPARTURES_SIZE) 
				break;
			if (time.isAfter(startTime)) {
				nextDepartures.add(time);
				numberOfDepartures++;
			}
		}
		
		return nextDepartures;
	}
}
