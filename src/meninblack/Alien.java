/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meninblack;

import java.awt.Font;
import oru.inf.InfDB;
import oru.inf.InfException;

import javax.swing.JOptionPane;
import java.util.HashMap;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Sajjad
 */
public class Alien extends javax.swing.JFrame {

    private String nuvarandeAnvandare;
    private static InfDB idb;

    /**
     * Creates new form Alien
     */
    public Alien(InfDB idb, String nuvarandeAnvandare) {

        initComponents();
        this.idb = idb;
        this.nuvarandeAnvandare = nuvarandeAnvandare;
        gorFetchRow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMinSida = new javax.swing.JPanel();
        lblNamn = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblAnstallningsdatum = new javax.swing.JLabel();
        lblAdministrator = new javax.swing.JLabel();
        lblDBTelefon = new javax.swing.JLabel();
        lblDBRegistreringsdatum = new javax.swing.JLabel();
        lblDBAnsvarigAgent = new javax.swing.JLabel();
        btnAndraLosenord = new javax.swing.JButton();
        btnLoggaUt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        lblNamn.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        lblNamn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNamn.setText("Namn");

        lblTelefon.setText("Telefon");

        lblAnstallningsdatum.setText("Registreringsdatum");

        lblAdministrator.setText("Ansvarig Agent");

        lblDBTelefon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblDBRegistreringsdatum.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblDBAnsvarigAgent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnAndraLosenord.setText("Ändra lösenord");
        btnAndraLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenordActionPerformed(evt);
            }
        });

        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        jButton1.setText("Visa områdeschef för mitt område");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMinSidaLayout = new javax.swing.GroupLayout(pnlMinSida);
        pnlMinSida.setLayout(pnlMinSidaLayout);
        pnlMinSidaLayout.setHorizontalGroup(
            pnlMinSidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMinSidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNamn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMinSidaLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(pnlMinSidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDBTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefon))
                .addGap(149, 149, 149)
                .addGroup(pnlMinSidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDBRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnstallningsdatum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMinSidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdministrator)
                    .addComponent(lblDBAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
            .addGroup(pnlMinSidaLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnAndraLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btnLoggaUt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );
        pnlMinSidaLayout.setVerticalGroup(
            pnlMinSidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMinSidaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblNamn)
                .addGap(82, 82, 82)
                .addGroup(pnlMinSidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefon)
                    .addComponent(lblAdministrator)
                    .addComponent(lblAnstallningsdatum))
                .addGap(18, 18, 18)
                .addGroup(pnlMinSidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDBRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDBAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDBTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addGroup(pnlMinSidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoggaUt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMinSida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMinSida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAndraLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenordActionPerformed
        new AndraLosenord(idb, nuvarandeAnvandare, "alien").setVisible(true);
    }//GEN-LAST:event_btnAndraLosenordActionPerformed

    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        new HuvudFonster(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLoggaUtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String omradesChef = "";
        try {
            String omradesID = idb.fetchSingle("SELECT finns_i FROM plats join alien on alien.plats=plats.plats_id where namn='" + nuvarandeAnvandare + "'");
            omradesChef = idb.fetchSingle("SELECT Namn FROM agent join omradeschef on omradeschef.Agent_id=agent.Agent_ID where omradeschef.omrade=" + omradesID);
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("****" + ex.getMessage());
        }

        JOptionPane.showMessageDialog(null, "Ditt områdeschef är: " + omradesChef, "", INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void gorFetchRow() {
        HashMap<String, String> alienInfo;
        try {
            alienInfo = idb.fetchRow("SELECT * FROM Alien where namn ='" + nuvarandeAnvandare + "'");
            String ansvarigAgent = idb.fetchSingle("SELECT Namn FROM Agent where Agent_ID =" + alienInfo.get("Ansvarig_Agent"));

            lblNamn.setText(nuvarandeAnvandare);
            lblDBTelefon.setText(alienInfo.get("Telefon"));
            lblDBRegistreringsdatum.setText(alienInfo.get("Registreringsdatum"));
            lblDBAnsvarigAgent.setText(ansvarigAgent);

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("/////////////" + ex.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraLosenord;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAdministrator;
    private javax.swing.JLabel lblAnstallningsdatum;
    private javax.swing.JLabel lblDBAnsvarigAgent;
    private javax.swing.JLabel lblDBRegistreringsdatum;
    private javax.swing.JLabel lblDBTelefon;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JPanel pnlMinSida;
    // End of variables declaration//GEN-END:variables
}
