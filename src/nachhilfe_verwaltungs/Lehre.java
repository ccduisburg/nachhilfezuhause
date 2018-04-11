package nachhilfe_verwaltungs;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import nachhilfe_verwaltungs.Kundigen;

public class Lehre extends Person implements Kundigen {

    private Date beginDatum;
    private double stLohn;
    private boolean gekundigt;
    private LocalDate anmeldeDatum;
    public List<Kurs> kurse;

   public Lehre(String name, double stLohn ) {
      super(name);
      this.stLohn=stLohn;
    }

    
    public void setKurs(List<Kurs> kurse){
     this.kurse=kurse;  
     
    }
   public List<Kurs> getKurs() {
        return kurse;
    } 
     
   
    @Override
       public void personAnmeldung(LocalDate anmeldeDatum) {
        this.anmeldeDatum = anmeldeDatum;
        gekundigt = false;
    }
    public Date getBeginDatum() {
        return beginDatum;
    }

    public void setBeginDatum(Date beginDatum) {
        this.beginDatum = beginDatum;
    }

    public double getStLohn() {
        return stLohn;
    }

    public void setStLohn(double stLohn) {
        this.stLohn = stLohn;
    }

    public boolean isGekundigt() {
        return gekundigt;
    }

    @Override
    public boolean getGekundigt() {
        return gekundigt;
    }

    @Override
    public void setGekundigt(boolean gekundigt) {
        this.gekundigt = gekundigt;
    }
/*
    public void lehreAngestelen(String name, Date beginDatum) {
        this.name = name;
        this.setBeginDatum(beginDatum);
    }
*/
    
    public void KursKundigen(Kurs kurs){   
   this.kurse.remove(kurs);
   }
   
   public void showKurszumLehre(){
       System.out.println("Lehre Name: "+getName().toString());       
      
       for (Kurs K: kurse) {
           
       System.out.println("Kurs Name: "+K.getKursName().toString());
      
       }
   }
    
    
}
