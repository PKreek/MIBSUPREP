
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
 * @author nikla
 */
public class SokInfoAgent extends javax.swing.JFrame {

    private final InfDB idb;

    /**
     * Creates new form SokInfoAgent
     */
    public SokInfoAgent(InfDB idb) throws InfException {
        this.idb = idb;
        initComponents();
        fyllVarde();
    }
    public void fyllVarde() throws InfException
    //Fyller comboboxen med agentnamn
    {
        String query = "select namn from agent";
         ArrayList<String> lista = idb.fetchColumn(query);
          for(String agenterna: lista)
       {
          cbxAgenten.addItem(agenterna);
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

        jPanel1 = new javax.swing.JPanel();
        cbxAgenten = new javax.swing.JComboBox<>();
        btnSok = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfon = new javax.swing.JTextArea();
        lblSokInformationAgent = new javax.swing.JLabel();
        lblValjAgent = new javax.swing.JLabel();
        btnAvbryt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 31, 31));

        cbxAgenten.setBackground(new java.awt.Color(255, 255, 255));
        cbxAgenten.setForeground(new java.awt.Color(0, 0, 0));
        cbxAgenten.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj agent" }));

        btnSok.setBackground(new java.awt.Color(255, 255, 255));
        btnSok.setForeground(new java.awt.Color(0, 0, 0));
        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        txtInfon.setBackground(new java.awt.Color(255, 255, 255));
        txtInfon.setColumns(20);
        txtInfon.setForeground(new java.awt.Color(0, 0, 0));
        txtInfon.setRows(5);
        txtInfon.setTabSize(2);
        jScrollPane1.setViewportView(txtInfon);

        lblSokInformationAgent.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        lblSokInformationAgent.setForeground(new java.awt.Color(255, 255, 255));
        lblSokInformationAgent.setText("Sök information om en agent");

        lblValjAgent.setForeground(new java.awt.Color(153, 153, 153));
        lblValjAgent.setText("Välj agent att söka fram information på:");

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
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAvbryt)
                    .addComponent(lblValjAgent)
                    .addComponent(cbxAgenten, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSokInformationAgent)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSok))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblSokInformationAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValjAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(cbxAgenten, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAvbryt)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean okFunktion(){
        boolean ok = true;
        if(Validering.comboBox(cbxAgenten) == true){
            ok = false; 
            JOptionPane.showMessageDialog(null, "Välj en agent från listan");
        }
        return ok;
    }
    
    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        //Utför sökning på vald agent i comboboxen
        if(okFunktion() == true){
        String agenten = (String) cbxAgenten.getSelectedItem();
        txtInfon.setText("");
         try {
        HashMap<String, String> listan = idb.fetchRow("SELECT * from agent join omrade on agent.omrade = omrade.omrades_ID where agent.namn='" + agenten+"'");
         txtInfon.append("Namnet:\t" + listan.get("Namn"));
         txtInfon.append("\nTelefonnumret:\t" + listan.get("Telefon"));
         txtInfon.append("\nAnställningsdatum:\t" + listan.get("Anstallningsdatum"));
         txtInfon.append("\nAdministratör?:\t" + listan.get("Administrator"));
         txtInfon.append("\nTillhör område:\t" + listan.get("Benamning"));
         
         
         
        } catch (InfException ex) {
            Logger.getLogger(SokInfoAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btnSokActionPerformed

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
            java.util.logging.Logger.getLogger(SokInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SokInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SokInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SokInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnSok;
    private javax.swing.JComboBox<String> cbxAgenten;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSokInformationAgent;
    private javax.swing.JLabel lblValjAgent;
    private javax.swing.JTextArea txtInfon;
    // End of variables declaration//GEN-END:variables

}
