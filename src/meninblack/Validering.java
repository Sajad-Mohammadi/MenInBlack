/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meninblack;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Sajjad
 */
public class Validering {

    public static boolean valideraDatum(String datum) {

        boolean isDatum = false;
        if (datum.length() == 8) {
            isDatum = true;
            try {
                Integer.parseInt(datum);
            } catch (NumberFormatException e) {
                System.out.println("vvvv" + e.getMessage());
                return false;
            }
        }
        if (!isDatum) {
            JOptionPane.showMessageDialog(null, "Felaktigt datumformat!");
        }
        return isDatum;
    }

    public static boolean isPSWright(InfDB idb, String tabel, String anvandare, String losenord) {
        boolean isRight = false;
        try {
            String dbLosenord = idb.fetchSingle("Select losenord from " + tabel + " where Namn='" + anvandare + "'");
            if (losenord.equals(dbLosenord)) {
                isRight = true;
            } else {
                JOptionPane.showMessageDialog(null, "Felaktigt användarnamn eller lösenord.");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel 2!");
            System.out.println(e.getMessage());
        }
        return isRight;
    }

    public static String valideraNamn(JTextField txtNamn) {
        String namn = "";
        boolean isOkej = false;
        try {
            if (txtNamn.getText().substring(0, 5).equals("agent")) {
                namn = txtNamn.getText();
                isOkej = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (!isOkej) {
            namn = "Agent " + txtNamn.getText();
        }
        
        return namn;
    }
}
