package edu.iis.mto.bdd.trains.junit;

import cucumber.api.Transform;
import edu.iis.mto.bdd.trains.cucumber.steps.JodaLocalTimeConverter;
import edu.iis.mto.bdd.trains.model.Line;
import edu.iis.mto.bdd.trains.services.TimetableService;

import java.util.ArrayList;
import java.util.List;


public class IntineraryService {
    private TimetableService timetableService;

    public IntineraryService(TimetableService timetableService) {
        this.timetableService = timetableService;
    }

    public List<org.joda.time.LocalTime> findNextDepartures(String departure, String destinantion, @Transform(JodaLocalTimeConverter.class) org.joda.time.LocalTime startTime) {
        List<Line> lines = timetableService.findLinesThrough(departure, destinantion);
        List<org.joda.time.LocalTime> timesDepartures = timetableService.findArrivalTimes(lines.get(0), destinantion);

        List<org.joda.time.LocalTime> nextDepartures = new ArrayList<>();
        for(int i = 0 ; i<timesDepartures.size(); i++){
            if(startTime.isBefore(timesDepartures.get(i))){
                nextDepartures.add(timesDepartures.get(i));
            }
        }
        return nextDepartures;
    }
}
