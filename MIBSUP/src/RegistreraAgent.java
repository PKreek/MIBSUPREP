
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public class RegistreraAgent extends javax.swing.JFrame {

    /**
     * Creates new form RegistreraAgent
     */
    private static InfDB idb;
    private static String datum;

    public RegistreraAgent(InfDB idb) throws InfException {
        initComponents();
        this.idb = idb;
        this.datum = datum();
        txtNamn.requestFocus();
        fyllVardeOmrade();
    }

    public void fyllVardeOmrade() throws InfException {
        String query = "SELECT BENAMNING FROM OMRADE";
        ArrayList<String> omrade = idb.fetchColumn(query);
        for (String ettOmrade : omrade) {
            cbxOmråde.addItem(ettOmrade);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cbxAdmin = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblRubrik = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        lblLösen = new javax.swing.JLabel();
        txtLosen = new javax.swing.JTextField();
        lblAnstallningsDatum = new javax.swing.JLabel();
        txtAnstallningsDatum = new javax.swing.JTextField();
        lblTelefon = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        lblAdmin = new javax.swing.JLabel();
        checkBox = new javax.swing.JCheckBox();
        lblValjOmrade = new javax.swing.JLabel();
        cbxOmråde = new javax.swing.JComboBox<>();
        btnÄndra = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 31, 31));

        lblRubrik.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        lblRubrik.setForeground(new java.awt.Color(255, 255, 255));
        lblRubrik.setText("Registrera ny agent");

        lblNamn.setForeground(new java.awt.Color(153, 153, 153));
        lblNamn.setText("Namn");

        txtNamn.setBackground(new java.awt.Color(255, 255, 255));
        txtNamn.setForeground(new java.awt.Color(0, 0, 0));
        txtNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamnActionPerformed(evt);
            }
        });

        lblLösen.setForeground(new java.awt.Color(153, 153, 153));
        lblLösen.setText("Ange lösen");

        txtLosen.setBackground(new java.awt.Color(255, 255, 255));
        txtLosen.setForeground(new java.awt.Color(0, 0, 0));

        lblAnstallningsDatum.setForeground(new java.awt.Color(153, 153, 153));
        lblAnstallningsDatum.setText("Anställningsdatum");

        txtAnstallningsDatum.setBackground(new java.awt.Color(255, 255, 255));
        txtAnstallningsDatum.setForeground(new java.awt.Color(0, 0, 0));
        txtAnstallningsDatum.setText("YYYY-MM-DD");
        txtAnstallningsDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnstallningsDatumActionPerformed(evt);
            }
        });

        lblTelefon.setForeground(new java.awt.Color(153, 153, 153));
        lblTelefon.setText("Telefon");

        txtTelefon.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefon.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonActionPerformed(evt);
            }
        });

        lblAdmin.setForeground(new java.awt.Color(153, 153, 153));
        lblAdmin.setText("Kommer hen vara admin?");

        checkBox.setBackground(new java.awt.Color(255, 255, 255));
        checkBox.setForeground(new java.awt.Color(255, 255, 255));
        checkBox.setText("Ja");
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });

        lblValjOmrade.setForeground(new java.awt.Color(153, 153, 153));
        lblValjOmrade.setText("Välj område");

        cbxOmråde.setBackground(new java.awt.Color(255, 255, 255));
        cbxOmråde.setForeground(new java.awt.Color(0, 0, 0));
        cbxOmråde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOmrådeActionPerformed(evt);
            }
        });

        btnÄndra.setBackground(new java.awt.Color(255, 255, 255));
        btnÄndra.setForeground(new java.awt.Color(0, 0, 0));
        btnÄndra.setText("Registrera");
        btnÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnÄndra, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnAvbryt))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLösen, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAnstallningsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAnstallningsDatum, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addComponent(txtNamn)
                        .addComponent(txtLosen)
                        .addComponent(txtTelefon)
                        .addComponent(cbxOmråde, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAnstallningsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnstallningsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLösen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTelefon)
                .addGap(4, 4, 4)
                .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBox)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnÄndra)
                    .addComponent(btnAvbryt))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnstallningsDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnstallningsDatumActionPerformed
        txtAnstallningsDatum.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnstallningsDatumActionPerformed

    private void txtNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamnActionPerformed

    private void txtTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonActionPerformed

    private void cbxOmrådeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOmrådeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxOmrådeActionPerformed

    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxActionPerformed

    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed

        String namn = txtNamn.getText();
        String telefonnummer = txtTelefon.getText();
        String losen = txtLosen.getText();
        String datum = txtAnstallningsDatum.getText();
        String hamtaNamn = txtNamn.getText();
        String query = "SELECT * FROM AGENT where namn = '" + hamtaNamn + "'";
        String omradet = (String) cbxOmråde.getSelectedItem();
        String admin = "N";
        try {
            if (checkBox.isSelected()) {
                admin = "J";
            }

            String omradeID = idb.fetchSingle("Select omrades_ID from omrade where benamning = '" + omradet + "'");
            String fragaID = idb.getAutoIncrement("Agent", "Agent_ID");
            String ettNamn = idb.fetchSingle(query);

            if (ettNamn != null) {
                System.out.println("Namnet finns redan");
            } else {
                idb.insert("Insert into Agent(Agent_id, namn, telefon, anstallningsdatum, administrator, losenord, omrade)"
                        + "values(" + fragaID + ",'"
                        + namn + "'," + "'"
                        + telefonnummer + "'," + "'"
                        + datum + "'," + "'"
                        + admin + "'," + "'"
                        + losen + "',"
                        + omradeID + ");");

            }
            System.out.println(telefonnummer);
            System.out.println(losen);
            System.out.println(datum);
            System.out.println(query);
            System.out.println(omradet);
            System.out.println(admin);
            System.out.println(ettNamn);
            System.out.println(hamtaNamn);

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Fel namn " + ex);
        }

