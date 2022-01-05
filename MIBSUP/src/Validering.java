
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nikla
 */
public class Validering {

    private static InfDB idb;
    
    public Validering(InfDB idb){
        this.idb = idb;
        
    }
            
    public static boolean gickDet(String vem) {
        boolean resultat = true;
        if (vem.equals("Agent")) {
            resultat = false;
        }
        return resultat;
    }
    
public static boolean kollaLosen(String losen, String gammalt, String nytt, String nyttIgen)
{
    
    boolean funkar = false; 
    if(gammalt.equals(losen) && nytt.equals(nyttIgen) && nytt != gammalt && nytt.length() <= 6){
    funkar = true;
     JOptionPane.showMessageDialog(null, "Lösenordet har bytts");
    }
    return funkar; 
}


public static boolean nyttLosen (String nyttLosen,String nyttLosenIgen, String gammalt, String losenord)
{
    boolean stammer = false;
    if(nyttLosen != nyttLosenIgen && gammalt.equals(losenord)){
      stammer = true;}
    return stammer;
}
}
