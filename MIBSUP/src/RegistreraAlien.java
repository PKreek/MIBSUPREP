
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author noahjarvback
 */
public class RegistreraAlien extends javax.swing.JFrame {

    private static String anvandarnamn;
    private static InfDB idb;
    

    /**
     * Creates new form RegistreraAlien
     */
    public RegistreraAlien(String anvandarnamn, InfDB idb) throws InfException {
        initComponents();
        this.anvandarnamn = anvandarnamn;
        this.idb = idb;
        fillComboBox();
        txtAntalArmar.setVisible(false);
        lblAntalArmar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblRegistreraAlien = new javax.swing.JLabel();
        txtRegistreringsDatum = new javax.swing.JTextField();
        txtNamn = new javax.swing.JTextField();
        txtLosenord = new javax.swing.JTextField();
        txtTelefonNr = new javax.swing.JTextField();
        btnRegistreraAlien = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();
        lblRegistreringsDatum = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        lblTelefonNr = new javax.swing.JLabel();
        lblPlats = new javax.swing.JLabel();
        cbxStad = new javax.swing.JComboBox<>();
        cbxRas = new javax.swing.JComboBox<>();
        lblRas = new javax.swing.JLabel();
        txtAntalArmar = new javax.swing.JTextField();
        lblAntalArmar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 31, 31));

        lblRegistreraAlien.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        lblRegistreraAlien.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistreraAlien.setText("Registrera ny alien");

        txtRegistreringsDatum.setBackground(new java.awt.Color(255, 255, 255));
        txtRegistreringsDatum.setForeground(new java.awt.Color(0, 0, 0));
        txtRegistreringsDatum.setText("YYYY-MM-DD");
        txtRegistreringsDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistreringsDatumActionPerformed(evt);
            }
        });

        txtNamn.setBackground(new java.awt.Color(255, 255, 255));
        txtNamn.setForeground(new java.awt.Color(0, 0, 0));
        txtNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamnActionPerformed(evt);
            }
        });

        txtLosenord.setBackground(new java.awt.Color(255, 255, 255));
        txtLosenord.setForeground(new java.awt.Color(0, 0, 0));
        txtLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLosenordActionPerformed(evt);
            }
        });

        txtTelefonNr.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonNr.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefonNr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonNrActionPerformed(evt);
            }
        });

        btnRegistreraAlien.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistreraAlien.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistreraAlien.setText("Registrera Alien");
        btnRegistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAlienActionPerformed(evt);
            }
        });

        btnAvbryt.setBackground(new java.awt.Color(255, 255, 255));
        btnAvbryt.setForeground(new java.awt.Color(0, 0, 0));
        btnAvbryt.setText("Avbryt");
        btnAvbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvbrytActionPerformed(evt);
            }
        });

        lblRegistreringsDatum.setBackground(new java.awt.Color(153, 153, 153));
        lblRegistreringsDatum.setForeground(new java.awt.Color(153, 153, 153));
        lblRegistreringsDatum.setText("Välj ett datum för registrering:");

        lblNamn.setBackground(new java.awt.Color(153, 153, 153));
        lblNamn.setForeground(new java.awt.Color(153, 153, 153));
        lblNamn.setText("Välj ett namn:");

        lblLosenord.setBackground(new java.awt.Color(153, 153, 153));
        lblLosenord.setForeground(new java.awt.Color(153, 153, 153));
        lblLosenord.setText("Välj ett lösenord:");

        lblTelefonNr.setBackground(new java.awt.Color(153, 153, 153));
        lblTelefonNr.setForeground(new java.awt.Color(153, 153, 153));
        lblTelefonNr.setText("Välj ett telefonnumer:");

        lblPlats.setBackground(new java.awt.Color(153, 153, 153));
        lblPlats.setForeground(new java.awt.Color(153, 153, 153));
        lblPlats.setText("Välj platsen alien bor i:");

        cbxStad.setBackground(new java.awt.Color(255, 255, 255));
        cbxStad.setForeground(new java.awt.Color(0, 0, 0));
        cbxStad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj stad" }));
        cbxStad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxStadActionPerformed(evt);
            }
        });

        cbxRas.setBackground(new java.awt.Color(255, 255, 255));
        cbxRas.setForeground(new java.awt.Color(0, 0, 0));
        cbxRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj ras", "Boglodite", "Squid", "Worm" }));
        cbxRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRasActionPerformed(evt);
            }
        });

        lblRas.setBackground(new java.awt.Color(153, 153, 153));
        lblRas.setForeground(new java.awt.Color(153, 153, 153));
        lblRas.setText("Välj ras för alien:");

        txtAntalArmar.setBackground(new java.awt.Color(255, 255, 255));
        txtAntalArmar.setForeground(new java.awt.Color(0, 0, 0));
        txtAntalArmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAntalArmarActionPerformed(evt);
            }
        });

        lblAntalArmar.setBackground(new java.awt.Color(153, 153, 153));
        lblAntalArmar.setForeground(new java.awt.Color(153, 153, 153));
        lblAntalArmar.setText("Välj antal armar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPlats)
                    .addComponent(lblLosenord)
                    .addComponent(lblNamn)
                    .addComponent(lblRegistreringsDatum)
                    .addComponent(lblRegistreraAlien)
                    .addComponent(lblTelefonNr)
                    .addComponent(txtRegistreringsDatum)
                    .addComponent(txtNamn)
                    .addComponent(txtTelefonNr)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btnAvbryt))
                    .addComponent(txtLosenord)
                    .addComponent(cbxStad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxRas, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRas))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAntalArmar)
                            .addComponent(txtAntalArmar))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblRegistreraAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRegistreringsDatum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegistreringsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLosenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTelefonNr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefonNr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRas)
                    .addComponent(lblAntalArmar))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxRas)
                    .addComponent(txtAntalArmar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxStad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistreraAlien)
                    .addComponent(btnAvbryt))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillComboBox() throws InfException {
        String query1 = "SELECT BENAMNING FROM PLATS";
        ArrayList<String> omrade = idb.fetchColumn(query1);
        for (String ettOmrade : omrade) {
            cbxStad.addItem(ettOmrade);
        }
        System.out.println(idb.fetchColumn(query1));

    }
    private void btnRegistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAlienActionPerformed
        // TODO add your handling code here
        String losenord = txtLosenord.getText();
        String alienNamn = txtNamn.getText();
        String valdStad = cbxStad.getSelectedItem().toString();
        String datum = txtRegistreringsDatum.getText();
        String teleNr = txtTelefonNr.getText();
        String anvandare = "SELECT AGENT_ID FROM AGENT WHERE NAMN = '" + anvandarnamn + "'";
        String query = "SELECT NAMN FROM ALIEN";
        String fragaID = "";

        try {
            fragaID = idb.getAutoIncrement("Alien", "Alien_ID");
            int staden = Integer.parseInt(idb.fetchSingle("SELECT PLATS_ID FROM PLATS WHERE BENAMNING = '" + valdStad + "'"));
            int anvandarID = Integer.parseInt(idb.fetchSingle(anvandare));
            System.out.println(anvandarID);
            ArrayList<String> listaAliens = idb.fetchColumn(query);
            System.out.println(listaAliens);

            int i = 0;
            boolean isFound = false;

            while (isFound == false && i < listaAliens.size()) {
                if (listaAliens.get(i).equals(alienNamn)) {
                    isFound = true;
                    JOptionPane.showMessageDialog(null, "Namnet finns redan registrerat");
                } else {
                    i++;
                }
            }
            if (isFound == false) {
                idb.insert("INSERT INTO ALIEN (ALIEN_ID, REGISTRERINGSDATUM, LOSENORD, NAMN, TELEFON, PLATS, ANSVARIG_AGENT)"
                        + "VALUES(" + fragaID + "," + "'"
                        + datum + "'," + "'"
                        + losenord + "'," + "'"
                        + alienNamn + "'," + "'"
                        + teleNr + "'," + "'"
                        + staden + "'," + "'"
                        + anvandarID + "')");
                JOptionPane.showMessageDialog(null, "Alien är registrerad");

            }

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        int i = cbxRas.getSelectedIndex();
        switch (i) {
            case 1: {
                try {
                    int antalBoogies = Integer.parseInt(txtAntalArmar.getText());
                    idb.insert("INSERT INTO BOGLODITE (ALIEN_ID, ANTAL_BOOGIES)"
                            + "VALUES(" + fragaID + "," + "'"
                            + antalBoogies + "')");
                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            }
            case 2: {
                try {
                    int antalArmar = Integer.parseInt(txtAntalArmar.getText());
                    idb.insert("INSERT INTO SQUID (ALIEN_ID, ANTAL_ARMAR)"
                            + "VALUES(" + fragaID + "," + "'"
                            + antalArmar + "')");

                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            }
            case 3: {
                try {
                    idb.insert("INSERT INTO WORM (ALIEN_ID)"
                            + "VALUES(" + fragaID + ")");

                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            }

        }


    }//GEN-LAST:event_btnRegistreraAlienActionPerformed

    private void txtRegistreringsDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistreringsDatumActionPerformed
        // TODO add your handling code here:
        txtRegistreringsDatum.setText("");
    }//GEN-LAST:event_txtRegistreringsDatumActionPerformed

    private void cbxRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRasActionPerformed
        // TODO add your handling code here:
        int i = cbxRas.getSelectedIndex();
        switch (i) {
            case 0:
                txtAntalArmar.setVisible(false);
                lblAntalArmar.setVisible(false);
            case 1:
                txtAntalArmar.setVisible(true);
                lblAntalArmar.setVisible(true);
                break;
            case 2:
                txtAntalArmar.setVisible(true);
                lblAntalArmar.setVisible(true);
                break;
            case 3:
                txtAntalArmar.setVisible(false);
                lblAntalArmar.setVisible(false);
                break;

        }
    }//GEN-LAST:event_cbxRasActionPerformed

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnAvbrytActionPerformed

    private void txtNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamnActionPerformed

    private void txtLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLosenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLosenordActionPerformed

    private void txtTelefonNrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonNrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonNrActionPerformed

    private void txtAntalArmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAntalArmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAntalArmarActionPerformed

    private void cbxStadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxStadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxStadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RegistreraAlien(anvandarnamn, idb).setVisible(true);
                } catch (InfException ex) {
                    Logger.getLogger(RegistreraAlien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnRegistreraAlien;
    private javax.swing.JComboBox<String> cbxRas;
    private javax.swing.JComboBox<String> cbxStad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAntalArmar;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblPlats;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblRegistreraAlien;
    private javax.swing.JLabel lblRegistreringsDatum;
    private javax.swing.JLabel lblTelefonNr;
    private javax.swing.JTextField txtAntalArmar;
    private javax.swing.JTextField txtLosenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtRegistreringsDatum;
    private javax.swing.JTextField txtTelefonNr;
    // End of variables declaration//GEN-END:variables
}
