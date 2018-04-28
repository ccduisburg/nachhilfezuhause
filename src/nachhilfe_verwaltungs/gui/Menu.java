package nachhilfe_verwaltungs.gui;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public ArrayList<String> attribute;
    public String ramen;

    public void setRamen(String ramen) {
        this.ramen = ramen;
    }

    public String getRamen() {
        return ramen;
        
    }

    public ArrayList<String> getAttribute() {
        return attribute;
    }

    public void set(ArrayList<String> attribute) {
        this.attribute = attribute;

    }
    public void drawmenu(){
        String fr=" ";
    for(int i=0;i<75;i++){
       System.out.print(getRamen()); 
    }
       
   System.out.println(fr);
    
    for (String K: attribute) {
       
       System.out.println(); 
       System.out.print(getRamen()+fr+K.toString());
       for (int i=0;i<73-K.length();i++){
       System.out.print(fr); 
       }
       System.out.print(getRamen()); 
       System.out.println();
   }
     for(int i=0;i<75;i++){
       System.out.print(getRamen()); 
    }
      System.out.println();
    }

}
