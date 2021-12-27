
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
public class ÄndraLösenord extends javax.swing.JFrame {

    private static String anvandarNamn;
    private static String losenord;
    private static String anvandare;
    private static InfDB idb;
    /**
     * Creates new form ÄndraLösenord
     */
    public ÄndraLösenord(String anvandarNamn, String losenord, InfDB idb, String anvandare) {
        initComponents();
        this.anvandarNamn = anvandarNamn;
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
        lblBytLosen = new javax.swing.JLabel();
        pswAktuelltLosen = new javax.swing.JPasswordField();
        pswNyttLosen = new javax.swing.JPasswordField();
        pswNyttLosenIgen = new javax.swing.JPasswordField();
        lblAktuelltLosen = new javax.swing.JLabel();
        lblNyttLosen = new javax.swing.JLabel();
        lblNyttLosenIgen = new javax.swing.JLabel();
        btnAvbryt = new javax.swing.JButton();
        btnAndraLosen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 31, 31));

        lblBytLosen.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        lblBytLosen.setForeground(new java.awt.Color(255, 255, 255));
        lblBytLosen.setText("Byt lösenord");

        pswAktuelltLosen.setBackground(new java.awt.Color(255, 255, 255));
        pswAktuelltLosen.setForeground(new java.awt.Color(0, 0, 0));

        pswNyttLosen.setBackground(new java.awt.Color(255, 255, 255));
        pswNyttLosen.setForeground(new java.awt.Color(0, 0, 0));

        pswNyttLosenIgen.setBackground(new java.awt.Color(255, 255, 255));
        pswNyttLosenIgen.setForeground(new java.awt.Color(0, 0, 0));

        lblAktuelltLosen.setBackground(new java.awt.Color(153, 153, 153));
        lblAktuelltLosen.setForeground(new java.awt.Color(153, 153, 153));
        lblAktuelltLosen.setText("Aktuellt lösenord:");

        lblNyttLosen.setBackground(new java.awt.Color(153, 153, 153));
        lblNyttLosen.setForeground(new java.awt.Color(153, 153, 153));
        lblNyttLosen.setText("Nytt lösenord:");

        lblNyttLosenIgen.setBackground(new java.awt.Color(153, 153, 153));
        lblNyttLosenIgen.setForeground(new java.awt.Color(153, 153, 153));
        lblNyttLosenIgen.setText("Upprepa det nya lösenordet:");

        btnAvbryt.setBackground(new java.awt.Color(255, 255, 255));
        btnAvbryt.setForeground(new java.awt.Color(0, 0, 0));
        btnAvbryt.setText("Avbryt");

        btnAndraLosen.setBackground(new java.awt.Color(255, 255, 255));
        btnAndraLosen.setForeground(new java.awt.Color(0, 0, 0));
        btnAndraLosen.setText("Ändra lösenord");
        btnAndraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNyttLosenIgen)
                    .addComponent(lblNyttLosen)
                    .addComponent(lblBytLosen)
                    .addComponent(lblAktuelltLosen)
                    .addComponent(pswNyttLosenIgen)
                    .addComponent(pswNyttLosen)
                    .addComponent(pswAktuelltLosen)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAndraLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAvbryt, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lblBytLosen)
                .addGap(21, 21, 21)
                .addComponent(lblAktuelltLosen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswAktuelltLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNyttLosen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNyttLosenIgen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswNyttLosenIgen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvbryt)
                    .addComponent(btnAndraLosen))
                .addContainerGap(54, Short.MAX_VALUE))
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

    private void btnAndraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenActionPerformed
        // TODO add your handling code here:
        String gammaltLosen = new String(pswAktuelltLosen.getPassword());
        String nyttLosen = new String(pswNyttLosen.getPassword());
        String nyttLosenIgen = new String(pswNyttLosenIgen.getPassword());
     
        if(anvandare.equals("Agent")){
            if(gammaltLosen.equals(losenord) && nyttLosen.equals(nyttLosenIgen) && nyttLosen != gammaltLosen && nyttLosen.length() <= 6){
            String query = "UPDATE AGENT SET LOSENORD = '" + nyttLosen + "' WHERE AGENT.NAMN = '" + anvandarNamn + "'";
            try {
                String hamtaLosen = idb.fetchSingle(query);
                System.out.println(hamtaLosen);
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            JOptionPane.showMessageDialog(null, "Lösenordet har bytts");
            }
        
        else if(nyttLosen != nyttLosenIgen && gammaltLosen.equals(losenord)){
            JOptionPane.showMessageDialog(null, "Nya lösenordet stämmer inte");
        }
        else{
            JOptionPane.showMessageDialog(null, "Det gamla lösenordet stämmer inte");
        }
        }   
        if(anvandare.equals("Alien")){
            if(gammaltLosen.equals(losenord) && nyttLosen.equals(nyttLosenIgen) && nyttLosen != gammaltLosen && nyttLosen.length() <= 6){
            String query2 = "UPDATE ALIEN SET LOSENORD = '" + nyttLosen + "' WHERE ALIEN.NAMN = '" + anvandarNamn + "'";
            try {
                String hamtaLosen2 = idb.fetchSingle(query2);
                System.out.println(hamtaLosen2);
            } catch (InfException ee) {
                JOptionPane.showMessageDialog(null, ee);
            }
            JOptionPane.showMessageDialog(null, "Lösenordet har bytts");
            }
        
        else if(nyttLosen != nyttLosenIgen && gammaltLosen.equals(losenord)){
            JOptionPane.showMessageDialog(null, "Nya lösenordet stämmer inte");
        }
        else{
            JOptionPane.showMessageDialog(null, "Det gamla lösenordet stämmer inte");
        }
        }
   
    }//GEN-LAST:event_btnAndraLosenActionPerformed

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
            java.util.logging.Logger.getLogger(ÄndraLösenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraLösenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraLösenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraLösenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ÄndraLösenord(anvandarNamn, losenord, idb, anvandare).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraLosen;
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAktuelltLosen;
    private javax.swing.JLabel lblBytLosen;
    private javax.swing.JLabel lblNyttLosen;
    private javax.swing.JLabel lblNyttLosenIgen;
    private javax.swing.JPasswordField pswAktuelltLosen;
    private javax.swing.JPasswordField pswNyttLosen;
    private javax.swing.JPasswordField pswNyttLosenIgen;
    // End of variables declaration//GEN-END:variables
}
