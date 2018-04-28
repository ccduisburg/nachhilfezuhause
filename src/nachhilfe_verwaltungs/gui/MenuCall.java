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
    private VerwaltungsService vs;

    public MenuCall(VerwaltungsService vs) {
        this.vs = vs;

    }

    public void mainmenuCall(int wahl) {
        if (wahl != 10) {
            System.out.println("Invalid number");
        } else {
            //  switch (wahl) {

            //  case 10: {
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
            //-------- ------------------------------------------------
            //  break;
            //  }
            // default: {

            // System.out.println("Invalid number");
            // break;
            // }
            //}
        }
    }

    public void submenuCall(int wahl) {
        switch (wahl) {
            case 1: {
                System.out.println("Wilkommen Studentverwaltungsmenu!!");
                ArrayList studentMenuAttr = new ArrayList<>();
                studentMenuAttr.add("1. Für neue die Student Anmeldung");
                studentMenuAttr.add("2. Für den Kurs registrieren");
                studentMenuAttr.add("3. Für Student kungigung");
                studentMenuAttr.add("4. Für Kurs entfernen von Student");
                studentMenuAttr.add("5. Für Auflisten");
                studentMenuAttr.add("10. Rückker zum Main Menü");
                Menu m1 = new Menu();
                m1.set(studentMenuAttr);
                m1.setRamen("*");
                m1.drawmenu();
                Scanner reader = new Scanner(System.in);
                System.out.println("Bitte ihren Wunsch eingeben...:");
                //---------------------------------
                int wahl12 = reader.nextInt();
                switch (wahl12) {

                    case 1: {

                       // Scanner reader2 = new Scanner(System.in);
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

                        vs.neuStudent(st1);
                    }
                    break;
                    
                    
                    case 2: {

                        Scanner reader2 = new Scanner(System.in);
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
                        
                        for(KursEnum k1: KursEnum.values()){
                            System.out.print(k1+" ");
                        
                        }
                        System.out.println("");
                        System.out.println("Bitte geben Sie neu Kurs Name...:");
                        String stKursInpt = reader.next();
                        
                        Kurs k1 =new Kurs();
                        k1.setKursName(stKursInpt);
                        st1.addKurs(k1);
                      
                     //  vs.kurszumStudent(k1, st1);
                        //                         kurswahlen(Gymnasium,Mathe,5)
                        vs.neuStudent(st1);
                        st1.showKursvonSchule();
                        
                    }
                    break;
                    
                    
                  default:
                   System.out.println("Invalin number ..");
                    break;
                }
            
           
            }
            case 2: {
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
                ////-------
                Scanner reader = new Scanner(System.in);
                System.out.println("Bitte geben Sie neu Lehre Name...:");
                String lhr = reader.next();
                System.out.println("Bitte geben Sie lohn...:");
                double lohn = reader.nextDouble();
                Lehre l1 = new Lehre(lhr, lohn);
                vs.neuLehre(l1);

                break;
            }
            case 3: {
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

                // ---------------
                System.out.println("Bitte geben Sie neu Kursname...:");
                Scanner reader = new Scanner(System.in);
                String krsNameInpt = reader.next();
                Kurs krs1 = new Kurs();
                krs1.setKursName(krsNameInpt);

                break;

            }

           // case 10: {
               // mainmenuCall(10);
           // }
            //System.out.println("Invalid month number");
            default: {

                System.out.println("Invalid number");
                submenuCall(wahl);
            }

        }

    }

}
