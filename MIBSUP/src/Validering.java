
import javax.swing.JComboBox;
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

    private static boolean isInteger(JTextField varde) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Validering(InfDB idb) {
        this.idb = idb;

    }

    public static boolean agentEllerAlien(String vem) {
        boolean resultat = true;
        if (vem.equals("Agent")) {
            resultat = false;
        }
        return resultat;
    }

    public static boolean arTom(JTextField texten) 
    {
        boolean sant = false;

        if (texten.getText().isEmpty()) {
            sant = true;
            JOptionPane.showMessageDialog(null, "Du kan inte lämna rutan tom");
        }
        return sant;
    }

    public static boolean langLosen(JTextField enText) 
    {
        boolean sant = false;
        if (enText.getText().length() > 6) {
            sant = true;
            JOptionPane.showMessageDialog(null, "Du har skrivit in för långt lösenord");
        }
        return sant;
    }

    public static boolean langdNamn(JTextField enText) 
    {
        boolean sant = false;
        if (enText.getText().length() > 20) {
            sant = true;
            JOptionPane.showMessageDialog(null, "Du har skrivit in för långt namn");
        }
        return sant;
    }

    public static boolean langTelefon(JTextField enText) 
    {
        boolean sant = false;
        if (enText.getText().length() > 30) {
            sant = true;
            JOptionPane.showMessageDialog(null, "Du har skrivit in för långt telefonnummer");
        }
        return sant;
    }

    public static boolean arInteger(JTextField varde)  
    {
        boolean sant = false;
        String enText = varde.getText();

        if (!enText.matches("\\d+")) {
            sant = true;
            JOptionPane.showMessageDialog(null, "Du kan bara skriva in bokstäver här");
        }

        return sant;
    }

    public static boolean kollaLosen(String losen, String gammalt, String nytt, String nyttIgen) {

        boolean funkar = false;
        if (gammalt.equals(losen) && nytt.equals(nyttIgen) && nytt != gammalt && nytt.length() <= 6) {
            funkar = true;
            JOptionPane.showMessageDialog(null, "Lösenordet har bytts");
        }
        return funkar;
    }

    public static boolean nyttLosen(String nyttLosen, String nyttLosenIgen, String gammalt, String losenord) {
        boolean stammer = false;
        if (nyttLosen != nyttLosenIgen && gammalt.equals(losenord)) {
            stammer = true;
        }
        return stammer;
    }

    public static boolean comboBox(JComboBox cbx) {
        boolean resultat = false;
        if (cbx.getSelectedIndex() == 0) {
            resultat = true;
        }
        return resultat;
    }

    public static boolean taltest(JTextField taltest) {
        boolean arTal = false;
        String idid = taltest.getText();

        if (!idid.matches("\\d+")) {
            arTal = true;
        } else {
            taltest.requestFocus();
        }
        return arTal;
    }

    public static boolean kollaDatumCheck(String datum) {
        boolean resultat = false;

        if (datum.matches("\\d{4}-\\d{2}-\\d{2}")) {
            resultat = true;
        } else {
            JOptionPane.showMessageDialog(null, "Fel datumformat, prova igen enligt 'YYYY-MM-DD'");
        }

        return resultat;
    }

}
