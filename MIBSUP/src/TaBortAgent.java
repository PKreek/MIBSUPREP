
import java.util.ArrayList;
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
        vilkenAgent = new javax.swing.JTextField();
        Konfirmera = new javax.swing.JButton();
        lblTaBortAgent = new javax.swing.JLabel();
        btnAvbryt = new javax.swing.JButton();
        cbxAllaAgenter = new javax.swing.JComboBox<>();
        lblVilkenAgent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 31, 31));

        labelText.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        labelText.setForeground(new java.awt.Color(153, 153, 153));
        labelText.setText("Ange namn för den agent du vill ta bort:");

        vilkenAgent.setBackground(new java.awt.Color(255, 255, 255));
        vilkenAgent.setForeground(new java.awt.Color(0, 0, 0));

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

        lblVilkenAgent.setText("Vilken agent tar över ansvaret för alien?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(vilkenAgent, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Konfirmera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAvbryt)))
                        .addComponent(lblTaBortAgent))
                    .addComponent(labelText, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxAllaAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVilkenAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTaBortAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vilkenAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblVilkenAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxAllaAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Konfirmera)
                    .addComponent(btnAvbryt))
                .addContainerGap(74, Short.MAX_VALUE))
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

    private void KonfirmeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KonfirmeraActionPerformed
        //Utför borttagning av specificerad agent
        String deleteAgentAlienTabell = "";
        String deleteFalt = "";
        
        try {
            String agenten = vilkenAgent.getText().toString();
            String nyAgent = cbxAllaAgenter.getSelectedItem().toString();
            String query = "select Agent.Agent_ID from agent where Agent.Namn = '" + agenten + "'";
           String query1 = "select Agent_ID from agent where Namn = '" + agenten +"'";
           String query2 = "select agent_id from agent where namn = '" + nyAgent +"'";
            String id = idb.fetchSingle(query1);
            String id1 = idb.fetchSingle(query2);
            String id2 = idb.fetchSingle(query);
             deleteAgentAlienTabell = "update alien set ansvarig_agent = " +id1 +" where ansvarig_agent =" + id + "";
             deleteFalt = "delete from faltagent where agent_id =" + id + "";
            if (id2 == null) {
                System.out.println("Fel inmatning");
                System.out.println(id);
                System.out.println(query1);
            } else {
                 
                idb.update(deleteAgentAlienTabell);
                  
                idb.delete(deleteFalt);
                  String deleteInneharFordon = "delete from innehar_fordon where agent_id =" + id + "";
                idb.delete(deleteInneharFordon);
                  String deleteInneharUtrustning = "delete from innehar_utrustning where agent_id =" +id + "";
                idb.delete(deleteInneharUtrustning);
                  String deleteKontorschef = "delete from kontorschef where agent_id =" + id + "";
                idb.delete(deleteKontorschef);
                  String deleteOmrade = "delete from omradeschef where agent_id =" + id + "";
                idb.delete(deleteOmrade);
                 String deleteQuery = "delete from agent where namn ='" + agenten + "'";
                idb.delete(deleteQuery);
                 
            }

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Fel namn " + ex);
            System.out.println(deleteAgentAlienTabell);
            System.out.println(deleteFalt);
        }
    }//GEN-LAST:event_KonfirmeraActionPerformed
    public void fyllVarde() throws InfException
    //Fyller combobox med alla agenter som finns i databasen
    {
       String query ="select namn from agent";
       ArrayList<String> listan;
       
       listan = idb.fetchColumn(query);
       for (String enLista: listan)
       {
           cbxAllaAgenter.addItem(enLista);
       }
       
    }
    
    
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelText;
    private javax.swing.JLabel lblTaBortAgent;
    private javax.swing.JLabel lblVilkenAgent;
    private javax.swing.JTextField vilkenAgent;
    // End of variables declaration//GEN-END:variables
}
