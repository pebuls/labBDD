package edu.iis.mto.bdd.trains.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.pl.Zakładając;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.Wtedy;

public class EstimatedArrivalTime {
	@Zakładając("^chcę się dostać z \"([^\"]*)\" do \"([^\"]*)\"$")
	public void chcę_się_dostać_z_do(String ar1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
	
	@Zakładając("^następny pociąg odjeźdźa o (\\d+):(\\d+) na linii \"([^\"]*)\"$")
	public void następny_pociąg_odjeżdża_o_na_linii(int arg1, int arg2, String arg3) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
	
	@Gdy("^zapytam o godzinę przyjazdu$")
	public void zapytem_o_godzinę_przyjazdu() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
	
	@Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu: (\\d+):(\\d+)$")
	public void powinienem_uzysakać_następujący_szacowany_czas_przyjazdu(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
