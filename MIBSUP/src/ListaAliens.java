
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
public class ListaAliens extends javax.swing.JFrame {

    private static InfDB idb;

    /**
     * Creates new form ListaAliens
     */
    public ListaAliens(InfDB idb) throws InfException {
        initComponents();
        this.idb = idb;
        fillComboBox();
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
        lblListaAliens = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaLista = new javax.swing.JTextArea();
        lblListaAliensPlats = new javax.swing.JLabel();
        lblListaAliensRas = new javax.swing.JLabel();
        lblListaAliensDatum = new javax.swing.JLabel();
        cbxListaAliensPlats = new javax.swing.JComboBox<>();
        cbxListaAliensRas = new javax.swing.JComboBox<>();
        btnSokAlienPlats = new javax.swing.JButton();
        btnSokAlienRas = new javax.swing.JButton();
        btnSokAlienDatum = new javax.swing.JButton();
        txtDatum1 = new javax.swing.JTextField();
        txtDatum2 = new javax.swing.JTextField();
        btnNollStall = new javax.swing.JButton();
        lblDatum1 = new javax.swing.JLabel();
        lblDatum2 = new javax.swing.JLabel();
        btnAvbryt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 31, 31));

        lblListaAliens.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        lblListaAliens.setForeground(new java.awt.Color(255, 255, 255));
        lblListaAliens.setText("Lista aliens");

        jScrollPane1.setAutoscrolls(true);

        txtAreaLista.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaLista.setColumns(20);
        txtAreaLista.setRows(5);
        txtAreaLista.setTabSize(2);
        jScrollPane1.setViewportView(txtAreaLista);

        lblListaAliensPlats.setBackground(new java.awt.Color(153, 153, 153));
        lblListaAliensPlats.setForeground(new java.awt.Color(153, 153, 153));
        lblListaAliensPlats.setText("Lista aliens från plats:");

        lblListaAliensRas.setBackground(new java.awt.Color(153, 153, 153));
        lblListaAliensRas.setForeground(new java.awt.Color(153, 153, 153));
        lblListaAliensRas.setText("Lista aliens av ras:");

        lblListaAliensDatum.setBackground(new java.awt.Color(153, 153, 153));
        lblListaAliensDatum.setForeground(new java.awt.Color(153, 153, 153));
        lblListaAliensDatum.setText("Lista aliens mellan datum:");

        cbxListaAliensPlats.setBackground(new java.awt.Color(255, 255, 255));
        cbxListaAliensPlats.setForeground(new java.awt.Color(0, 0, 0));
        cbxListaAliensPlats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj plats" }));

        cbxListaAliensRas.setBackground(new java.awt.Color(255, 255, 255));
        cbxListaAliensRas.setForeground(new java.awt.Color(0, 0, 0));
        cbxListaAliensRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj ras", "Boglodite", "Squid", "Worm" }));

        btnSokAlienPlats.setBackground(new java.awt.Color(255, 255, 255));
        btnSokAlienPlats.setForeground(new java.awt.Color(0, 0, 0));
        btnSokAlienPlats.setText("Sök");
        btnSokAlienPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokAlienPlatsActionPerformed(evt);
            }
        });

        btnSokAlienRas.setBackground(new java.awt.Color(255, 255, 255));
        btnSokAlienRas.setForeground(new java.awt.Color(0, 0, 0));
        btnSokAlienRas.setText("Sök");
        btnSokAlienRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokAlienRasActionPerformed(evt);
            }
        });

        btnSokAlienDatum.setBackground(new java.awt.Color(255, 255, 255));
        btnSokAlienDatum.setForeground(new java.awt.Color(0, 0, 0));
        btnSokAlienDatum.setText("Sök");
        btnSokAlienDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokAlienDatumActionPerformed(evt);
            }
        });

        txtDatum1.setBackground(new java.awt.Color(255, 255, 255));
        txtDatum1.setForeground(new java.awt.Color(0, 0, 0));
        txtDatum1.setText("YYYY-MM-DD");
        txtDatum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatum1ActionPerformed(evt);
            }
        });

        txtDatum2.setBackground(new java.awt.Color(255, 255, 255));
        txtDatum2.setForeground(new java.awt.Color(0, 0, 0));
        txtDatum2.setText("YYYY-MM-DD");
        txtDatum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatum2ActionPerformed(evt);
            }
        });

        btnNollStall.setBackground(new java.awt.Color(255, 255, 255));
        btnNollStall.setForeground(new java.awt.Color(0, 0, 0));
        btnNollStall.setText("Nollställ");
        btnNollStall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNollStallActionPerformed(evt);
            }
        });

        lblDatum1.setBackground(new java.awt.Color(153, 153, 153));
        lblDatum1.setForeground(new java.awt.Color(153, 153, 153));
        lblDatum1.setText("Första datumet:");

        lblDatum2.setBackground(new java.awt.Color(153, 153, 153));
        lblDatum2.setForeground(new java.awt.Color(153, 153, 153));
        lblDatum2.setText("Andra datumet:");

        btnAvbryt.setBackground(new java.awt.Color(255, 255, 255));
        btnAvbryt.setForeground(new java.awt.Color(0, 0, 0));
        btnAvbryt.setText("Avbryt");
        btnAvbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvbrytActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblListaAliens)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNollStall)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAvbryt))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxListaAliensPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSokAlienPlats)
                            .addComponent(lblListaAliensPlats))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxListaAliensRas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblListaAliensRas)
                            .addComponent(btnSokAlienRas))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblListaAliensDatum))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSokAlienDatum)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtDatum1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDatum2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblDatum2)
                                            .addComponent(lblDatum1))))))
                        .addContainerGap(47, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblListaAliens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblListaAliensRas)
                    .addComponent(lblListaAliensPlats)
                    .addComponent(lblListaAliensDatum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxListaAliensPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxListaAliensRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatum1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSokAlienPlats)
                    .addComponent(btnSokAlienRas)
                    .addComponent(txtDatum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatum2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSokAlienDatum)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNollStall)
                    .addComponent(btnAvbryt))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fillComboBox() throws InfException {
        String query = "SELECT BENAMNING FROM PLATS";
        ArrayList<String> omrade = idb.fetchColumn(query);
        for (String ettOmrade : omrade) {
            cbxListaAliensPlats.addItem(ettOmrade);
        }
        System.out.println(idb.fetchColumn(query));

    }

    private void btnSokAlienPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokAlienPlatsActionPerformed
        // TODO add your handling code here:
        txtAreaLista.setText("");

        String valdStad = cbxListaAliensPlats.getSelectedItem().toString();
        String query2 = "SELECT NAMN FROM Alien "
                + "JOIN PLATS ON ALIEN.PLATS = PLATS.PLATS_ID "
                + "WHERE BENAMNING = '" + valdStad + "'";
        System.out.println(query2);
        try {
            String textStad = cbxListaAliensPlats.getSelectedItem().toString();
            ArrayList<String> alienLista = idb.fetchColumn(query2);
            txtAreaLista.append("Namn från:\t" + textStad + ("\n"));
            for (String alienNamn : alienLista) {
                txtAreaLista.append(alienNamn + ("\n"));

                System.out.println(alienNamn);

            }

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }


    }//GEN-LAST:event_btnSokAlienPlatsActionPerformed

    private void btnNollStallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNollStallActionPerformed
        // TODO add your handling code here:
        txtAreaLista.setText("");
    }//GEN-LAST:event_btnNollStallActionPerformed

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnAvbrytActionPerformed

    private void txtDatum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatum1ActionPerformed
        // TODO add your handling code here:
        txtDatum1.setText("");
    }//GEN-LAST:event_txtDatum1ActionPerformed

    private void txtDatum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatum2ActionPerformed
        // TODO add your handling code here:
        txtDatum2.setText("");
    }//GEN-LAST:event_txtDatum2ActionPerformed

    private void btnSokAlienRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokAlienRasActionPerformed
        // TODO add your handling code here:
        txtAreaLista.setText("");
        int i = cbxListaAliensRas.getSelectedIndex();
        switch (i) {
            case 1: {
                try {
                    txtAreaLista.append("Namn från rasen: Boglodite\t" + ("\n"));
                    ArrayList<String> bogloditeRas = idb.fetchColumn("SELECT NAMN FROM ALIEN "
                            + "JOIN BOGLODITE ON ALIEN.ALIEN_ID = BOGLODITE.ALIEN_ID");
                    for (String alienNamn : bogloditeRas) {
                        txtAreaLista.append(alienNamn + ("\n"));
                    }

                } catch (InfException ex) {
                    JOptionPane.showMessageDialog(null, ex);

                }
                break;
            }
            case 2: {
                try {
                    txtAreaLista.append("Namn från rasen: Squid\t" + ("\n"));
                    ArrayList<String> squidRas = idb.fetchColumn("SELECT NAMN FROM ALIEN "
                            + "JOIN SQUID ON ALIEN.ALIEN_ID = SQUID.ALIEN_ID");
                    for (String alienNamn : squidRas) {
                        txtAreaLista.append(alienNamn + ("\n"));

                    }
                } catch (InfException ex) {
                    JOptionPane.showMessageDialog(null, ex);

                }
                break;
            }
            case 3: {
                txtAreaLista.append("Namn från rasen: Worm\t" + ("\n"));
                try {
                    ArrayList<String> wormRas = idb.fetchColumn("SELECT NAMN FROM ALIEN "
                            + "JOIN WORM ON ALIEN.ALIEN_ID = WORM.ALIEN_ID");
                    for (String alienNamn : wormRas) {
                        txtAreaLista.append(alienNamn + ("\n"));
                    }

                } catch (InfException ex) {
                    JOptionPane.showMessageDialog(null, ex);

                }
                break;

            }

        }

    }//GEN-LAST:event_btnSokAlienRasActionPerformed

    private void btnSokAlienDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokAlienDatumActionPerformed
        // TODO add your handling code here:
        txtAreaLista.setText("");
        String datum1 = txtDatum1.getText();
        String datum2 = txtDatum2.getText();
        String query = "SELECT ALIEN.NAMN FROM AlIEN WHERE REGISTRERINGSDATUM BETWEEN '" + datum1 + "'" + "AND'" + datum2 + "'";

        try {
            txtAreaLista.append("Aliens registrerade:\t" + ("\n"));
            ArrayList<String> datumLista = idb.fetchColumn(query);
            for(String datum : datumLista){
                txtAreaLista.append(datum + ("\n"));
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_btnSokAlienDatumActionPerformed

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
            java.util.logging.Logger.getLogger(ListaAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ListaAliens(idb).setVisible(true);
                } catch (InfException ex) {
                    Logger.getLogger(ListaAliens.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnNollStall;
    private javax.swing.JButton btnSokAlienDatum;
    private javax.swing.JButton btnSokAlienPlats;
    private javax.swing.JButton btnSokAlienRas;
    private javax.swing.JComboBox<String> cbxListaAliensPlats;
    private javax.swing.JComboBox<String> cbxListaAliensRas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDatum1;
    private javax.swing.JLabel lblDatum2;
    private javax.swing.JLabel lblListaAliens;
    private javax.swing.JLabel lblListaAliensDatum;
    private javax.swing.JLabel lblListaAliensPlats;
    private javax.swing.JLabel lblListaAliensRas;
    private javax.swing.JTextArea txtAreaLista;
    private javax.swing.JTextField txtDatum1;
    private javax.swing.JTextField txtDatum2;
    // End of variables declaration//GEN-END:variables
}
