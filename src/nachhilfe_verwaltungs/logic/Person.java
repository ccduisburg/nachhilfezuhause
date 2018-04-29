package nachhilfe_verwaltungs.logic;

import java.time.LocalDate;
import java.util.Date;

public abstract class Person {

    protected String name;
    protected String vorname;
    protected String adress;
    protected String email;
    protected String geburstort;
    protected String geburstdate;
    protected String geschlescht;
    //private LocalDate anmeldeDatum;
  //  private int dauerMonate;

    public abstract void personAnmeldung(LocalDate anmeldeDatum);

    public Person(){}
 
    public Person(String name, String vorname, String adress, String email, String geburstort,String Geburstdate, String geschlescht)
  {
     this.name=name;
     this.vorname=vorname;
     this.adress=adress;
     this.email=email;
     this.geburstort=geburstort;
     this.geburstdate=geburstdate;
     this.geschlescht=geschlescht;
  }
   public Person(String name, String vorname, String adress, String geschlescht)
  {
     this.name=name;
     this.vorname=vorname;
     this.adress=adress;  
     this.geschlescht=geschlescht;
  }
   public Person(String name)
  {
     this.name=name;
    
  }
   /*
    public Date getAnmeldeDatum() {
        return anmeldeDatum;
    }

    public void setAnmeldeDatum(Date anmeldeDatum) {
        this.anmeldeDatum = anmeldeDatum;
    }
*/
   /* public int getDauerMonate() {
        return dauerMonate;
    }

    public void setDauerMonate(int dauerMonate) {
        this.dauerMonate = dauerMonate;
    }
*/
    //Methoden
    public void setName(String personName) {//public void setName(String name)
        personName = personName;
        name = personName;
    }

    public void setVorname(String personVorname) {//public void setName(String name)

        vorname = personVorname;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGeburstort() {
        return geburstort;
    }

    public void setGeburstort(String geburstort) {
        this.geburstort = geburstort;
    }
/*
    public Date getGeburstdate() {
        return geburstdate;
    }

    public void setGeburstdate(Date geburstdate) {
        this.geburstdate = geburstdate;
    }
*/
    public String getGeschlescht() {
        return geschlescht;
    }

    public void setGeschlescht(String geschlescht) {
        this.geschlescht = geschlescht;
    }

}
