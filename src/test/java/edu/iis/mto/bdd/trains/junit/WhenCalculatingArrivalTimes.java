package edu.iis.mto.bdd.trains.junit;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.joda.time.LocalTime;
import org.junit.Assert;
import org.junit.Test;

import edu.iis.mto.bdd.trains.model.Line;
import edu.iis.mto.bdd.trains.services.IntineraryService;
import edu.iis.mto.bdd.trains.services.TimetableService;

public class WhenCalculatingArrivalTimes {

	@Test
	public void findNextDepartures_startingEmuPlains_fromParramatta_toTownHall() {
		
		TimetableService mockedTimetableService = mock(TimetableService.class);
		IntineraryService intineraryService = new IntineraryService(mockedTimetableService);
		
		Line line = Line.named("Western").departingFrom("Emu Plains")
				.withStations("Emu Plains", "Parramatta", "Town Hall","North Richmond");
		List<Line> lines = new ArrayList<Line>();
		lines.add(line);
		List<LocalTime> allDepartures = new ArrayList<LocalTime>();
		allDepartures.add(new LocalTime(7, 58));
		allDepartures.add(new LocalTime(8, 0));
		allDepartures.add(new LocalTime(8, 2));
		allDepartures.add(new LocalTime(8, 11));
		allDepartures.add(new LocalTime(8, 14));
		allDepartures.add(new LocalTime(8, 21));
		allDepartures.add(new LocalTime(8, 31));
		allDepartures.add(new LocalTime(8, 36));
		
		when(mockedTimetableService.findLinesThrough("Parramatta", "Town Hall")).thenReturn(lines);
		when(mockedTimetableService.findArrivalTimes(line, "Town Hall")).thenReturn(allDepartures);

		List<LocalTime> departures = 
				intineraryService.findNextDepartures("Parramatta", "Town Hall", new LocalTime(8, 0));
		
    	Assert.assertThat(departures.size(), Matchers.equalTo(4));
    	
    	Assert.assertThat(departures.get(0), Matchers.equalTo(new LocalTime(8, 2)));
    	Assert.assertThat(departures.get(1), Matchers.equalTo(new LocalTime(8, 11)));
    	Assert.assertThat(departures.get(2), Matchers.equalTo(new LocalTime(8, 14)));
    	Assert.assertThat(departures.get(3), Matchers.equalTo(new LocalTime(8, 21)));
	}

}
