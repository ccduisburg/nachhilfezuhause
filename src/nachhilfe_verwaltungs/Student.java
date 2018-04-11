package nachhilfe_verwaltungs;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import nachhilfe_verwaltungs.Kurs;

public class Student extends Person implements Kundigen {

    private LocalDate anmeldeDatum;
    private String schulKlasse;
    private String schulName;
    private boolean gekundigt = false;
    public List<Kurs> kurse;

    public Student(String name,String vorname,String adress, String geschlescht,String schulName, String schulKlasse) {
        
      
        super(name,vorname,adress,geschlescht);
        this.schulName = schulName;
        this.schulKlasse = schulKlasse;
    }
      
    public Student(){}
    
    public Student(String name, String schulName,String schulKlasse){
        super(name);                
        this.schulName = schulName;
        this.schulKlasse = schulKlasse;
    }

    public String getSchulKlasse() {
        return schulKlasse;
    }

    public void setSchulKlasse(String SchulKlasse) {
        this.schulKlasse = SchulKlasse;
    }

    public String getSchulName() {
        return schulName;
    }

    public void setSchulName(String SchulName) {
        this.schulName = SchulName;
    }

    @Override
    public boolean getGekundigt() {
        return gekundigt;
    }

    @Override
    public void setGekundigt(boolean gekundigt) {
        this.gekundigt = gekundigt;
        this.kurse=null;
    }

    @Override
    public void personAnmeldung(LocalDate anmeldeDatum) {
      
        this.anmeldeDatum = anmeldeDatum;
        gekundigt = false;
       }
    
    @Override
    public String toString(){
    return this.name;
    
    }
    public void setKurs(List<Kurs> kurse){
     this.kurse=kurse;  
     
    }
   public List<Kurs> getKurs() {
        return kurse;
    }
   
   public void KursKundigen(Kurs kurs){   
   this.kurse.remove(kurs);
   }
   
   public void showKursvonSchule(){
       System.out.println("Student Name: "+getName().toString());       
       System.out.println("Schul Name: "+getSchulName().toString());
       System.out.println("Klasse Name: "+getSchulKlasse().toString());
       for (Kurs K: kurse) {
           
       System.out.println("Kurs Name: "+K.getKursName().toString());
      
   
   }
       
   }
}
