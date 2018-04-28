
package nachhilfe_verwaltungs.logic;

import nachhilfe_verwaltungs.logic.Person;
import java.time.LocalDate;


public class FestangestelltePerson extends Person implements Kundigen {

    private LocalDate anmeldeDatum;
    private String steuerNummer;
    private Double stundenLohn;
    private double arbeitszeitinWoche;
    private boolean gekundigt = false;    
    
    
    public LocalDate getAnmeldeDatum() {
        return anmeldeDatum;
    }

    public void setAnmeldeDatum(LocalDate anmeldeDatum) {
        this.anmeldeDatum = anmeldeDatum;
    }

    public String getSteuerNummer() {
        return steuerNummer;
    }

    public void setSteuerNummer(String steuerNummer) {
        this.steuerNummer = steuerNummer;
    }

    public Double getStundenLohn() {
        return stundenLohn;
    }

    public void setStundenLohn(Double stundenLohn) {
        this.stundenLohn = stundenLohn;
    }

    public double getArbeitszeitinWoche() {
        return arbeitszeitinWoche;
    }

    public void setArbeitszeitinWoche(double arbeitszeitinWoche) {
        this.arbeitszeitinWoche = arbeitszeitinWoche;
    }

 @Override
    public boolean getGekundigt() {
        return gekundigt;
    }

    @Override
    public void setGekundigt(boolean gekundigt) {
        this.gekundigt = gekundigt;
    }
    
   
  @Override
    public void personAnmeldung(LocalDate anmeldeDatum) {

        this.setAnmeldeDatum(anmeldeDatum);
        setGekundigt(false);
    }
}
