
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

        btnSattAdmin.setText("Sätt admin");
        btnSattAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSattAdminActionPerformed(evt);
            }
        });

        btnTaBortUtr.setText("Ta bort utrustning");
        btnTaBortUtr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortUtrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(lblVälkommenAdmin)
                .addGap(97, 97, 97))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistreraAlien)
                    .addComponent(lblKontoOversikt)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnTaBortAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAndraLosen)
                        .addComponent(btnSattAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTaBortUtr))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblVälkommenAdmin)
                .addGap(26, 26, 26)
                .addComponent(lblKontoOversikt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistreraAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAndraLosen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTaBortAlien)
                .addGap(18, 18, 18)
                .addComponent(btnSattAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTaBortUtr)
                .addContainerGap(116, Short.MAX_VALUE))
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

    private void btnAndraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenActionPerformed
        // TODO add your handling code here:
        new ÄndraLösenord(anvandarnamn, losenord, idb, anvandare).setVisible(true);
    }//GEN-LAST:event_btnAndraLosenActionPerformed

    private void btnRegistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAlienActionPerformed
        try {
            // TODO add your handling code here:
            new RegistreraAlien(anvandarnamn, idb).setVisible(true);
        } catch (InfException ex) {
            Logger.getLogger(InloggadAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistreraAlienActionPerformed

    private void btnTaBortAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAlienActionPerformed
        new TaBortAlien(idb).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaBortAlienActionPerformed

    private void btnSattAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSattAdminActionPerformed
        try {        
            new SattAdmin(idb).setVisible(true);
// TODO add your handling code here:
        } catch (InfException ex) {
            Logger.getLogger(InloggadAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSattAdminActionPerformed

    private void btnTaBortUtrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortUtrActionPerformed
        try {
            new TaBortUtrustning(idb).setVisible(true);
            
            // TODO add your handling code here:
        } catch (InfException ex) {
            Logger.getLogger(InloggadAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTaBortUtrActionPerformed

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
    private javax.swing.JButton btnAndraLosen;
    private javax.swing.JButton btnRegistreraAlien;
    private javax.swing.JButton btnSattAdmin;
    private javax.swing.JButton btnTaBortAlien;
    private javax.swing.JButton btnTaBortUtr;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblKontoOversikt;
    private javax.swing.JLabel lblVälkommenAdmin;
    // End of variables declaration//GEN-END:variables
}
