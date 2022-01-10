
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
 * @author noahjarvback
 */
public class InloggadAdmin extends javax.swing.JFrame {

    private static String anvandarnamn;
    private static String losenord;
    private static String anvandare;
    private static InfDB idb;
    /**
     * Creates new form InloggadAdmin
     */
    public InloggadAdmin(String anvandarnamn, String losenord, InfDB idb, String anvandare) {
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

        jPanel2 = new javax.swing.JPanel();
        lblVälkommenAdmin = new javax.swing.JLabel();
        btnAndraLosen = new javax.swing.JButton();
        btnRegistreraAlien = new javax.swing.JButton();
        lblKontoOversikt = new javax.swing.JLabel();
        btnTaBortAlien = new javax.swing.JButton();
        btnSattAdmin = new javax.swing.JButton();
        btnTaBortUtr = new javax.swing.JButton();
        btnTaBortAgent = new javax.swing.JButton();
        btnSokAgent = new javax.swing.JButton();
        btnAndraInfoAlien = new javax.swing.JButton();
        btnRegistreraAgent = new javax.swing.JButton();
        btnSetOmradesChef = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnSetKontorschef = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(33, 31, 31));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lblVälkommenAdmin.setBackground(new java.awt.Color(255, 255, 255));
        lblVälkommenAdmin.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        lblVälkommenAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblVälkommenAdmin.setText("Välkommen Admin");

        btnAndraLosen.setBackground(new java.awt.Color(33, 31, 31));
        btnAndraLosen.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
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

        lblKontoOversikt.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        lblKontoOversikt.setForeground(new java.awt.Color(255, 255, 255));
        lblKontoOversikt.setText("Kontoöversikt");

