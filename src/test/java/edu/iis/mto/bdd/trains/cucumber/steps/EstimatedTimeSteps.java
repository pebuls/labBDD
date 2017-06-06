package edu.iis.mto.bdd.trains.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;
import org.joda.time.LocalTime;

import java.util.List;

/**
 * Created by 194974 on 5/23/2017.
 */
public class EstimatedTimeSteps
{
    @Zakładając("^chcę się dostać z \"(.*)\" do \"(.*)\"")
    public void setupFromAndWhere(String departure, String destination) {
        throw new PendingException();
    }

    @I("^nastepny pociąg na linii \"(.*)\" odjeżdża o (.*)$")
    public void setupLineAndTime(String line,
                                 @Transform(JodaLocalTimeConverter.class) LocalTime startTime){
        throw new PendingException();
    }

    @Gdy("^gdy zapytam o godzinę przyjazdu")
    public void askForArrivalTime() {
        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu o (.*)$")
    public void shouldBeInformedAbout(@Transform(JodaLocalTimeConverter.class) LocalTime expectedTime) {
        throw new PendingException();
    }
}
