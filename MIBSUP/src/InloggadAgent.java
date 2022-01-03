
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author patrickkreek
 */
public class InloggadAgent extends javax.swing.JFrame {

    private static String anvandarnamn;
    private static String losenord;
    private static InfDB idb;
    private static String anvandare;
    /**
     * Creates new form InloggadAgent
     */
    public InloggadAgent(String anvandarnamn, String losenord, InfDB idb, String anvandare) {
        initComponents();
        this.anvandarnamn = anvandarnamn;
        this.losenord = losenord;
        this.idb = idb;
        this.anvandare = anvandare;
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
        lblVälkommenAgent = new javax.swing.JLabel();
        btnAndraLosen = new javax.swing.JButton();
        btnRegistreraAlien = new javax.swing.JButton();
        lblKontoÖversikt = new javax.swing.JLabel();
        btnListaAliens = new javax.swing.JButton();
        btnSokInformation = new javax.swing.JButton();
        btnRegistreraUtrustning = new javax.swing.JButton();
        btnÄndraAlien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 31, 31));

        lblVälkommenAgent.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        lblVälkommenAgent.setForeground(new java.awt.Color(255, 255, 255));
        lblVälkommenAgent.setText("Välkommen Agent");

        btnAndraLosen.setBackground(new java.awt.Color(33, 31, 31));
        btnAndraLosen.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnAndraLosen.setForeground(new java.awt.Color(153, 153, 153));
        btnAndraLosen.setText("Ändra lösenord");
        btnAndraLosen.setBorder(null);
        btnAndraLosen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAndraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenActionPerformed(evt);
            }
        });

        btnRegistreraAlien.setBackground(new java.awt.Color(33, 31, 31));
        btnRegistreraAlien.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnRegistreraAlien.setForeground(new java.awt.Color(153, 153, 153));
        btnRegistreraAlien.setText("Registrera ny alien");
        btnRegistreraAlien.setBorder(null);
        btnRegistreraAlien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAlienActionPerformed(evt);
            }
        });

        lblKontoÖversikt.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        lblKontoÖversikt.setForeground(new java.awt.Color(255, 255, 255));
        lblKontoÖversikt.setText("Kontoöversikt");

        btnListaAliens.setBackground(new java.awt.Color(33, 31, 31));
        btnListaAliens.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnListaAliens.setForeground(new java.awt.Color(153, 153, 153));
        btnListaAliens.setText("Listor av aliens");
        btnListaAliens.setBorder(null);
        btnListaAliens.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListaAliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaAliensActionPerformed(evt);
            }
        });

        btnSokInformation.setBackground(new java.awt.Color(33, 31, 31));
        btnSokInformation.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnSokInformation.setForeground(new java.awt.Color(153, 153, 153));
        btnSokInformation.setText("Sök fram information");
        btnSokInformation.setBorder(null);
        btnSokInformation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSokInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokInformationActionPerformed(evt);
            }
        });

        btnRegistreraUtrustning.setBackground(new java.awt.Color(33, 31, 31));
        btnRegistreraUtrustning.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnRegistreraUtrustning.setForeground(new java.awt.Color(153, 153, 153));
        btnRegistreraUtrustning.setText("Registrera utrustning");
        btnRegistreraUtrustning.setBorder(null);
        btnRegistreraUtrustning.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistreraUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraUtrustningActionPerformed(evt);
            }
        });

        btnÄndraAlien.setBackground(new java.awt.Color(33, 31, 31));
        btnÄndraAlien.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnÄndraAlien.setForeground(new java.awt.Color(153, 153, 153));
        btnÄndraAlien.setText("Ändra information om en alien");
        btnÄndraAlien.setBorder(null);
        btnÄndraAlien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnÄndraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraAlienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(lblVälkommenAgent))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblKontoÖversikt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegistreraAlien))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnListaAliens))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSokInformation))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegistreraUtrustning))
                    .addComponent(btnAndraLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnÄndraAlien)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblVälkommenAgent)
                .addGap(18, 18, 18)
                .addComponent(lblKontoÖversikt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistreraAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnÄndraAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSokInformation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListaAliens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistreraUtrustning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAndraLosen)
                .addContainerGap(129, Short.MAX_VALUE))
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

    private void btnRegistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAlienActionPerformed
        try {
            // TODO add your handling code here:
            new RegistreraAlien(anvandarnamn, idb).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(InloggadAgent.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnRegistreraAlienActionPerformed

    private void btnAndraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenActionPerformed
        // TODO add your handling code here:
        new ÄndraLösenord(anvandarnamn, losenord, idb, anvandare).setVisible(true);
    }//GEN-LAST:event_btnAndraLosenActionPerformed

    private void btnListaAliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaAliensActionPerformed
        try {
            // TODO add your handling code here:
            new ListaAliens(idb).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(InloggadAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListaAliensActionPerformed

    private void btnSokInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokInformationActionPerformed
        try {
            // TODO add your handling code here:
            new SökInformation(idb).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(InloggadAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSokInformationActionPerformed

    private void btnRegistreraUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraUtrustningActionPerformed
        // TODO add your handling code here:
        new RegistreraUtrustning(idb).setVisible(true);
    }//GEN-LAST:event_btnRegistreraUtrustningActionPerformed

    private void btnÄndraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraAlienActionPerformed
        // TODO add your handling code here:
        new ÄndraInformationAlien(idb).setVisible(true);
    }//GEN-LAST:event_btnÄndraAlienActionPerformed

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
            java.util.logging.Logger.getLogger(InloggadAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InloggadAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InloggadAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InloggadAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InloggadAgent(anvandarnamn, losenord, idb, anvandare).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraLosen;
    private javax.swing.JButton btnListaAliens;
    private javax.swing.JButton btnRegistreraAlien;
    private javax.swing.JButton btnRegistreraUtrustning;
    private javax.swing.JButton btnSokInformation;
    private javax.swing.JButton btnÄndraAlien;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblKontoÖversikt;
    private javax.swing.JLabel lblVälkommenAgent;
    // End of variables declaration//GEN-END:variables
}
