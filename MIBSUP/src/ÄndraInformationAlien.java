
import java.util.ArrayList;
import java.util.HashMap;
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
public class ÄndraInformationAlien extends javax.swing.JFrame {

    private static InfDB idb;

    /**
     * Creates new form ÄndraInformationAlien
     */
    public ÄndraInformationAlien(InfDB idb) throws InfException {
        initComponents();
        this.idb = idb;
        fillComboBoxPlats();
        fillComboBoxAgent();
        lblAntal.setVisible(false);
        txtAntalAB.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAngeAndring = new javax.swing.JPanel();
        lblÄndraInformation = new javax.swing.JLabel();
        txtAngeDatum = new javax.swing.JTextField();
        lblRegDatum = new javax.swing.JLabel();
        btnAndra = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();
        lblAngeAlien = new javax.swing.JLabel();
        txtAngeAlien = new javax.swing.JTextField();
        lblAlienNamn = new javax.swing.JLabel();
        txtAlienNamn = new javax.swing.JTextField();
        lblLosenord = new javax.swing.JLabel();
        txtLosenord = new javax.swing.JTextField();
        lblTelefon = new javax.swing.JLabel();
        txtTelefonnr = new javax.swing.JTextField();
        cbxPlats = new javax.swing.JComboBox<>();
        lblPlats = new javax.swing.JLabel();
        cbxAgent = new javax.swing.JComboBox<>();
        cbxRas = new javax.swing.JComboBox<>();
        lblAgent = new javax.swing.JLabel();
        lblRas = new javax.swing.JLabel();
        btnSokAlien = new javax.swing.JButton();
        txtAntalAB = new javax.swing.JTextField();
        lblAntal = new javax.swing.JLabel();
        lblFyll = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaLista = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAngeAndring.setBackground(new java.awt.Color(33, 31, 31));

        lblÄndraInformation.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        lblÄndraInformation.setForeground(new java.awt.Color(255, 255, 255));
        lblÄndraInformation.setText("Ändra information om en alien");

        txtAngeDatum.setBackground(new java.awt.Color(255, 255, 255));
        txtAngeDatum.setForeground(new java.awt.Color(0, 0, 0));
        txtAngeDatum.setText("YYYY-MM-DD");

        lblRegDatum.setForeground(new java.awt.Color(153, 153, 153));
        lblRegDatum.setText("Registreringsdatum:");

        btnAndra.setBackground(new java.awt.Color(255, 255, 255));
        btnAndra.setForeground(new java.awt.Color(0, 0, 0));
        btnAndra.setText("Ändra");
        btnAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraActionPerformed(evt);
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

        lblAngeAlien.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblAngeAlien.setForeground(new java.awt.Color(153, 153, 153));
        lblAngeAlien.setText("Ange namn på den alien du vill byta:");

        txtAngeAlien.setBackground(new java.awt.Color(255, 255, 255));
        txtAngeAlien.setForeground(new java.awt.Color(0, 0, 0));

        lblAlienNamn.setForeground(new java.awt.Color(153, 153, 153));
        lblAlienNamn.setText("Aliens namn:");

        txtAlienNamn.setBackground(new java.awt.Color(255, 255, 255));
        txtAlienNamn.setForeground(new java.awt.Color(0, 0, 0));

        lblLosenord.setForeground(new java.awt.Color(153, 153, 153));
        lblLosenord.setText("Lösenord:");

        txtLosenord.setBackground(new java.awt.Color(255, 255, 255));
        txtLosenord.setForeground(new java.awt.Color(0, 0, 0));

        lblTelefon.setForeground(new java.awt.Color(153, 153, 153));
        lblTelefon.setText("Telefonnummer:");

        txtTelefonnr.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonnr.setForeground(new java.awt.Color(0, 0, 0));

        cbxPlats.setBackground(new java.awt.Color(255, 255, 255));
        cbxPlats.setForeground(new java.awt.Color(0, 0, 0));
        cbxPlats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj plats:" }));

        lblPlats.setForeground(new java.awt.Color(153, 153, 153));
        lblPlats.setText("Välj plats:");

        cbxAgent.setBackground(new java.awt.Color(255, 255, 255));
        cbxAgent.setForeground(new java.awt.Color(0, 0, 0));
        cbxAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj agent:" }));

        cbxRas.setBackground(new java.awt.Color(255, 255, 255));
        cbxRas.setForeground(new java.awt.Color(0, 0, 0));
        cbxRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj ras:", "Boglodite", "Squid", "Worm" }));
        cbxRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRasActionPerformed(evt);
            }
        });

        lblAgent.setForeground(new java.awt.Color(153, 153, 153));
        lblAgent.setText("Välj ansvarig agent:");

        lblRas.setForeground(new java.awt.Color(153, 153, 153));
        lblRas.setText("Välj ras:");

        btnSokAlien.setBackground(new java.awt.Color(255, 255, 255));
        btnSokAlien.setForeground(new java.awt.Color(0, 0, 0));
        btnSokAlien.setText("Sök");
        btnSokAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokAlienActionPerformed(evt);
            }
        });

        txtAntalAB.setBackground(new java.awt.Color(255, 255, 255));
        txtAntalAB.setForeground(new java.awt.Color(0, 0, 0));

        lblAntal.setForeground(new java.awt.Color(153, 153, 153));
        lblAntal.setText("Antal armar/boogies:");

        lblFyll.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblFyll.setForeground(new java.awt.Color(153, 153, 153));
        lblFyll.setText("Fyll i alla fält:");

        txtAreaLista.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaLista.setColumns(20);
        txtAreaLista.setRows(4);
        txtAreaLista.setTabSize(2);
        jScrollPane1.setViewportView(txtAreaLista);

        javax.swing.GroupLayout lblAngeAndringLayout = new javax.swing.GroupLayout(lblAngeAndring);
        lblAngeAndring.setLayout(lblAngeAndringLayout);
        lblAngeAndringLayout.setHorizontalGroup(
            lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblAngeAndringLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblAngeAndringLayout.createSequentialGroup()
                        .addGroup(lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblÄndraInformation)
                            .addComponent(lblAngeAlien)
                            .addGroup(lblAngeAndringLayout.createSequentialGroup()
                                .addGroup(lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAngeAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFyll)
                                    .addComponent(lblAlienNamn)
                                    .addComponent(txtAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(lblAngeAndringLayout.createSequentialGroup()
                                        .addComponent(lblRegDatum)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblLosenord))
                                    .addComponent(btnSokAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(lblAngeAndringLayout.createSequentialGroup()
                                        .addGroup(lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAngeDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblAgent))
                                        .addGap(18, 18, 18)
                                        .addGroup(lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblRas)
                                            .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addGroup(lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefon)
                            .addComponent(txtTelefonnr, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(lblAngeAndringLayout.createSequentialGroup()
                        .addGroup(lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlats)
                            .addGroup(lblAngeAndringLayout.createSequentialGroup()
                                .addGroup(lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(lblAngeAndringLayout.createSequentialGroup()
                                        .addComponent(cbxPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(lblAngeAndringLayout.createSequentialGroup()
                                        .addComponent(btnAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAvbryt)))
                                .addGap(18, 18, 18)
                                .addGroup(lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAntal)
                                    .addComponent(cbxRas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAntalAB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        lblAngeAndringLayout.setVerticalGroup(
            lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblAngeAndringLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblÄndraInformation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAngeAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAngeAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSokAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFyll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlienNamn)
                    .addComponent(lblRegDatum)
                    .addComponent(lblLosenord)
                    .addComponent(lblTelefon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAngeDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonnr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlats)
                    .addComponent(lblAgent)
                    .addComponent(lblRas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxRas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAntal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblAngeAndringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAntalAB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAvbryt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAngeAndring, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAngeAndring, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillComboBoxPlats() throws InfException {
        String query = "SELECT BENAMNING FROM PLATS";
        ArrayList<String> omrade = idb.fetchColumn(query);
        for (String ettOmrade : omrade) {
            cbxPlats.addItem(ettOmrade);
            System.out.println(omrade);
        }
    }

    private void fillComboBoxAgent() throws InfException {
        String query = "SELECT AGENT.NAMN FROM AGENT";
        ArrayList<String> agent = idb.fetchColumn(query);
        for (String agentNamn : agent) {
            cbxAgent.addItem(agentNamn);
        }
    }

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnAvbrytActionPerformed

    private void btnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraActionPerformed
        // TODO add your handling code here:
        String alienNamn = txtAngeAlien.getText();
        String alienNytt = txtAlienNamn.getText();
        String datum = txtAngeDatum.getText();
        String losenord = txtLosenord.getText();
        String telefonNr = txtTelefonnr.getText();
        String valdPlats = cbxPlats.getSelectedItem().toString();
        String valdAgent = cbxAgent.getSelectedItem().toString();
        String valdRas = cbxRas.getSelectedItem().toString();

        try {
            idb.update("UPDATE ALIEN SET NAMN = '" + alienNytt + "'" + "WHERE ALIEN.NAMN = '" + alienNamn + "'");
            idb.update("UPDATE ALIEN SET REGISTRERINGSDATUM = '" + datum + "'" + "WHERE ALIEN.NAMN = '" + alienNamn + "'");
            idb.update("UPDATE ALIEN SET LOSENORD = '" + losenord + "'" + "WHERE ALIEN.NAMN ='" + alienNamn + "'");
            idb.update("UPDATE ALIEN SET TELEFON = '" + telefonNr + "'" + "WHERE ALIEN.NAMN = '" + alienNamn + "'");
            int agentID = Integer.parseInt(idb.fetchSingle("SELECT AGENT_ID FROM AGENT WHERE NAMN = '" + valdAgent + "'"));
            idb.update("UPDATE ALIEN SET ANSVARIG_AGENT = '" + agentID + "'" + "WHERE ALIEN.NAMN = '" + alienNamn + "'");
            int platsID = Integer.parseInt(idb.fetchSingle("SELECT PLATS_ID FROM PLATS WHERE BENAMNING = '" + valdPlats + "'"));
            idb.update("UPDATE ALIEN SET PLATS = '" + platsID + "'" + "WHERE ALIEN.NAMN = '" + alienNamn + "'");
            registreraRas();

            JOptionPane.showMessageDialog(null, "Alien har blivit uppdaterad");
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        sokAlien();
        
    }//GEN-LAST:event_btnAndraActionPerformed

    private void registreraRas() throws InfException {
        String alienNamn = txtAngeAlien.getText();
        int alienID = Integer.parseInt(idb.fetchSingle("SELECT ALIEN_ID FROM ALIEN WHERE NAMN = '" + alienNamn + "'"));
        System.out.println(alienID);
        int i = cbxRas.getSelectedIndex();

        try {
            switch (i) {
                case 1: {
                    String antal = txtAntalAB.getText();
                    idb.delete("DELETE FROM BOGLODITE WHERE ALIEN_ID = " + alienID);
                    idb.delete("DELETE FROM SQUID WHERE ALIEN_ID = " + alienID);
                    idb.delete("DELETE FROM WORM WHERE ALIEN_ID = " + alienID);
                    idb.insert("INSERT INTO BOGLODITE (ALIEN_ID, ANTAL_BOOGIES)" + "VALUES(" + alienID + "," + antal + ")");
                    break;
                }

                case 2: {
                    String antal = txtAntalAB.getText();
                    idb.delete("DELETE FROM BOGLODITE WHERE ALIEN_ID = " + alienID);
                    idb.delete("DELETE FROM SQUID WHERE ALIEN_ID = " + alienID);
                    idb.delete("DELETE FROM WORM WHERE ALIEN_ID = " + alienID);
                    idb.insert("INSERT INTO SQUID (ALIEN_ID, ANTAL_ARMAR)" + "VALUES(" + alienID + "," + antal + ")");
                    break;
                }
                case 3: {
                    idb.delete("DELETE FROM BOGLODITE WHERE ALIEN_ID = " + alienID);
                    idb.delete("DELETE FROM SQUID WHERE ALIEN_ID = " + alienID);
                    idb.delete("DELETE FROM WORM WHERE ALIEN_ID = " + alienID);
                    idb.insert("INSERT INTO WORM (ALIEN_ID)" + " VALUES(" + alienID + ")");
                    break;
                }
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }
    private void sokAlien(){
        txtAlienNamn.setText("");
        txtAngeDatum.setText("");
        txtLosenord.setText("");
        txtTelefonnr.setText("");
        
        
        String alienNamn = txtAngeAlien.getText();
      
        try {
            HashMap<String, String> lista = idb.fetchRow("SELECT AGENT.NAMN, BENAMNING FROM AGENT "
                    + "JOIN ALIEN ON ANSVARIG_AGENT = AGENT_ID "
                    + "JOIN PLATS ON PLATS = PLATS_ID "
                    + "WHERE ALIEN.NAMN = '" + alienNamn + "'");
            System.out.println(lista);     
            
            HashMap<String, String> aliens = idb.fetchRow("SELECT NAMN, REGISTRERINGSDATUM, LOSENORD, TELEFON FROM ALIEN "
                    + "WHERE NAMN = '" + alienNamn + "'");
            System.out.println(aliens);
            
            txtAlienNamn.setText(aliens.get("NAMN"));
            txtAngeDatum.setText(aliens.get("REGISTRERINGSDATUM"));
            txtLosenord.setText(aliens.get("LOSENORD"));
            txtTelefonnr.setText(aliens.get("TELEFON"));
            cbxAgent.setSelectedItem(lista.get("NAMN"));
            cbxPlats.setSelectedItem(lista.get("BENAMNING"));
            txtAreaLista.setText("");
            txtAreaLista.append("Namn:  " + aliens.get("NAMN") + "\n");
            txtAreaLista.append("Registreringsdatum:  " + aliens.get("REGISTRERINGSDATUM") + "\n");
            txtAreaLista.append("Lösenord:  "+ aliens.get("LOSENORD") + "\n");
            txtAreaLista.append("Telefonnummer:  " + aliens.get("TELEFON") + "\n");
            txtAreaLista.append("Ansvarig agent:  " + lista.get("NAMN") + "\n");
            txtAreaLista.append("Plats:  " + lista.get("BENAMNING"));
            
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
       
}


    private void btnSokAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokAlienActionPerformed
        // TODO add your handling code here:
        sokAlien();
    }//GEN-LAST:event_btnSokAlienActionPerformed

    private void cbxRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRasActionPerformed
        // TODO add your handling code here:
        int i = cbxRas.getSelectedIndex();
        switch (i) {
            case 0: {
                txtAntalAB.setVisible(false);
                lblAntal.setVisible(false);
                break;
            }
            case 1: {
                txtAntalAB.setVisible(true);
                lblAntal.setVisible(true);
                txtAntalAB.setText("Antal boogies:");
                break;
            }

            case 2: {
                txtAntalAB.setVisible(true);
                lblAntal.setVisible(true);
                txtAntalAB.setText("Antal armar:");
                break;
            }
            case 3: {
                txtAntalAB.setVisible(false);
                lblAntal.setVisible(false);
                break;
            }
        }
    }//GEN-LAST:event_cbxRasActionPerformed

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
            java.util.logging.Logger.getLogger(ÄndraInformationAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraInformationAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraInformationAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraInformationAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ÄndraInformationAlien(idb).setVisible(true);
                } catch (InfException ex) {
                    Logger.getLogger(ÄndraInformationAlien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndra;
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnSokAlien;
    private javax.swing.JComboBox<String> cbxAgent;
    private javax.swing.JComboBox<String> cbxPlats;
    private javax.swing.JComboBox<String> cbxRas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblAlienNamn;
    private javax.swing.JLabel lblAngeAlien;
    private javax.swing.JPanel lblAngeAndring;
    private javax.swing.JLabel lblAntal;
    private javax.swing.JLabel lblFyll;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblPlats;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblRegDatum;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblÄndraInformation;
    private javax.swing.JTextField txtAlienNamn;
    private javax.swing.JTextField txtAngeAlien;
    private javax.swing.JTextField txtAngeDatum;
    private javax.swing.JTextField txtAntalAB;
    private javax.swing.JTextArea txtAreaLista;
    private javax.swing.JTextField txtLosenord;
    private javax.swing.JTextField txtTelefonnr;
    // End of variables declaration//GEN-END:variables
}
