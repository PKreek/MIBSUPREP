
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
 * @author nikla
 */
public class SattAdmin extends javax.swing.JFrame {

     private final InfDB idb;
     
    public SattAdmin(InfDB idb) throws InfException {
       this.idb = idb;
        initComponents();
        fyllVarde();
    }

    private boolean okFunktion(){
        boolean ok = true;
        if(Validering.comboBox(cbxAgentNamn) == true){
            ok = false; 
            JOptionPane.showMessageDialog(null, "Välj en agent från listan");
        }
        return ok;
    }
    
    public void fyllVarde() throws InfException
    // Väljer ut agenter som inte har adminrätt och fyller comboboxen
    {
        String query = "select namn from agent where administrator = 'N'"; 
       ArrayList<String> lista = idb.fetchColumn(query);
       for(String agenterna: lista)
       {
          cbxAgentNamn.addItem(agenterna);
       }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        cbxAgentNamn = new javax.swing.JComboBox<>();
        btnConfirmera = new javax.swing.JButton();
        lblRegistreraAdmin = new javax.swing.JLabel();
        lblValjAgent = new javax.swing.JLabel();
        btnAvbryt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 31, 31));

        cbxAgentNamn.setBackground(new java.awt.Color(255, 255, 255));
        cbxAgentNamn.setForeground(new java.awt.Color(0, 0, 0));
        cbxAgentNamn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj agent" }));
        cbxAgentNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAgentNamnActionPerformed(evt);
            }
        });

        btnConfirmera.setBackground(new java.awt.Color(255, 255, 255));
        btnConfirmera.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirmera.setText("Registrera");
        btnConfirmera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmeraActionPerformed(evt);
            }
        });

        lblRegistreraAdmin.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        lblRegistreraAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistreraAdmin.setText("Registrera en ny administratör");

        lblValjAgent.setForeground(new java.awt.Color(153, 153, 153));
        lblValjAgent.setText("Välj agent att sätta till administratör:");

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
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValjAgent)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnConfirmera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAvbryt))
                    .addComponent(lblRegistreraAdmin)
                    .addComponent(cbxAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblRegistreraAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValjAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmera)
                    .addComponent(btnAvbryt))
                .addContainerGap(73, Short.MAX_VALUE))
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

    private void btnConfirmeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmeraActionPerformed
          //Ändrar adminrättigheter för vald agent 
          if(okFunktion() == true){
          String agenten = (String) cbxAgentNamn.getSelectedItem();
          String uppdatera = "UPDATE AGENT SET ADMINISTRATOR = '" + "J" + "'" + "WHERE AGENT.NAMN = '" + agenten + "'";
           try {
             String hamtaAdmin = idb.fetchSingle(uppdatera);
             JOptionPane.showMessageDialog(null, "Agenten är satt till administratör");
             System.out.println(agenten);
           System.out.println(hamtaAdmin);
         } catch (InfException ex) {
             Logger.getLogger(SattAdmin.class.getName()).log(Level.SEVERE, null, ex);
         }
          }
    }//GEN-LAST:event_btnConfirmeraActionPerformed

    private void cbxAgentNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAgentNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAgentNamnActionPerformed

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        // Stänger ner rutan
        dispose();
    }//GEN-LAST:event_btnAvbrytActionPerformed

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
            java.util.logging.Logger.getLogger(SattAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SattAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SattAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SattAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnConfirmera;
    private javax.swing.JComboBox<String> cbxAgentNamn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lblRegistreraAdmin;
    private javax.swing.JLabel lblValjAgent;
    // End of variables declaration//GEN-END:variables
}
