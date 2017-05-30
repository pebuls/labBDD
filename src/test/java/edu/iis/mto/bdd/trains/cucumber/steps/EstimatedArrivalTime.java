package edu.iis.mto.bdd.trains.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;

/**
 * Created by Piotrek on 30.05.2017.
 */
public class EstimatedArrivalTime {
    @Zakładając("^chcę się dostać z \"([^\"]*)\" do \"([^\"]*)\"$")
    public void chce_się_dostać_z_do(String argument1, String argument2) throws Throwable{
        throw new PendingException();
    }

    @Zakładając("^natępny pociąg odjeżdża o (\\d+):(\\d+) na linii \"([^\"]*)\"$")
    public void następny_pociąg_odjeżdża_o_na_linii(int argument1, int argument2, String argument3) throws Throwable{
        throw new PendingException();
    }

    @Gdy("^zapytam o godzinę przyjazdu$")
    public void zapytam_o_godzinę_przyjazdu() throws Throwable{
        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać następujący szaczowany czas przyjazdu: (\\d+):(\\d+)$")
    public void powinienem_uzyskać_natępujący_czas_przyjazdu(int argument1, int argument2) throws Throwable{
        throw new PendingException();
    }
}
