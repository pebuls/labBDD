package edu.iis.mto.bdd.trains.cucumber.steps;

import java.util.List;

import org.joda.time.LocalTime;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;


public class NextLeavingTrainSteps {
    //chcę się dostać z "Parramatta" do "TownHall". I następny pociąg odjeżdża o 8:02 na linii "Western"
    @Zakładając("^chcę się dostać z \"(.*)\" do \"(.*)\" I następny pociąg odjeżdża o $ na linii \"(.*)\" ")
    public void givenTrains(String lineStart, String lineEnd, 
            @Transform(JodaLocalTimeConverter.class) List<LocalTime> departureTimes, String line) {
        throw new PendingException();

    }
//  Gdy zapytam o godzinę przyjazdu

    @Gdy("^zapytam o godzinę przyjazdu")
    public void whenIAskAboutNextDepartureTime() {
        throw new PendingException();
    }
//  Wtedy powinienem uzyskać następujący szacowany czas przyjazdu: 8:29
    @Wtedy("^Wtedy powinienem uzyskać następujący szacowany czas przyjazdu o: $")
    public void shouldBeInformedAbout(@Transform(JodaLocalTimeConverter.class) List<LocalTime> expectedTrainTime) {
        throw new PendingException();
    }

}
