/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nachhilfe_verwaltungs.gui;

import java.util.ArrayList;
import java.util.Scanner;
import nachhilfe_verwaltungs.logic.Kurs;
import nachhilfe_verwaltungs.logic.KursEnum;
import nachhilfe_verwaltungs.logic.Lehre;
import nachhilfe_verwaltungs.logic.Student;
import nachhilfe_verwaltungs.logic.VerwaltungsService;

/**
 *
 * @author CC-Student
 */
public class MenuCall {

    int wahl;
    Scanner reader = new Scanner(System.in);
    private VerwaltungsService vs;

    public MenuCall(VerwaltungsService vs) {
        this.vs = vs;

    }
//-------------Alle menu -------------------------
    public int mainmenuCall() {//Main menu erstellung

        System.out.println("Wilkommen Nachhilfe Verwaltungsprogram!!");
        ArrayList mainMenuAttr = new ArrayList<>();
        mainMenuAttr.add("1. Student Verwaltung");
        mainMenuAttr.add("2. Lehre Verwaltung");
        mainMenuAttr.add("3. Kurs Verwaltung");
        mainMenuAttr.add("4. Auflisten");
        mainMenuAttr.add("10. Exit");
        Menu m = new Menu();
        m.set(mainMenuAttr);
        m.setRamen("*");
        m.drawmenu();
        System.out.println("Bitte geben Sie ihren wunsch ein..:");

        return reader.nextInt();

    }

  
    public int callStudentVerwaltungMenu() {//Studentverwltungsmenu erstellung
        System.out.println("Wilkommen Studentverwaltungsmenu!!");
        ArrayList studentMenuAttr = new ArrayList<>();
        studentMenuAttr.add("1. Für neue die Student Anmeldung");
        studentMenuAttr.add("2. Für Anmeldung der Kurse für Studenten");
        studentMenuAttr.add("3. Für Student kungigung");
        studentMenuAttr.add("4. Für Kurs entfernen von Student");
        studentMenuAttr.add("5. Für Auflisten");
        studentMenuAttr.add("10. Rückker zum Main Menü");
        Menu m1 = new Menu();
        m1.set(studentMenuAttr);
        m1.setRamen("*");
        m1.drawmenu();

        System.out.println("Bitte Ihren Wunsch eingeben...:");
        return reader.nextInt();
    }

   
    
     public int callLehreverwaltungsmenu() {

        System.out.println("Wilkommen Lehreverwaltungsmenu!!");
        ArrayList lehreMenuAttr = new ArrayList<>();
        lehreMenuAttr.add("1. Für neue die Lehre Anmeldung");
        lehreMenuAttr.add("2. Für den Kurs registrieren");
        lehreMenuAttr.add("3. Für dei Lehre kungigung");
        lehreMenuAttr.add("4. Für Kurs entfernen von Lehre");
        lehreMenuAttr.add("5. Für Auflisten");
        lehreMenuAttr.add("10. Rückker zum Main Menü");
        Menu m1 = new Menu();
        m1.set(lehreMenuAttr);
        m1.setRamen("*");
        m1.drawmenu();
        System.out.println("Bitte ihren Wunsch eingeben...:");

        return reader.nextInt();
        ////-------
    }
      public int callKursverwaltungsmenu() {
        System.out.println("Wilkommen Kursverwaltungsmenu!!");
        ArrayList kursMenuAttr = new ArrayList<>();
        kursMenuAttr.add("1. Für neue die Kurs Erstellung");
        kursMenuAttr.add("2. Für den Kurs registrieren");
        kursMenuAttr.add("3. Für die Kurs entwernung");
        kursMenuAttr.add("4. Für Auflisten");
        kursMenuAttr.add("10. Rückker zum Main Menü");
        Menu m1 = new Menu();
        m1.set(kursMenuAttr);
        m1.setRamen("*");
        m1.drawmenu();
        System.out.println("Bitte ihren Wunsch eingeben...:");
        return reader.nextInt();
    }
      public int callListenMenu() {
        System.out.println("Wilkommen Listmenu!!");
        ArrayList listMenuAttr = new ArrayList<>();
        listMenuAttr.add("1. Für die Studen Liste");
        listMenuAttr.add("2. Für die Lehre Liste");
        listMenuAttr.add("3. Für die Student mit Kursliste");
        listMenuAttr.add("10. Rückker zum Main Menü");
        Menu m1 = new Menu();
        m1.set(listMenuAttr);
        m1.setRamen("*");
        m1.drawmenu();
        System.out.println("Bitte ihren Wunsch eingeben...:");

        System.out.println("Bitte geben Sie neu Kursname...:");

        Scanner reader = new Scanner(System.in);

        String krsNameInpt = reader.next();
        Kurs krs1 = new Kurs();
        krs1.setKursName(krsNameInpt);
        return reader.nextInt();
    }
 //  ----------------Anmeldungs----------------------
      public void studentAnmeldung() {//Student anmeldung (Ögrenci kayidi yapan method)
        int exitwahl = 1;
        while (exitwahl != 0) {

            System.out.println("Bitte geben Sie neu Student vorname...:");
            String stvorNameInpt = reader.next();
            Student st1 = new Student();
            st1.setName(stvorNameInpt);
            System.out.println("Bitte geben Sie neu Student name...:");
            String stNameInpt = reader.next();
            st1.setVorname(stNameInpt);
            System.out.println("Bitte geben Sie neu Student Klasse...:");
            String stKlasseInpt = reader.next();
            st1.setSchulKlasse(stKlasseInpt);
            System.out.println("Bitte geben Sie neu Student Schul Name...:");
            String stSchulNameInpt = reader.next();
            st1.setSchulKlasse(stSchulNameInpt);
            System.out.println("Student : " + stvorNameInpt + "Nachname: " + stNameInpt + "Schule: " + stSchulNameInpt + "Klasse: " + stKlasseInpt);
            System.out.println("Wollen Sie noch eine Anmeldung machen [0:Nein/1:ja] ");
            exitwahl = reader.nextInt();
        }

    }
      public void kursAnmeldungfurStudent() {//Ögrencilere Kurs kaydi yapmak icin
        //Scanner reader2 = new Scanner(System.in);
        int exitwahl = 1;
        while (exitwahl != 0) {
            System.out.println("Bitte geben Sie neu Student Name...:");
            String stNameInpt = reader.next();

            Student st1 = new Student();
            st1.setName(stNameInpt);

            System.out.println("Bitte geben Sie neu Student vorname...:");
            String stvorNameInpt = reader.next();
            st1.setVorname(stvorNameInpt);

            System.out.println("Bitte geben Sie Klasse...:");
            String stKlasseInpt = reader.next();

            st1.setSchulKlasse(stKlasseInpt);
            System.out.println("Bitte geben Sie Schul Name...:");
            String stSchulNameInpt = reader.next();
            st1.setSchulName(stSchulNameInpt);

            for (KursEnum k1 : KursEnum.values()) {
                System.out.print(k1 + " ");

            }
            System.out.println("");
            System.out.println("Bitte geben Sie neu Kurs Name...:");
            String stKursInpt = reader.next();

            Kurs k1 = new Kurs();
            k1.setKursName(stKursInpt);
            st1.addKurs(k1);

            vs.neuStudent(st1);
            st1.showKursvonSchule();
            //vs.kurszumStudent(k1,st1);
          

            System.out.println("Wollen Sie noch eine Anmeldung machen [0:Nein/1:ja] ");
            exitwahl = reader.nextInt();

        }

    }

   