        btnTaBortAlien.setBackground(new java.awt.Color(33, 31, 31));
        btnTaBortAlien.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        btnTaBortAlien.setForeground(new java.awt.Color(153, 153, 153));
        btnTaBortAlien.setText("Ta bort alien");
        btnTaBortAlien.setBorder(null);
        btnTaBortAlien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTaBortAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAlienActionPerformed(evt);
            }
        });

        btnSattAdmin.setBackground(new java.awt.Color(33, 31, 31));
        btnSattAdmin.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnSattAdmin.setForeground(new java.awt.Color(153, 153, 153));
        btnSattAdmin.setText("Sätt administratör");
        btnSattAdmin.setBorder(null);
        btnSattAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSattAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSattAdminActionPerformed(evt);
            }
        });

        btnTaBortUtr.setBackground(new java.awt.Color(33, 31, 31));
        btnTaBortUtr.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnTaBortUtr.setForeground(new java.awt.Color(153, 153, 153));
        btnTaBortUtr.setText("Ta bort utrustning");
        btnTaBortUtr.setBorder(null);
        btnTaBortUtr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTaBortUtr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortUtrActionPerformed(evt);
            }
        });

        btnTaBortAgent.setBackground(new java.awt.Color(33, 31, 31));
        btnTaBortAgent.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnTaBortAgent.setForeground(new java.awt.Color(153, 153, 153));
        btnTaBortAgent.setText("Ta bort agent");
        btnTaBortAgent.setBorder(null);
        btnTaBortAgent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTaBortAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAgentActionPerformed(evt);
            }
        });

        btnSokAgent.setBackground(new java.awt.Color(33, 31, 31));
        btnSokAgent.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnSokAgent.setForeground(new java.awt.Color(153, 153, 153));
        btnSokAgent.setText("Sök info om agent");
        btnSokAgent.setBorder(null);
        btnSokAgent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSokAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokAgentActionPerformed(evt);
            }
        });

        btnAndraInfoAlien.setBackground(new java.awt.Color(33, 31, 31));
        btnAndraInfoAlien.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnAndraInfoAlien.setForeground(new java.awt.Color(153, 153, 153));
        btnAndraInfoAlien.setText("Ändra information om en alien");
        btnAndraInfoAlien.setBorder(null);
        btnAndraInfoAlien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAndraInfoAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraInfoAlienActionPerformed(evt);
            }
        });

        btnRegistreraAgent.setBackground(new java.awt.Color(33, 31, 31));
        btnRegistreraAgent.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnRegistreraAgent.setForeground(new java.awt.Color(153, 153, 153));
        btnRegistreraAgent.setText("Registrera ny agent");
        btnRegistreraAgent.setBorder(null);
        btnRegistreraAgent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistreraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAgentActionPerformed(evt);
            }
        });

        btnSetOmradesChef.setBackground(new java.awt.Color(33, 31, 31));
        btnSetOmradesChef.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        btnSetOmradesChef.setForeground(new java.awt.Color(153, 153, 153));
        btnSetOmradesChef.setText("Ändra områdeschef");
        btnSetOmradesChef.setBorder(null);
        btnSetOmradesChef.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetOmradesChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetOmradesChefActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(33, 31, 31));
        jButton1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 153));
        jButton1.setText("Ändra information om en agent");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSetKontorschef.setBackground(new java.awt.Color(33, 31, 31));
        btnSetKontorschef.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        btnSetKontorschef.setForeground(new java.awt.Color(153, 153, 153));
        btnSetKontorschef.setText("Ändra kontorschef");
        btnSetKontorschef.setBorder(null);
        btnSetKontorschef.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetKontorschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetKontorschefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 94, Short.MAX_VALUE)
                                .addComponent(lblVälkommenAdmin))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblKontoOversikt)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(97, 97, 97))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTaBortUtr)
                        .addContainerGap(250, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTaBortAgent)
                            .addComponent(btnRegistreraAlien)
                            .addComponent(btnSetOmradesChef)
                            .addComponent(btnAndraInfoAlien)
                            .addComponent(btnAndraLosen)
                            .addComponent(btnRegistreraAgent)
                            .addComponent(jButton1)
                            .addComponent(btnSetKontorschef)
                            .addComponent(btnSokAgent))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTaBortAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSattAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblVälkommenAdmin)
                .addGap(18, 18, 18)
                .addComponent(lblKontoOversikt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistreraAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAndraInfoAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaBortAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistreraAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(3, 3, 3)
                .addComponent(btnSattAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaBortAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSokAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaBortUtr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSetOmradesChef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSetKontorschef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAndraLosen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            //Startar rutan där man kan ändra information om agenter
            new AndraInformationAgent(idb).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(InloggadAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSetOmradesChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetOmradesChefActionPerformed
        // Startar rutan där man kan ändra områdeschef
        new SetOmradeschef(idb).setVisible(true);
    }//GEN-LAST:event_btnSetOmradesChefActionPerformed

    private void btnRegistreraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAgentActionPerformed
        try {
            // Startar rautan där man kan registrera agenter
            new RegistreraAgent(idb).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(InloggadAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistreraAgentActionPerformed

    private void btnAndraInfoAlienActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        try {
            // Startar rutan där man kan ändra information om aliens
            new AndraInformationAlien(idb).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(InloggadAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }                                            

                                


    private void btnSokAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokAgentActionPerformed
        try {
            // Startar rutan där man kan söka information om agenter
            new SokInfoAgent(idb).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(InloggadAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSokAgentActionPerformed

    private void btnTaBortUtrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortUtrActionPerformed
        // Startar rutan där man kan ta bort utrustning
        try {
            new TaBortUtrustning(idb).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(InloggadAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTaBortUtrActionPerformed

    private void btnSattAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSattAdminActionPerformed
        //Startar rutan där man kan ge adminrättigheter till agenter
        try {
            new SattAdmin(idb).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(InloggadAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSattAdminActionPerformed

    private void btnTaBortAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAlienActionPerformed
        //Startar rutan där man tar bort aliens från systemet
        new TaBortAlien(idb).setVisible(true);
    }//GEN-LAST:event_btnTaBortAlienActionPerformed

    private void btnRegistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAlienActionPerformed
        // Startar rutan där man kan registrera aliens
        try {
            new RegistreraAlien(anvandarnamn, idb).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(InloggadAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistreraAlienActionPerformed

    private void btnAndraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenActionPerformed
        // Startar rutan där man kan ändra lösenord
        new AndraLosenord(anvandarnamn, losenord, idb, anvandare).setVisible(true);
    }//GEN-LAST:event_btnAndraLosenActionPerformed

    private void btnSetKontorschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetKontorschefActionPerformed
        // Startar rutan där man kan ändra kontorschef
        new setKontorschef(idb).setVisible(true);
    }//GEN-LAST:event_btnSetKontorschefActionPerformed

    private void btnTaBortAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAgentActionPerformed
        //Startar rutan där man kan ta bort agenter
        try {
            new TaBortAgent(idb).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(InloggadAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTaBortAgentActionPerformed

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
            java.util.logging.Logger.getLogger(InloggadAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InloggadAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InloggadAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InloggadAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InloggadAdmin(anvandarnamn, losenord, idb, anvandare).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraInfoAlien;
    private javax.swing.JButton btnAndraLosen;
    private javax.swing.JButton btnRegistreraAgent;
    private javax.swing.JButton btnRegistreraAlien;
    private javax.swing.JButton btnSattAdmin;
    private javax.swing.JButton btnSetKontorschef;
    private javax.swing.JButton btnSetOmradesChef;
    private javax.swing.JButton btnSokAgent;
    private javax.swing.JButton btnTaBortAgent;
    private javax.swing.JButton btnTaBortAlien;
    private javax.swing.JButton btnTaBortUtr;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblKontoOversikt;
    private javax.swing.JLabel lblVälkommenAdmin;
    // End of variables declaration//GEN-END:variables
}
