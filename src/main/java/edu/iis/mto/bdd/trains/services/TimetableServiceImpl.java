package edu.iis.mto.bdd.trains.services;

import com.google.common.collect.Lists;
import cucumber.api.Transform;
import edu.iis.mto.bdd.trains.model.JodaLocalTimeConverter;
import edu.iis.mto.bdd.trains.model.Line;
import org.joda.time.LocalTime;

import java.util.ArrayList;
import java.util.List;

public class TimetableServiceImpl implements TimetableService {

    public TimetableServiceImpl(List<Line> lines, List<LocalTime> departureTimes) {
        this.lines = lines;
        this.departureTimes = departureTimes;
    }

    private List<Line> lines;
    // All trains leave the depots at the same time.
    private List<LocalTime> departureTimes;

    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    public List<LocalTime> getDepartureTimes() {
        return departureTimes;
    }

    public void setDepartureTimes(List<LocalTime> departureTimes) {
        this.departureTimes = departureTimes;
    }

    @Override
    public List<LocalTime> findArrivalTimes(Line line, String targetStation) {
        Line targetLine = lineMatching(line);
        int timeTaken = 0;
        for (String station : targetLine.getStations()) {
            if (station.equals(targetStation)) {
                break;
            }
            timeTaken += 5;
        }
        List<LocalTime> arrivalTimes = Lists.newArrayList();
        for (LocalTime time : departureTimes) {
            arrivalTimes.add(time.plusMinutes(timeTaken));
        }
        return arrivalTimes;
    }

    private Line lineMatching(Line requestedLine) {
        for (Line line : lines) {
            if (line.equals(requestedLine)) {
                return line;
            }
        }
        return null;
    }

    @Override
    public List<Line> findLinesThrough(String departure, String destination) {
        // return ImmutableList.of(lines.get(0));
        List<Line> resultLines = new ArrayList<>();
        for (Line line : lines) {
            if (line.getStations().contains(departure) && line.getStations().contains(destination)) {
                if (line.getStations().indexOf(destination) > line.getStations().indexOf(departure)) {
                    resultLines.add(line);
                }
            }
        }
        return resultLines;
    }

    @Override
    public void scheduleArrivalTime(String line, LocalTime departureTime) {
        // To change body of created methods use File | Settings | File Templates.
    }

    @Override
    public LocalTime getArrivalTime(String travellingOnLine, String destination) {
        // TODO: Call the back-end service to retrieve this data
        return null;
    }

    public List<LocalTime> findDeparturesTime(String departure, String destination,
                                              @Transform(JodaLocalTimeConverter.class) LocalTime startTime) {

        List<LocalTime> departuresTime = new ArrayList<>();
        for (LocalTime time : departureTimes) {
            if (time.isAfter(startTime) && time.isBefore(startTime.plusMinutes(15))) {
                departuresTime.add(time);
            }
        }

        return departuresTime;
    }


}