//
//        try {
//            
//            
//           String omradeID = idb.fetchSingle("Select omrade_ID from omrade where benamning = '" + omradet + "'");
//            String fragaID = idb.getAutoIncrement("Agent", "Agent_ID");
//           ArrayList<String> listaAgent = idb.fetchColumn(query);
//            boolean isFound = false;
//            System.out.print(listaAgent);
//
//            while (isFound == false && i < listaAgent.size()) {
//                if (listaAgent.get(i).equals(namn)) {
//                    isFound = true;
//                    JOptionPane.showMessageDialog(null, "Namnet finns redan registrerat");
//                } else {
//                    i++;
//                }
//            }
//            if (isFound == true) {
//                idb.insert("Insert into Agent(Agent_id, namn, telefon, anstallningsdatum, administrator, losenord, omrade)"
//                        + "values(" + fragaID + ","
//                        + namn + "," + "'"
//                        + telefonnummer + "'," + "'"
//                        + datum + "'," + "'"
//                        + admin + "'," + "'"
//                        + losen + "',"
//                        + omradeID + ");");
//                
//
//              
//            }
//            
//// TODO add your handling code here:
//        } catch (InfException ex) {
//            Logger.getLogger(RegistreraAgent.class.getName()).log(Level.SEVERE, null, ex);
//             System.out.println(namn);
//                System.out.println(telefonnummer);
//                System.out.println(losen);
//                System.out.println(datum);
//                System.out.println(query);
//                System.out.println(omradet);
//                System.out.println(admin);
//                System.out.println(listaAgent);
//        }
    }//GEN-LAST:event_btnÄndraActionPerformed

    private String datum() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        this.datum = dateFormat.format(date);
        txtAnstallningsDatum.setText(datum);
        return datum;
    }

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnÄndra;
    private javax.swing.JComboBox<String> cbxAdmin;
    private javax.swing.JComboBox<String> cbxOmråde;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblAnstallningsDatum;
    private javax.swing.JLabel lblLösen;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblValjOmrade;
    private javax.swing.JTextField txtAnstallningsDatum;
    private javax.swing.JTextField txtLosen;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables

}
