/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginandsignup;

import javax.swing.JOptionPane;

/**
 *
 * @author KengeLiam
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\KengeLiam\\Downloads\\123logo.jpg")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\KengeLiam\\Downloads\\12crosgirl.jpg")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\KengeLiam\\Downloads\\12classsdhed.jpg")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(93, 93, 115));
        jLabel4.setText("OPEN");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(101, 92, 92));
        jLabel5.setText("MON to SAT");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(101, 92, 92));
        jLabel6.setText("24 H");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\KengeLiam\\Downloads\\1solcrossfit.jpg")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\KengeLiam\\Downloads\\123gwapo.jpg")); // NOI18N

        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));

        jMenu1.setBackground(new java.awt.Color(51, 102, 255));
        jMenu1.setForeground(new java.awt.Color(51, 51, 51));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu (1).png"))); // NOI18N
        jMenu1.setText("NEW MEMBER");
        jMenu1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(51, 51, 51));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        jMenu2.setText("Update & Delete Members");
        jMenu2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/task.png"))); // NOI18N
        jMenu3.setText("List of Members");
        jMenu3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(51, 51, 51));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/visa.png"))); // NOI18N
        jMenu4.setText("Payment");
        jMenu4.setFocusable(false);
        jMenu4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu4);

        jMenu5.setForeground(new java.awt.Color(51, 51, 51));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        jMenu5.setText("Log out");
        jMenu5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu6.setForeground(new java.awt.Color(51, 51, 51));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        jMenu6.setText("Exit");
        jMenu6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(50, 50, 50)))
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
       int a= JOptionPane.showConfirmDialog(null,"Do you really want to Logout","Select",JOptionPane.YES_NO_OPTION);
       if (a==0)
       {
           setVisible(false);
           new Login ().setVisible(true);
       }
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        int a= JOptionPane.showConfirmDialog(null,"Do you really want to Exit","Select",JOptionPane.YES_NO_OPTION);
       if (a==0)
       {
           
          System.exit(0);
       }
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
      new Newmember().setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        new updatedeletemember().setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}