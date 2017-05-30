package edu.iis.mto.bdd.trains.model;

import cucumber.api.Transformer;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class JodaLocalTimeConverter extends Transformer<LocalTime> {

    DateTimeFormatter FORMATTER = DateTimeFormat.forPattern("hh:mm");

    @Override
    public LocalTime transform(String timeString) {

        return FORMATTER.parseLocalTime(timeString);
    }

}
