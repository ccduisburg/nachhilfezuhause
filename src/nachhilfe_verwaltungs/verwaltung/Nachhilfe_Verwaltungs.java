package nachhilfe_verwaltungs.verwaltung;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import nachhilfe_verwaltungs.gui.Menu;
import nachhilfe_verwaltungs.gui.MenuCall;
import nachhilfe_verwaltungs.gui.Navigation;
import nachhilfe_verwaltungs.logic.VerwaltungsService;
public class Nachhilfe_Verwaltungs {
    
    
    
        
   
    public static void main(String[] args) {
          
        VerwaltungsService vs=new VerwaltungsService();
          LocalDate today = LocalDate.now();
         Navigation nav=new Navigation(vs);
         nav.navigation();
         
        

     

    /*
        Kurs k1=new Kurs("Mathe");
        k1.anmeldung(student);
        Student s1 = new Student("cemil", "Gymnasium", "6. Klasse");
        s1.personAnmeldung(today);
        Student s2 = new Student("Jonas", "Gymnasium", "5.Klasse");

        List<Student> alleStudent = new ArrayList<Student>();

        List<Kurs> alleKurse = new ArrayList<Kurs>();
        alleKurse.add(new Kurs("Mathe"));
        alleKurse.add(new Kurs("English"));
        alleKurse.add(new Kurs("Deutsch"));

        s1.setKurs(alleKurse);
        s2.setKurs(alleKurse);
        s2.setGekundigt(true);

       // s1.KursKundigen(alleKurse.get(1));
         
        alleStudent.add(s1);
        alleStudent.add(s2);

        Scanner name = new Scanner(System.in);
        String sname = name.nextLine();
        for (Student s : alleStudent) {
            if (s.getName().equals(sname)) {
                s.setGekundigt(true);                
                alleStudent.remove(s);                
            }
        }

        /*
        Kurs []kursAnmelden= new Kurs[3];
        kursAnmelden[0]=new Kurs();
        kursAnmelden[0].setKursName("Mathe");
        kursAnmelden[1]=new Kurs();
        kursAnmelden[1].setKursName("English");
        kursAnmelden[2]=new Kurs();
        kursAnmelden[2].setKursName("Deutsch");
     */
 /* Lehre l1 = new Lehre("Ahmet", 16);
        l1.personAnmeldung(today);

        l1.setKurs(alleKurse);
        l1.showKurszumLehre();

        /*Student s1=new Student("Cemil",today,"Gesamtschule","6.klasse");
        s1.schuleAnmeldung("Cemil", today);
     */
    // s1.setKurs(kursAnmelden);
    /*  s1.showKursvonSchule();
        
        for (Student s : alleStudent) {
            if (s.getName().equals(sname)) {
                s.setGekundigt(true);                
                alleStudent.remove(s);                
            }
        
     */
}
}


