
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
public class TaBortAgent extends javax.swing.JFrame {

    private final InfDB idb;

    /**
     * Creates new form TaBortAgent
     */
    public TaBortAgent(InfDB idb) throws InfException {
        this.idb = idb;
        initComponents();
        fyllVarde();
        lblVilkenAgent.setVisible(false);
        cbxAllaAgenter.setVisible(false);
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
        labelText = new javax.swing.JLabel();
        Konfirmera = new javax.swing.JButton();
        lblTaBortAgent = new javax.swing.JLabel();
        btnAvbryt = new javax.swing.JButton();
        cbxAllaAgenter = new javax.swing.JComboBox<>();
        lblVilkenAgent = new javax.swing.JLabel();
        cbxAngeAgent = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 31, 31));

        labelText.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        labelText.setForeground(new java.awt.Color(153, 153, 153));
        labelText.setText("Ange agenten du vill ta bort:");

        Konfirmera.setBackground(new java.awt.Color(255, 255, 255));
        Konfirmera.setForeground(new java.awt.Color(0, 0, 0));
        Konfirmera.setText("Ta bort");
        Konfirmera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KonfirmeraActionPerformed(evt);
            }
        });

        lblTaBortAgent.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        lblTaBortAgent.setForeground(new java.awt.Color(255, 255, 255));
        lblTaBortAgent.setText("Ta bort agent från systemet");

        btnAvbryt.setBackground(new java.awt.Color(255, 255, 255));
        btnAvbryt.setForeground(new java.awt.Color(0, 0, 0));
        btnAvbryt.setText("Avbryt");
        btnAvbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvbrytActionPerformed(evt);
            }
        });

        cbxAllaAgenter.setBackground(new java.awt.Color(255, 255, 255));
        cbxAllaAgenter.setForeground(new java.awt.Color(0, 0, 0));

        lblVilkenAgent.setBackground(new java.awt.Color(153, 153, 153));
        lblVilkenAgent.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblVilkenAgent.setForeground(new java.awt.Color(153, 153, 153));
        lblVilkenAgent.setText("Vilken agent tar över ansvaret för alien?");

        cbxAngeAgent.setBackground(new java.awt.Color(255, 255, 255));
        cbxAngeAgent.setForeground(new java.awt.Color(0, 0, 0));
        cbxAngeAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj agent:" }));
        cbxAngeAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAngeAgentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelText)
                    .addComponent(lblVilkenAgent)
                    .addComponent(cbxAllaAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Konfirmera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAvbryt))
                    .addComponent(lblTaBortAgent)
                    .addComponent(cbxAngeAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTaBortAgent)
                .addGap(18, 18, 18)
                .addComponent(labelText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxAngeAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVilkenAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxAllaAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Konfirmera)
                    .addComponent(btnAvbryt))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean okFunktion() {
        boolean ok = true;
        if (Validering.comboBox(cbxAngeAgent)) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Välj en agent från listan");
        }
        return ok;
    }

    private void KonfirmeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KonfirmeraActionPerformed
        //Utför borttagning av specificerad agent
        if (okFunktion() == true) {

            try {
                String agenten = cbxAngeAgent.getSelectedItem().toString();
                String nyAgent = cbxAllaAgenter.getSelectedItem().toString();

                String id = idb.fetchSingle("SELECT AGENT_ID FROM AGENT WHERE NAMN = '" + agenten + "'");
                String id1 = idb.fetchSingle("SELECT AGENT_ID FROM AGENT WHERE NAMN = '" + nyAgent + "'");

                String ansvarigAgent = idb.fetchSingle("SELECT ANSVARIG_AGENT FROM ALIEN WHERE ANSVARIG_AGENT = '" + id + "'");

                if(agenten.equals(nyAgent)){
                    JOptionPane.showMessageDialog(null, "Man kan inte välja samma agent som man vill ta bort!");
                }
                else if (ansvarigAgent != null) {
                    idb.update("UPDATE ALIEN SET ANSVARIG_AGENT = '" + id1 + "'" + "WHERE ANSVARIG_AGENT = '" + id + "'");
                    idb.delete("DELETE FROM FALTAGENT WHERE AGENT_ID = '" + id +"'");
                    idb.delete("DELETE FROM INNEHAR_FORDON WHERE AGENT_ID = '" + id + "'");
                    idb.delete("DELETE FROM INNEHAR_UTRUSTNING WHERE AGENT_ID = '" + id + "'");
                    idb.delete("DELETE FROM KONTORSCHEF WHERE AGENT_ID = '" + id + "'");
                    idb.delete("DELETE FROM OMRADESCHEF WHERE AGENT_ID = '" + id + "'");
                    idb.delete("DELETE FROM AGENT WHERE AGENT_ID = '" + id + "'");
                    JOptionPane.showMessageDialog(null, "Agenten är borttagen");
                }
                else{
                    idb.delete("DELETE FROM FALTAGENT WHERE AGENT_ID = '" + id +"'");
                    idb.delete("DELETE FROM INNEHAR_FORDON WHERE AGENT_ID = '" + id + "'");
                    idb.delete("DELETE FROM INNEHAR_UTRUSTNING WHERE AGENT_ID = '" + id + "'");
                    idb.delete("DELETE FROM KONTORSCHEF WHERE AGENT_ID = '" + id + "'");
                    idb.delete("DELETE FROM OMRADESCHEF WHERE AGENT_ID = '" + id + "'");
                    idb.delete("DELETE FROM AGENT WHERE AGENT_ID = '" + id + "'");
                    JOptionPane.showMessageDialog(null, "Agenten är borttagen");
                }
            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

    }//GEN-LAST:event_KonfirmeraActionPerformed

    public void fyllVarde() throws InfException //Fyller combobox med alla agenter som finns i databasen
    {
        String query = "SELECT NAMN FROM AGENT";
        ArrayList<String> listan;

        listan = idb.fetchColumn(query);
        for (String enLista : listan) {
            cbxAllaAgenter.addItem(enLista);
            cbxAngeAgent.addItem(enLista);
        }
    }


    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        // Stänger ner rutan
        dispose();
    }//GEN-LAST:event_btnAvbrytActionPerformed

    private void cbxAngeAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAngeAgentActionPerformed
        try {
            // TODO add your handling code here:
            String agenten = cbxAngeAgent.getSelectedItem().toString();
            String id = idb.fetchSingle("SELECT AGENT_ID FROM AGENT WHERE NAMN = '" + agenten + "'");
            String kollaAgent = idb.fetchSingle("SELECT ANSVARIG_AGENT FROM ALIEN WHERE ANSVARIG_AGENT  = '" + id + "'");

            if (kollaAgent != null) {
                lblVilkenAgent.setVisible(true);
                cbxAllaAgenter.setVisible(true);
            }

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_cbxAngeAgentActionPerformed

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
            java.util.logging.Logger.getLogger(TaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Konfirmera;
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JComboBox<String> cbxAllaAgenter;
    private javax.swing.JComboBox<String> cbxAngeAgent;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelText;
    private javax.swing.JLabel lblTaBortAgent;
    private javax.swing.JLabel lblVilkenAgent;
    // End of variables declaration//GEN-END:variables
}
