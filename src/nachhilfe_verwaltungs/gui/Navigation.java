/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* senaryo
    aktor
    - kayitci
    - admin
    - ogrenci

    eylemler
    - ogrenci kayit
    - ders kayit
    - dersläk kayit

- TODO:
- menu yapisi kurulacak
- ders kayit yapilacak
+ ogrenci kayit ekrani 
 */
package nachhilfe_verwaltungs.gui;

import java.util.Scanner;
import nachhilfe_verwaltungs.gui.MenuCall;
import nachhilfe_verwaltungs.logic.VerwaltungsService;

/**
 *
 * @author CC-Student
 */
public class Navigation {

    private Scanner scan;
    private VerwaltungsService vs;

    public Navigation(VerwaltungsService vs) {
        this.vs = vs;
        scan = new Scanner(System.in);
        navigation();
    }

    public void navigation() {
        MenuCall m = new MenuCall(vs);

        switch (m.mainmenuCall()) { // ilk basta ana menu cagirilir
            case 1: {// Student Verwaltung
                switch (m.callStudentVerwaltungMenu()) {
                    case 1: {// Für neue die Student Anmeldung
                        m.studentAnmeldung();
                        break;
                    }
                    case 2: {// Für neue die Kurs Anmeldung
                        m.kursAnmeldungfurStudent();
                        break;
                    }
                    case 3: {//  Für Student kungigung
                        m.studentKundigung();
                        break;
                    }
                    case 4: {//  4. Für Kurs entfernen von Student

                        break;
                    }
                    // 5. Für Auflisten
                    case 5: {
                        vs.studentListe();
                        break;
                    }
                    case 10: {//Rückkehr main menü
                        m.mainmenuCall();
                        break;
                    }
                    default:
                        break;
                }
                break;//Student Verwaltungbreak-------------------- 
            }
            case 2: {// Lehre Verwaltung

                switch (m.callLehreverwaltungsmenu()) {
                    case 1: {//neu Lehre anmeldung

                        m.lehreAnmeldung();
                        break;
                    }
                    case 2: {//Für den Kurs registrieren

                        break;
                    }
                    case 3: {//Lehre Kündigung
                        m.lehreKundigung();
                        break;
                    }

                    case 4: {//   Für Kurs entfernen von Lehre

                        break;
                    }
                    case 10: {//Rückkehr main menü
                        m.mainmenuCall();
                        break;
                    }
                    default:
                        break;
                }
                //menuCall()
                break;//Lehre Verwaltungs break--------------------
            }
            case 3: {//3. Kurs Verwaltung

                switch (m.callKursverwaltungsmenu()) {

                    case 1: {//neu Lehre anmeldung

                        m.lehreAnmeldung();
                        break;
                    }
                    case 2: {//Für den Kurs registrieren

                        break;
                    }
                    case 3: {//Lehre Kündigung
                        m.lehreKundigung();
                        break;
                    }

                    case 4: {//   Für Kurs entfernen von Lehre

                        break;
                    }
                    case 10: {//Rückkehr main menü
                        m.mainmenuCall();
                        break;
                    }
                }

                break;//3. Kurs Verwaltung break----------------------
            }
            case 4: {//Auflisten

                switch (m.callListenMenu()) {
                    case 1: {//Alle die Studenten Listen
                        vs.studentListe();
                        break;
                    }
                    case 2: {//Alle die Lehre Listen
                        vs.lehreListe();
                        break;
                    }
                    case 3: {//Alle die Kurs mit Student Listen
                        vs.kursListe();
                        break;
                    }
                    case 10: {//Rückkehr main menü
                        m.mainmenuCall();
                        break;
                    }
                    default:
                        break;
                }

                break;//Auflisten break-----------------
            }

            case 10: {
                break;
                // reader=new Scanner(System.in);
                //auswahl =reader.nextInt();
            }

            default:
                System.out.println("Invalid nummer");

        }

    }
}
