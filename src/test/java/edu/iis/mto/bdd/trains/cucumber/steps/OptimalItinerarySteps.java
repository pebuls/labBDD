package edu.iis.mto.bdd.trains.cucumber.steps;

import java.util.List;

import com.google.common.collect.ImmutableList;
import edu.iis.mto.bdd.trains.model.Line;
import edu.iis.mto.bdd.trains.services.TimetableService;
import edu.iis.mto.bdd.trains.services.TimetableServiceImpl;
import org.joda.time.LocalTime;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;

public class OptimalItinerarySteps {
    TimetableServiceImpl timetableService;
    List<Line> lines;
    Line lineObject;

    @Zakładając("^pociągi linii \"(.*)\" z \"(.*)\" odjeżdżają ze stacji \"(.*)\" do \"(.*)\" o$")
    public void givenArrivingTrains(String line, String lineStart, String departure, String destination,
            @Transform(JodaLocalTimeConverter.class) List<LocalTime> departureTimes) {

        List<LocalTime> givenDepartureTimes;
        lineObject = Line.named(line).departingFrom(lineStart).withStations(departure, destination);
        givenDepartureTimes = departureTimes;
        List<Line> lines = ImmutableList.of(lineObject);

        timetableService = new TimetableServiceImpl(lines, givenDepartureTimes);
    }

    @Gdy("^chcę podróżować z \"([^\"]*)\" do \"([^\"]*)\" o (.*)$")
    public void whenIWantToTravel(String departure, String destination,
            @Transform(JodaLocalTimeConverter.class) LocalTime startTime) {
        List<LocalTime> times = timetableService.findArrivalTimes(lineObject, destination);
        System.out.println("Czas: " + times);
    }

    @Wtedy("^powinienem uzyskać informację o pociągach o:$")
    public void shouldBeInformedAbout(@Transform(JodaLocalTimeConverter.class) List<LocalTime> expectedTrainTimes) {
        throw new PendingException();
    }
}
