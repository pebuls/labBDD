package edu.iis.mto.bdd.trains.services;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalTime;

import cucumber.api.Transform;
import edu.iis.mto.bdd.trains.cucumber.steps.JodaLocalTimeConverter;
import edu.iis.mto.bdd.trains.model.Line;

public class IntineraryService {
	
	private TimetableService timetableService;
	
	private final int MINUTES_DEPARTURE_IS_WITHIN = 30;
	
	public IntineraryService(TimetableService timetableService) {
		this.timetableService = timetableService;
	}
	
	public List<LocalTime> findNextDepartures(String departure, String destination,
            @Transform(JodaLocalTimeConverter.class) LocalTime startTime) {
		
		List<Line> lines = timetableService.findLinesThrough(departure, destination);
		List<LocalTime> allDepartures = timetableService.findArrivalTimes(lines.get(0), destination);
		
		List<LocalTime> nextDepartures = new ArrayList<LocalTime>();
		for (LocalTime time : allDepartures) {
			if (time.isAfter(startTime) && time.minusMinutes(MINUTES_DEPARTURE_IS_WITHIN).isBefore(startTime)) {
				nextDepartures.add(time);
			}
		}
		
		return nextDepartures;
	}
}
