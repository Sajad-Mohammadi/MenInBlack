/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meninblack;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Sajjad
 */
public class AndraAlienInfo extends javax.swing.JFrame {

    private static InfDB idb;
    private int sida = 1;

    /**
     * Creates new form AndraAlienInfo
     */
    public AndraAlienInfo(InfDB idb) {
        initComponents();
        this.idb = idb;
        gorFetchColumn("namn", "Alien", cbValjAlien);
        gorFetchColumn("Plats_ID", "Plats", cbPlats);
        gorFetchColumn("Agent_ID", "Agent", cbAnsvarigAgent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        cbValjAlien = new javax.swing.JComboBox<>();
        tabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbPlats = new javax.swing.JComboBox<>();
        txtLosenord = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        cbAnsvarigAgent = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbRas = new javax.swing.JComboBox<>();
        txtRasDetalj = new javax.swing.JTextField();
        btnNasta = new javax.swing.JButton();
        btnSpara = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 470));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbValjAlien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "välj" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(cbValjAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(cbValjAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, 97));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Namn:");

        txtNamn.setMinimumSize(new java.awt.Dimension(64, 30));
        txtNamn.setPreferredSize(new java.awt.Dimension(64, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Lösenord:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Telefon:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Plats:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ansvarig Agent:");

        cbPlats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "välj" }));
        cbPlats.setMinimumSize(new java.awt.Dimension(72, 30));
        cbPlats.setPreferredSize(new java.awt.Dimension(72, 30));

        txtLosenord.setMinimumSize(new java.awt.Dimension(64, 30));
        txtLosenord.setPreferredSize(new java.awt.Dimension(64, 30));

        txtTelefon.setMinimumSize(new java.awt.Dimension(64, 30));
        txtTelefon.setPreferredSize(new java.awt.Dimension(64, 30));

        cbAnsvarigAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "välj" }));
        cbAnsvarigAgent.setMinimumSize(new java.awt.Dimension(72, 30));
        cbAnsvarigAgent.setPreferredSize(new java.awt.Dimension(72, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tabbedPane.addTab("tab1", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("tyuio:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Ras:");

        cbRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "välj", "Squid", "Worm", "Boglodite" }));
        cbRas.setMinimumSize(new java.awt.Dimension(72, 30));
        cbRas.setPreferredSize(new java.awt.Dimension(72, 30));
        cbRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRasActionPerformed(evt);
            }
        });

        txtRasDetalj.setMinimumSize(new java.awt.Dimension(64, 30));
        txtRasDetalj.setPreferredSize(new java.awt.Dimension(64, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRasDetalj, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRasDetalj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        tabbedPane.addTab("tab1", jPanel2);

        getContentPane().add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 74, -1, 290));

        btnNasta.setText("Nästa");
        btnNasta.setActionCommand("Nästa");
        btnNasta.setPreferredSize(new java.awt.Dimension(75, 30));
        btnNasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNastaActionPerformed(evt);
            }
        });
        getContentPane().add(btnNasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 130, -1));

        btnSpara.setText("Spara ändringar");
        btnSpara.setEnabled(false);
        btnSpara.setPreferredSize(new java.awt.Dimension(75, 30));
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSpara, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 390, 130, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNastaActionPerformed

        if (sida == 1) {
            tabbedPane.setSelectedIndex(1);
            btnNasta.setText("Tillbaka");
            btnSpara.setEnabled(true);
            sida = 2;
        } else {
            tabbedPane.setSelectedIndex(0);
            btnNasta.setText("Nästa");
            btnSpara.setEnabled(false);
            sida = 1;
        }
    }//GEN-LAST:event_btnNastaActionPerformed

    private void cbRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRasActionPerformed

    }//GEN-LAST:event_cbRasActionPerformed

    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
        String alien = "";

        if (cbValjAlien.getSelectedIndex() > 0) {
            alien = cbValjAlien.getSelectedItem().toString();

            String sqlQuery = "update Alien set ";

            if (!(txtNamn.getText().isEmpty())) {
                String namn = txtNamn.getText();
                sqlQuery = sqlQuery + "Namn = '" + namn + "'";
            } else {
                sqlQuery = sqlQuery + "Namn = '" + alien + "'";
            }
            if (!(txtLosenord.getText().isEmpty())) {
                String losenord = txtLosenord.getText();
                sqlQuery = sqlQuery + ", Losenord = '" + losenord + "'";
            }
            if (!(txtTelefon.getText().isEmpty())) {
                String telefon = txtTelefon.getText();
                sqlQuery = sqlQuery + ", Telefon = '" + telefon + "'";
            }
            if (cbPlats.getSelectedIndex() > 0) {
                String plats = cbPlats.getSelectedItem().toString();
                sqlQuery = sqlQuery + ", Plats = '" + plats + "'";
            }
            if (cbAnsvarigAgent.getSelectedIndex() > 0) {
                String ansvarigAgent = cbAnsvarigAgent.getSelectedItem().toString();
                sqlQuery = sqlQuery + ", Ansvarig_Agent = '" + ansvarigAgent + "'";
            } else {
                try {
                    String ansvarigAgent = idb.fetchSingle("SELECT Ansvarig_Agent FROM alien where namn='" + alien + "'");
                    sqlQuery = sqlQuery + ", Ansvarig_Agent = '" + ansvarigAgent + "'";
                } catch (InfException ex) {
                    JOptionPane.showMessageDialog(null, "Databasfel!");
                    System.out.println(ex.getMessage());
                }

            }

            sqlQuery = sqlQuery + " where namn='" + alien + "'";
            System.out.println(sqlQuery);

            if (cbRas.getSelectedIndex() > 0) {
                String nuvarandeID = "";
                try {
                    nuvarandeID = idb.fetchSingle("SELECT Alien_ID FROM alien where namn='" + alien + "'");
                } catch (InfException ex) {
                    JOptionPane.showMessageDialog(null, "Databasfel!");
                    System.out.println(ex.getMessage());
                }

                try {
                    idb.delete("Delete from Boglodite where Alien_ID=(select Alien_ID from Alien where namn='" + alien + "')");
                    idb.delete("Delete from Squid where Alien_ID=(select Alien_ID from Alien where namn='" + alien + "')");
                    idb.delete("Delete from Worm where Alien_ID=(select Alien_ID from Alien where namn='" + alien + "')");
                } catch (InfException ex) {
                    JOptionPane.showMessageDialog(null, "Databasfel! delete");
                    System.out.println(ex.getMessage());
                }

                switch (cbRas.getSelectedIndex()) {
                    case 1:
                        try {
                        idb.insert("insert into Squid VALUES(" + nuvarandeID + "," + txtRasDetalj.getText() + ")");
                    } catch (InfException ex) {
                        JOptionPane.showMessageDialog(null, "Databasfel! insert squid");
                        System.out.println(ex.getMessage());
                    }
                    break;
                    case 2:
                        try {
                        idb.insert("insert into Worm VALUES(" + nuvarandeID + ")");
                    } catch (InfException ex) {
                        JOptionPane.showMessageDialog(null, "Databasfel! insert worm");
                        System.out.println(ex.getMessage());
                    }
                    break;
                    case 3:
                        try {
                        idb.insert("insert into Boglodite VALUES(" + nuvarandeID + "," + txtRasDetalj.getText() + ")");
                    } catch (InfException ex) {
                        JOptionPane.showMessageDialog(null, "Databasfel! insert boglodite");
                        System.out.println(ex.getMessage());
                    }
                    break;
                    default:
                        break;
                }
            }

            try {
                idb.update(sqlQuery);
                JOptionPane.showMessageDialog(null, "Ändringar har sparats");
            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Databasfel! update");
                System.out.println(ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Du måste först välja vems information du vill ändra");
        }
    }//GEN-LAST:event_btnSparaActionPerformed

    private void gorFetchColumn(String kolumn, String tabel, JComboBox comboBox) {
        ArrayList<String> allaAlternativ;
        String fraga = "Select " + kolumn + " from " + tabel;

        try {
            allaAlternativ = idb.fetchColumn(fraga);
            for (String alternativ : allaAlternativ) {
                comboBox.addItem(alternativ);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("////" + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNasta;
    private javax.swing.JButton btnSpara;
    private javax.swing.JComboBox<String> cbAnsvarigAgent;
    private javax.swing.JComboBox<String> cbPlats;
    private javax.swing.JComboBox<String> cbRas;
    private javax.swing.JComboBox<String> cbValjAlien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField txtLosenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtRasDetalj;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