    public void lehreAnmeldung() {
        int exitwahl = 1;
        while (exitwahl != 0) {

            Scanner reader = new Scanner(System.in);
            System.out.println("Bitte geben Sie neu Lehre Name...:");
            String lhr = reader.next();
            System.out.println("Bitte geben Sie den Studenlohn...:");
            double lohn = reader.nextDouble();
            Lehre l1 = new Lehre(lhr, lohn);
            vs.neuLehre(l1);
            System.out.println("Lehre name :"+lhr+ "gewünschte stunden lohn" +lohn);
            System.out.println("Wollen Sie noch eine Anmeldung machen [0:Nein/1:ja] ");
            exitwahl = reader.nextInt();
        }
    }

   
    // ---------------

    public void Kursanmeldung() {

        int exitwahl = 1;
        while (exitwahl != 0) {

            System.out.println("Bitte geben Sie neu Kursname...:");
            Kurs krs1 = new Kurs();

            // Scanner reader = new Scanner(System.in);
            String krsNameInpt = reader.next();
            krs1.setKursName(krsNameInpt);
            vs.neuKurs(krs1);
            System.out.println("Kurs Name: "+krsNameInpt);
            System.out.println("Wollen Sie noch eine Anmeldung machen [0:Nein/1:ja] ");
            exitwahl = reader.nextInt();
        }
    }
    
    public void KursZumLehre(){
        
       int exitwahl = 1;
        while (exitwahl != 0) {

            Scanner reader = new Scanner(System.in);
            System.out.println("Bitte geben Sie neu Lehre Name...:");
            String lhr = reader.next();
            System.out.println("Bitte geben Sie den Studenlohn...:");
            double lohn = reader.nextDouble();
            Lehre l1 = new Lehre(lhr, lohn);
            vs.neuLehre(l1);
            System.out.println("Lehre name :"+lhr+ "gewünschte stunden lohn" +lohn);
            
        
        
        for (KursEnum k1 : KursEnum.values()) {
                System.out.print(k1 + " ");

            }
            System.out.println("");
            System.out.println("Bitte geben Sie neu Kurs Name...:");
            String stKursInpt = reader.next();

            Kurs k1 = new Kurs();
            k1.setKursName(stKursInpt);
            k1.setLehre(l1);
           // l1.setKurs();
           //Buraya Kurs eklenecek amacim ögretmene kurslari eklemek
            System.out.println("Wollen Sie noch eine Anmeldung machen [0:Nein/1:ja] ");
            exitwahl = reader.nextInt();

        
        
        
    vs.SetKurszumLehre(l);
    }
// Kundigung methode----------------------------
    
    public void studentKundigung() {//Ögrenci kaydi silen method
        int exitwahl = 1;
       vs.studentListe();
        while (exitwahl != 0) {

        }
    }

 public void lehreKundigung() {//ögretmen kaydi silen method
        int exitwahl = 1;
       vs.lehreListe();
        while (exitwahl != 0) {

        }
    }
 public void kursKundigung() {//kurs kaydi silen method
        int exitwahl = 1;
       vs.kursListe();
        while (exitwahl != 0) {

        }
    }



    
}
