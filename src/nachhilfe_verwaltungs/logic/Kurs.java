package nachhilfe_verwaltungs.logic;

import nachhilfe_verwaltungs.logic.Person;
import nachhilfe_verwaltungs.logic.Lehre;
import java.util.Date;
import java.time.LocalDate;
import java.util.List;

public class Kurs {

    private int kursId;
    private String kursName;
    private boolean gekundigt;
    private LocalDate anmeldeDatum;
    private Lehre lehre;
    private List<Student> alleStudenten;

    public Kurs() {
    }

    public Kurs(int kursId, String kursName, boolean gekundigt, LocalDate anmeldeDatum) {
        this.kursId = kursId;
        this.kursName = kursName;
        this.gekundigt = gekundigt;
        this.anmeldeDatum = anmeldeDatum;
    }

    public Kurs(String kursName) {
        this.kursName = kursName;

    }

    public void setLehre(Lehre lehre) {
        this.lehre = lehre;

    }

    public void anmeldung(Student student) {
        alleStudenten.add(student);

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
