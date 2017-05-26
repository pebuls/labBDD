package edu.iis.mto.bdd.trains.cucumber.steps;

import java.util.List;

import org.hamcrest.Matchers;
import org.joda.time.LocalTime;
import org.junit.Assert;

import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;
import edu.iis.mto.bdd.trains.services.InMemoryTimetableService;
import edu.iis.mto.bdd.trains.services.IntineraryService;

public class OptimalItinerarySteps {

	private IntineraryService intineraryService;
	
    @Zakładając("^pociągi linii \"(.*)\" z \"(.*)\" odjeżdżają ze stacji \"(.*)\" do \"(.*)\" o$")
    public void givenArrivingTrains(String line, String lineStart, String departure, String destination,
            @Transform(JodaLocalTimeConverter.class) List<LocalTime> departureTimes) {
        
    	this.intineraryService = new IntineraryService(new InMemoryTimetableService());
    }

    @Gdy("^chcę podróżować z \"([^\"]*)\" do \"([^\"]*)\" o (.*)$")
    public void whenIWantToTravel(String departure, String destination,
            @Transform(JodaLocalTimeConverter.class) LocalTime startTime) {
    	
    	intineraryService.findNextDepartures(departure, destination, startTime);
    }

    @Wtedy("^powinienem uzyskać informację o pociągach o:$")
    public void shouldBeInformedAbout(@Transform(JodaLocalTimeConverter.class) List<LocalTime> expectedTrainTimes) {

    	Assert.assertThat(expectedTrainTimes.size(), Matchers.equalTo(3));
    	
    	Assert.assertThat(expectedTrainTimes.get(0), Matchers.equalTo(new LocalTime(8, 2)));
    	Assert.assertThat(expectedTrainTimes.get(1), Matchers.equalTo(new LocalTime(8, 11)));
    	Assert.assertThat(expectedTrainTimes.get(2), Matchers.equalTo(new LocalTime(8, 14)));
    }
}
