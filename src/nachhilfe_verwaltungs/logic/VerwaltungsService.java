/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nachhilfe_verwaltungs.logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CC-Student
 */
public class VerwaltungsService {

    List<Lehre> l1 = new ArrayList<>();
    List<Student> s1 = new ArrayList<>();
    List<Kurs> k1 = new ArrayList<>();

    public void neuLehre(Lehre l) {
        l1.add(l);

    }

    public void neuStudent(Student s) {
        s1.add(s);

    }

    public void neuKurs(Kurs k) {
        k1.add(k);

    }

    public void studentListe(){
    
    for(Student s:s1){
        System.out.println(" "+s.getName()+" "+s.getVorname()+" "+s.getSchulName()+" "+s.getSchulKlasse()+" "+s.getKurs());
        
    }    
    }
    public void lehreListe(){
    
    for(Lehre l:l1){
        System.out.println(" "+l.getName()+" "+l.getVorname()+" "+l.getKurs());
        
    }    
    }
    public void kursListe(){
    
    for(Kurs k:k1){
        System.out.println(" "+k.getKursName());
        
    }    
    }
    
    public void studentKundigung(Student s){
      s.setGekundigt(true);
    }
    
    public void lehreKundigung(Lehre l){
      l.setGekundigt(true);
    }
    public void kursKundigung(Kurs k){
      k.setGekundigt(true);
    }
    /*
    public void kurszumStudent(Kurs k1, Student st1) {
          for (Kurs k : k1) {
            if (k.equals(kname)) {
                k.anmeldung(student);
            }

        }
    }*/
    
    public void SetKurszumLehre(Lehre l)
    {
        l.setKurs(k1);
  
    }
}
