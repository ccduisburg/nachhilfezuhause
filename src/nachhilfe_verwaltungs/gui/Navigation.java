/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
         this.vs=vs;
        scan = new Scanner(System.in);
        navigation();
    }

    public void navigation() {
        
       MenuCall m = new MenuCall(vs);
        m.mainmenuCall(10);
        Scanner reader = new Scanner(System.in);
        int auswahl = reader.nextInt();
        // while(auswahl!=10){       // while(auswahl!=10){

        //  MenuCall(auswahl);          
        switch (auswahl) {

            case 1: {

                m.submenuCall(auswahl);

                reader = new Scanner(System.in);
                auswahl = reader.nextInt();
                // Student s1 = new Student("cemil", "Gymnasium", "6. Klasse");
               
                break;
            }
            case 2: {

                m.submenuCall(auswahl);
                //menuCall()

                break;
            }
            case 3: {
                m.submenuCall(auswahl);

                break;
            }
            case 4: {
                m.submenuCall(auswahl);

                break;
            }
            case 5: {
                m.submenuCall(auswahl);

                break;
            }
            case 10: {
                m.mainmenuCall(10);
                // reader=new Scanner(System.in);
                //auswahl =reader.nextInt();

                // 
            }
            default:
                System.out.println("Invalid nummer");

        }

    }
}
