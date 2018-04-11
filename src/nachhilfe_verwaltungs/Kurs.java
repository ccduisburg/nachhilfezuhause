package nachhilfe_verwaltungs;

import nachhilfe_verwaltungs.Person;
import nachhilfe_verwaltungs.Lehre;
import nachhilfe_verwaltungs.Student;
import java.util.Date;
import java.time.LocalDate;

public class Kurs {

    private int kursId;
    private String kursName;
    private boolean gekundigt;
    private LocalDate anmeldeDatum;

    
    
    public Kurs(){}
    public Kurs(int kursId, String kursName, boolean gekundigt, LocalDate anmeldeDatum) {
        this.kursId = kursId;
        this.kursName = kursName;
        this.gekundigt = gekundigt;
        this.anmeldeDatum = anmeldeDatum;
    }

    public Kurs(String kursName) {
        this.kursName=kursName;
        
    }

   

    public int getKursId() {
        return kursId;
    }

    public void setKursId(int kursId) {
        this.kursId = kursId;
    }

    public String getKursName() {
        return kursName;
    }

    public void setKursName(String kursName) {
        this.kursName = kursName;
    }
        

    public boolean getGekundigt() {
        return gekundigt;
    }

    public void setGekundigt(boolean gekundigt) {
        this.gekundigt = gekundigt;
    }

}
