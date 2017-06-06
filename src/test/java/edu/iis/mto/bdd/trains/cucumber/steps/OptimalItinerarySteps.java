package edu.iis.mto.bdd.trains.cucumber.steps;

import com.google.common.collect.ImmutableList;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;
import edu.iis.mto.bdd.trains.model.Line;
import edu.iis.mto.bdd.trains.services.TimetableServiceImpl;
import org.joda.time.LocalTime;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class OptimalItinerarySteps {
    private TimetableServiceImpl timetableService;
    private List<LocalTime> times;

    @Zakładając("^pociągi linii \"(.*)\" z \"(.*)\" odjeżdżają ze stacji \"(.*)\" do \"(.*)\" o$")
    public void givenArrivingTrains(String line, String lineStart, String departure, String destination,
            @Transform(JodaLocalTimeConverter.class) List<LocalTime> departureTimes) {

        List<LocalTime> givenDepartureTimes;
        Line lineObject = Line.named(line).departingFrom(lineStart).withStations(departure, destination);
        givenDepartureTimes = departureTimes;
        List<Line> lines = ImmutableList.of(lineObject);

        timetableService = new TimetableServiceImpl(lines, givenDepartureTimes);
    }

    @Gdy("^chcę podróżować z \"([^\"]*)\" do \"([^\"]*)\" o (.*)$")
    public void whenIWantToTravel(String departure, String destination,
            @Transform(JodaLocalTimeConverter.class) LocalTime startTime) {
        times = timetableService.findDeparturesTime(departure,destination,startTime);
    }

    @Wtedy("^powinienem uzyskać informację o pociągach o:$")
    public void shouldBeInformedAbout(@Transform(JodaLocalTimeConverter.class) List<LocalTime> expectedTrainTimes) {
        assertThat( times.size(), is(equalTo(expectedTrainTimes.size())));
        assertThat(times.get(0), is(expectedTrainTimes.get(0)));
        assertThat(times.get(1), is(expectedTrainTimes.get(1)));
        assertThat(times.get(2), is(expectedTrainTimes.get(2)));
    }
}
